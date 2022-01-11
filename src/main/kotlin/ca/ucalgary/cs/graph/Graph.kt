package ca.ucalgary.cs.graph

import ca.ucalgary.cs.exceptions.IllegalEdgeException
import ca.ucalgary.cs.utils.areListsEqual
import ca.ucalgary.cs.utils.areListsSubset

open class Graph(val nodes: List<Node>, val edges: Map<Node, List<Node>>) : EdgeVariableLeg {
    val edgeVariables = mutableListOf<EdgeVariable>()
    val nodeVariables = mutableListOf<NodeVariable>()

    init {
        val edgeNodes = edges.keys + edges.values.flatten()
        if (edgeNodes.any { !nodes.contains(it) })
            throw IllegalEdgeException()
    }

    override fun toString(): String {
        val graph = nodes
            .associateWith { edgesOf(it) }
            .map { (node, edges) -> node to edges.joinToString { it.name } }
            .joinToString("\n") { (node, edges) -> "${node.name} -> [$edges]" }
        return """
            |############################
            |$graph
            |############################
        """.trimMargin()
    }

    fun edgesOf(node: Node) = edges[node] ?: emptyList()
    fun edgeCounts(): Int = edges.values.sumOf { it.size }

    companion object {
        fun compare(graph1: Graph, graph2: Graph): Triple<Graph, Graph, Graph> {
            val commonNodes = graph1.nodes.filter { it in graph2.nodes }
            val commonEdges = mutableMapOf<Node, List<Node>>()
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
                println("${commonNode.name} -> #similarity: $nodeSimilarity")
            }

            (graph1.nodes + graph2.nodes).filter { it !in commonNodes }.forEach { node ->
                println("${node.name} -> #similarity: 0.0 (NOT COMMON!)")
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
            g1Edges: List<Node>,
            g2Edges: List<Node>,
            commonNodesEdgeVariables: MutableList<EdgeVariable>,
        ) {
            val g1UncommonNeighbors = g1Edges.filter { it in commonNodes }.filter { it !in g2Edges }
            val g2UncommonNeighbors = g2Edges.filter { it in commonNodes }.filter { it !in g1Edges }

            fun addEdgeVariable(uncommonNeighbors: List<Node>, graphNumber: Int) {
                uncommonNeighbors.forEach { uncommonNeighbor ->
                    val edgeVariable = commonNodesEdgeVariables.firstOrNull { it.has(commonNode, uncommonNeighbor) }
                        ?: EdgeVariable(name = EdgeVariable.getUniqueName(), leg1 = commonNode, leg2 = uncommonNeighbor)
                    edgeVariable.addEdge(tail = commonNode, head = uncommonNeighbor, graphNumber = graphNumber)

                    if (edgeVariable !in commonNodesEdgeVariables)
                        commonNodesEdgeVariables.add(edgeVariable)
                }
            }

            addEdgeVariable(g1UncommonNeighbors, graphNumber = 1)
            addEdgeVariable(g2UncommonNeighbors, graphNumber = 2)
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
                    EdgeVariable.updateNodeVariablesOf(graph2EdgeVariables, listOf(graph2NodeVariable), mergedNodeVariable)

                    graph2NeighborsMap.remove(graph2NodeVariable)

                    edgeVariables.addAll(
                        EdgeVariable.merge(
                            graph1EdgeVariables = graph1EdgeVariables.filter { it.has(mergedNodeVariable) }.toMutableList(),
                            graph2EdgeVariables = graph2EdgeVariables.filter { it.has(mergedNodeVariable) }.toMutableList(),
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
            val edges = nodes.associateWith { mutableListOf<Node>() }.toMutableMap()

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

            val edges = nodes.associateWith { mutableListOf<Node>() }.toMutableMap()
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
            edges.forEach { neighbor ->
                if (node in commonNodes && neighbor in commonNodes) {
                    // Do nothing
                } else if (node in commonNodes || neighbor in commonNodes) {
                    val (n, nv) = if (node in commonNodes)
                        node to (nodeVariablesMap[neighbor] ?: error("There is no NodeVariable for $neighbor!"))
                    else
                        neighbor to (nodeVariablesMap[node] ?: error("There is no NodeVariable for $node!"))

                    val edgeVariable = edgeVariables.find { it.has(n, nv) }
                        ?: EdgeVariable(EdgeVariable.getUniqueName(), n, nv).also { edgeVariables.add(it) }
                    edgeVariable.addEdge(tail = node, head = neighbor, graphNumber = graphNumber)
                } else {
                    val nodeVariable1 = nodeVariablesMap[node] ?: error("There is no NodeVariable for $node!")
                    val nodeVariable2 = nodeVariablesMap[neighbor] ?: error("There is no NodeVariable for $neighbor!")

                    val mergedNodeVariable = nodeVariable1.merge(nodeVariable2)
                    mergedNodeVariable.addEdge(tail = node, head = neighbor, graphNumber = graphNumber)

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
        val heads = uncommonEdges.values.flatten().distinct()
        val tails = uncommonEdges.filter { (node, neighbors) ->
            neighbors.isNotEmpty() || node !in otherGraph.nodes
        }.keys
        val cleanedUncommonEdges = uncommonEdges.filter { (node, _) -> node in (heads + tails) }
        val lonelyNodes = nodes.filter { edgesOf(it).isEmpty() }.filter { it !in otherGraph.nodes }
        return Graph(nodes = (tails + heads + lonelyNodes).toList(), edges = cleanedUncommonEdges)
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