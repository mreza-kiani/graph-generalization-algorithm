package ca.ucalgary.cs.graph

import ca.ucalgary.cs.DEBUG_MODE
import ca.ucalgary.cs.algorithm.StructuralMatchingAlgorithm
import ca.ucalgary.cs.exceptions.IllegalEdgeException
import ca.ucalgary.cs.utils.areListsEqual
import ca.ucalgary.cs.utils.areListsSubset

open class Graph(val nodes: List<Node>, val edges: Map<Node, List<Edge>>) : EdgeVariableLeg {

    val edgeVariables = mutableListOf<EdgeVariable>()
    val nodeVariables = mutableListOf<NodeVariable>()

    private val parentsMapCache: MutableMap<Node, Set<Node>> = mutableMapOf()
    private val nodeIndexMapCache: MutableMap<Node, Int> = mutableMapOf()
    private val edgesMapCache: MutableMap<Node, List<Edge>> = mutableMapOf()

    init {
        val edgeNodes = edges.keys + edges.values.flatten().map { it.to }
        if (edgeNodes.any { !nodes.contains(it) })
            throw IllegalEdgeException()
    }

    override fun toString(): String {
        val graph = nodes
            .associateWith { edgesOf(it) }
            .map { (node, edges) -> node to edges.joinToString { it.toString() } }
            .joinToString("\n") { (node, edges) -> "${node.name} -> [$edges]" }
        return """
            |############################
            |$graph
            |############################
        """.trimMargin()
    }

    fun indexOf(node: Node) = nodeIndexMapCache.getOrPut(node) { nodes.indexOfFirst { node.isExactMatch(it) } }
    fun getLeaves() = nodes.filter { node -> edgesOf(node).isEmpty() }
    fun findParents(node: Node) = parentsMapCache.getOrPut(node) {
        edges.filter { (_, edges) -> edges.any { it.to.isExactMatch(node) } }.keys
    }

    fun edgesOf(node: Node) = if (node.code == null)
        edges[node] ?: edges.filter { (key, _) -> key == node }.values.flatten()
    else
        edgesMapCache.getOrPut(node) { edges.filter { (n, _) -> n.isExactMatch(node) }.values.flatten() }

    fun edgeVariablesOf(leg: EdgeVariableLeg) = edgeVariables.filter { it.has(leg) }
    fun edgeCounts(): Int = edges.values.sumOf { it.size }
    fun allInAndOutEdgesOf(node: Node) = edges.values.flatten().filter { edge -> edge.contain(node) }
    fun degreeOf(node: Node): Int = allInAndOutEdgesOf(node).size
    fun degreeOfMatchedNodes(node: Node): Int = getAllInAndOutNeighbors(node).filter { it.isCommon }.size
    private fun getAllInAndOutNeighbors(node: Node) =
        allInAndOutEdgesOf(node).map { edge -> if (edge.to.isExactMatch(node)) edge.from else edge.to }

    companion object {
        fun from(nodes: List<Node>, edges: Map<Node, List<Node>>) = Graph(
            nodes = nodes,
            edges = edges.map { (node, neighbors) ->
                node to neighbors.map { Edge(from = node, to = it) }
            }.toMap()
        )

        fun compare(graph1: Graph, graph2: Graph): Triple<Graph, Graph, Graph> {
            markCommonNodes(graph1, graph2)
            alterNamesOfSameNodes(graph1, graph2)
            // TODO: Change variable names based on the structural similarities and then we have a ordinary generalization algorithm.
            // TODO: Having a matching-threshold to ignore some of the similarities

            val commonNodes = graph1.nodes.filter { it in graph2.nodes }
            val commonEdges = mutableMapOf<Node, List<Edge>>()
            var totalSimilarityScore = 0.0

            val commonNodesEdgeVariables = mutableListOf<EdgeVariable>()
            commonNodes.forEach { commonNode ->
                val g1Edges = graph1.edgesOf(commonNode)
                val g2Edges = graph2.edgesOf(commonNode)

                val commonNeighbors = g2Edges.filter { it in g1Edges }
                commonEdges[commonNode] = commonNeighbors

                addEdgeVariablesBetweenCommonNodes(commonNode, commonNodes, g1Edges, g2Edges, commonNodesEdgeVariables)

                val all = (g2Edges.size + g1Edges.size).toDouble() / 2
                val nodeSimilarity = if (all != 0.0) commonNeighbors.size.toDouble() / all else 1.0
                totalSimilarityScore += nodeSimilarity
                if (DEBUG_MODE) {
                    println("${commonNode.name} -> #similarity: $nodeSimilarity")
                }
            }

            if (DEBUG_MODE) {
                (graph1.nodes + graph2.nodes).filter { it !in commonNodes }.forEach { node ->
                    println("${node.name} -> #similarity: 0.0 (NOT COMMON!)")
                }
            }

            println("############################")
            println("Similar Nodes Rate: ${commonNodes.size * 2.0 / (graph1.nodes.size + graph2.nodes.size)}")
            println("Similar Edges Rate: ${commonEdges.size * 2.0 / (graph1.edgeCounts() + graph2.edgeCounts())}")
            println("Common Graph #Similarity: ${if (commonNodes.isNotEmpty()) totalSimilarityScore / commonNodes.size else 0}")
            println("############################")

            val commonGraph = Graph(nodes = commonNodes, edges = commonEdges)
            commonGraph.edgeVariables.addAll(commonNodesEdgeVariables)

            val (graph1EdgeVariables, graph1LonelyNodeVariable) =
                graph1.extractNodeAndEdgeVariablesForSingleGraph(commonNodes, graphNumber = 1)
            val (graph2EdgeVariables, graph2LonelyNodeVariable) =
                graph2.extractNodeAndEdgeVariablesForSingleGraph(commonNodes, graphNumber = 2)

            val mergedEdgeVariables = mergeNodeAndEdgeVariables(graph1EdgeVariables, graph2EdgeVariables)
            val mergedLonelyNodeVariable = mergeLonelyNodeVariable(graph1LonelyNodeVariable, graph2LonelyNodeVariable)

            commonGraph.edgeVariables.addAll(mergedEdgeVariables)
            commonGraph.nodeVariables.addAll(mergedEdgeVariables.map { it.nodeVariableLeg() }.distinct())
            if (mergedLonelyNodeVariable != null)
                commonGraph.nodeVariables.add(mergedLonelyNodeVariable)

            val g1Diff = graph1 - commonGraph
            val g2Diff = graph2 - commonGraph

            return Triple(commonGraph, g1Diff, g2Diff)
        }

        private fun markCommonNodes(graph1: Graph, graph2: Graph) {
            graph1.nodes.filter { n1 -> graph2.nodes.any { n2 -> n1.isExactMatch(n2) } }.forEach { it.isCommon = true }
            graph2.nodes.filter { n2 -> graph1.nodes.any { n1 -> n1.isExactMatch(n2) } }.forEach { it.isCommon = true }
        }

        private fun alterNamesOfSameNodes(graph1: Graph, graph2: Graph) {
            StructuralMatchingAlgorithm.reset()
            do {
                StructuralMatchingAlgorithm.matchSimilarNodes(graph1, graph2, ignoreDraw = false)
            } while (StructuralMatchingAlgorithm.nodesMatchingHappened)
            StructuralMatchingAlgorithm.nodesMatchingHappened = false
//            do {
//                StructuralMatchingAlgorithm.matchSimilarNodes(graph1, graph2, ignoreDraw = true)
//            } while (StructuralMatchingAlgorithm.nodesMatchingHappened)
            StructuralMatchingAlgorithm.alterNameOfDifferentNodes(graph1, graph2)
        }

        private fun mergeLonelyNodeVariable(
            graph1LonelyNodeVariable: NodeVariable?,
            graph2LonelyNodeVariable: NodeVariable?
        ): NodeVariable? {
            return if (graph1LonelyNodeVariable != null && graph2LonelyNodeVariable != null)
                graph1LonelyNodeVariable.merge(graph2LonelyNodeVariable)
            else graph1LonelyNodeVariable ?: graph2LonelyNodeVariable
        }

        private fun addEdgeVariablesBetweenCommonNodes(
            commonNode: Node,
            commonNodes: List<Node>,
            g1Edges: List<Edge>,
            g2Edges: List<Edge>,
            commonNodesEdgeVariables: MutableList<EdgeVariable>,
        ) {
            val g1UncommonEdges = g1Edges.filter { it.to in commonNodes }.filter { it !in g2Edges }
            val g2UncommonEdges = g2Edges.filter { it.to in commonNodes }.filter { it !in g1Edges }

            fun addEdgeVariable(uncommonEdges: List<Edge>, graphNumber: Int) {
                uncommonEdges.forEach { uncommonEdge ->
                    val edgeVariable = commonNodesEdgeVariables.firstOrNull { it.has(commonNode, uncommonEdge.to) }
                        ?: EdgeVariable(name = EdgeVariable.getUniqueName(), leg1 = commonNode, leg2 = uncommonEdge.to)
                    edgeVariable.addEdge(edge = uncommonEdge, graphNumber = graphNumber)

                    if (edgeVariable !in commonNodesEdgeVariables)
                        commonNodesEdgeVariables.add(edgeVariable)
                }
            }

            addEdgeVariable(g1UncommonEdges, graphNumber = 1)
            addEdgeVariable(g2UncommonEdges, graphNumber = 2)
        }

        private fun mergeNodeAndEdgeVariables(
            graph1EdgeVariables: MutableList<EdgeVariable>,
            graph2EdgeVariables: MutableList<EdgeVariable>
        ): MutableList<EdgeVariable> {
            val edgeVariables = mutableListOf<EdgeVariable>()

            val graph1NeighborsMap = NodeVariable.extractNeighborsMap(graph1EdgeVariables)
            val graph2NeighborsMap = NodeVariable.extractNeighborsMap(graph2EdgeVariables)

            graph1NeighborsMap.forEach { (nodeVariable, neighbors) ->
                val graph2NodeVariable = graph2NeighborsMap.filter { (_, graph2Neighbors) ->
                    areListsSubset(neighbors, graph2Neighbors)
                }.keys.firstOrNull()
                if (graph2NodeVariable != null) {
                    val mergedNodeVariable = nodeVariable.merge(graph2NodeVariable)
                    EdgeVariable.updateNodeVariablesOf(graph1EdgeVariables, listOf(nodeVariable), mergedNodeVariable)
                    EdgeVariable.updateNodeVariablesOf(
                        graph2EdgeVariables,
                        listOf(graph2NodeVariable),
                        mergedNodeVariable
                    )

                    graph2NeighborsMap.remove(graph2NodeVariable)

                    edgeVariables.addAll(
                        EdgeVariable.merge(
                            graph1EdgeVariables = graph1EdgeVariables.filter { it.has(mergedNodeVariable) }
                                .toMutableList(),
                            graph2EdgeVariables = graph2EdgeVariables.filter { it.has(mergedNodeVariable) }
                                .toMutableList(),
                            commonNodeVariable = mergedNodeVariable
                        )
                    )
                } else {
                    edgeVariables.addAll(graph1EdgeVariables.filter { it.has(nodeVariable) })
                }
            }

            graph2NeighborsMap.forEach { (nodeVariable, _) ->
                edgeVariables.addAll(graph2EdgeVariables.filter { it.has(nodeVariable) })
            }

            return edgeVariables
        }

        fun reconstruct(commonGraph: Graph, diffGraph: Graph): Graph {
            val nodes = (commonGraph.nodes + diffGraph.nodes).distinct()
            val edges = nodes.associateWith { mutableListOf<Edge>() }.toMutableMap()

            edges.forEach { (node, neighbors) ->
                val commonEdges = commonGraph.edgesOf(node)
                val diffEdges = diffGraph.edgesOf(node)

                neighbors.addAll(commonEdges + diffEdges)
            }

            return Graph(nodes, edges)
        }

        fun reconstruct(generalizedGraph: Graph, graphNumber: Int): Graph {
            val nodes = (generalizedGraph.nodes + generalizedGraph.nodeVariables.flatMap { it.getNodes(graphNumber) })
                .distinct()
                .toMutableList()

            val edges = nodes.associateWith { mutableListOf<Edge>() }.toMutableMap()
            generalizedGraph.edges.forEach { (node, neighbors) -> edges[node]?.addAll(neighbors) }
            generalizedGraph.nodeVariables.forEach { nodeVariable ->
                nodeVariable.getGraph(graphNumber).edges.forEach { (node, neighbors) ->
                    edges[node]?.addAll(neighbors)
                }
            }

            generalizedGraph.edgeVariables.forEach { edgeVariable ->
                edgeVariable.getGraphEdges(graphNumber).forEach { (node, neighbors) ->
                    edges[node]?.addAll(neighbors)
                }
            }

            return Graph(nodes, edges)
        }
    }

    fun extractNodeCentrality(): Map<Node, Double> {
        val totalEdges = edgeCounts() + 2 * edgeVariables.size
        return (nodes.map { node ->
            node to (edgesOf(node).size + edgeVariables.filter { it.has(node) }.size).toDouble() / totalEdges
        } + nodeVariables.map { nodeVariable ->
            nodeVariable to edgeVariables.filter { it.has(nodeVariable) }.size.toDouble() / totalEdges
        }).sortedByDescending { (_, centrality) -> centrality }.toMap()
    }

    private fun extractNodeAndEdgeVariablesForSingleGraph(
        commonNodes: List<Node>,
        graphNumber: Int
    ): Pair<MutableList<EdgeVariable>, NodeVariable?> {
        val edgeVariables = mutableListOf<EdgeVariable>()

        val nodeVariablesMap = nodes
            .filter { it !in commonNodes }
            .associateWith { NodeVariable(name = "V-${it.name}", node = it, graphNumber = graphNumber) }
            .toMutableMap()

        edges.forEach { (node, edges) ->
            edges.forEach { edge ->
                if (node in commonNodes && edge.to in commonNodes) {
                    // Do nothing
                } else if (node in commonNodes || edge.to in commonNodes) {
                    val (n, nv) = if (node in commonNodes)
                        node to (nodeVariablesMap[edge.to] ?: error("There is no NodeVariable for ${edge.to}!"))
                    else
                        edge.to to (nodeVariablesMap[node] ?: error("There is no NodeVariable for $node!"))

                    val edgeVariable = edgeVariables.find { it.has(n, nv) }
                        ?: EdgeVariable(EdgeVariable.getUniqueName(), n, nv).also { edgeVariables.add(it) }
                    edgeVariable.addEdge(edge, graphNumber)
                } else {
                    val nodeVariable1 = nodeVariablesMap[node] ?: error("There is no NodeVariable for $node!")
                    val nodeVariable2 = nodeVariablesMap[edge.to] ?: error("There is no NodeVariable for ${edge.to}!")

                    val mergedNodeVariable = nodeVariable1.merge(nodeVariable2)
                    mergedNodeVariable.addEdge(edge, graphNumber)

                    (nodeVariable1.getGraph(graphNumber).nodes + nodeVariable2.getGraph(graphNumber).nodes)
                        .distinct()
                        .forEach { nodeVariablesMap[it] = mergedNodeVariable }

                    EdgeVariable.updateNodeVariablesOf(
                        edgeVariables,
                        previousVariables = listOf(nodeVariable1, nodeVariable2),
                        newVariable = mergedNodeVariable
                    )
                }
            }
        }

        val nodeVariablesInEdgeVariables = edgeVariables.map { it.nodeVariableLeg() }.distinct()
        val lonelyNodeVariables = nodeVariablesMap.values.filter { it !in nodeVariablesInEdgeVariables }
        val lonelyNodeVariable = if (lonelyNodeVariables.isNotEmpty())
            lonelyNodeVariables.fold(NodeVariable("Lonely")) { acc, new -> acc.merge(new) }
        else
            null

        val nodeVariablesNeighborMap = NodeVariable.extractNeighborsMap(edgeVariables)
        nodeVariablesNeighborMap.forEach { (node, neighbors) ->
            val similarNeighbors = nodeVariablesNeighborMap
                .filter { (key, _) -> key != node }
                .filter { (_, list) -> areListsEqual(list, neighbors) }
                .keys

            if (similarNeighbors.isNotEmpty()) {
                val toBeMergedList = (similarNeighbors + node).toList()
                val mergedNodeVariable =
                    toBeMergedList.fold(NodeVariable("Merged")) { acc, nv -> acc.merge(nv) }

                EdgeVariable.updateNodeVariablesOf(edgeVariables, toBeMergedList, mergedNodeVariable)
            }
        }

        EdgeVariable.removeDuplicates(edgeVariables)

        return edgeVariables to lonelyNodeVariable
    }

    private operator fun minus(otherGraph: Graph): Graph {
        val uncommonEdges = edges.map { (node, neighbors) ->
            node to (neighbors - otherGraph.edgesOf(node).toSet())
        }.toMap()
        val heads = uncommonEdges.values.flatten().map { it.to }.distinct()
        val tails = uncommonEdges.filter { (node, neighbors) ->
            neighbors.isNotEmpty() || node !in otherGraph.nodes
        }.keys
        val cleanedUncommonEdges = uncommonEdges.filter { (node, _) -> node in (heads + tails) }
        val lonelyNodes = nodes.filter { edgesOf(it).isEmpty() }.filter { it !in otherGraph.nodes }
        val diffGraph = Graph(nodes = (tails + heads + lonelyNodes).toList(), edges = cleanedUncommonEdges)
        diffGraph.nodes.filter { it in otherGraph.nodes }.forEach { it.isCommon = true }
        return diffGraph
    }

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Graph)
            return false

        if (!areListsEqual(nodes, other.nodes))
            return false

        if ((nodes + other.nodes).distinct().any { !areListsEqual(first = edgesOf(it), second = other.edgesOf(it)) })
            return false

        return true
    }

    override fun hashCode(): Int {
        var result = nodes.sortedBy { it.name }.sumOf { it.hashCode() }
        result = result * 31 * 31 + edges
            .toSortedMap(compareBy { it.name })
            .filter { (_, neighbors) -> neighbors.isNotEmpty() }
            .map { (node, neighbors) -> 31 * node.hashCode() + neighbors.sumOf { it.hashCode() } }
            .sum()
        return result
    }

    fun isSubGraphOf(other: Graph): Boolean {
        if (!nodes.all { it in other.nodes })
            return false

        edges.forEach { (node, neighbors) ->
            if (!neighbors.all { it in other.edgesOf(node) })
                return false
        }

        return true
    }

    fun simplifyNodeVariableNames() {
        for (i: Int in 0 until nodeVariables.size) {
            val nv = nodeVariables[i]
            val simplifiedNodeVariable = NodeVariable(name = NodeVariable.getUniqueName()).also {
                it.graph1 = nv.graph1
                it.graph2 = nv.graph2
            }
            EdgeVariable.updateNodeVariablesOf(edgeVariables, listOf(nv), simplifiedNodeVariable)
            nodeVariables[i] = simplifiedNodeVariable
        }
    }

}