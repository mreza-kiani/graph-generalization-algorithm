package ca.ucalgary.cs.graph

import ca.ucalgary.cs.exceptions.IllegalEdgeException
import ca.ucalgary.cs.utils.areListsEqual

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

                commonNodesEdgeVariables.addAll(
                    extractEdgeVariablesBetweenCommonNodes(commonNode, commonNodes, g1Edges, g2Edges)
                )

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
            commonNodesEdgeVariables.clear()

            val graph1EdgeVariables = graph1.extractNodeAndEdgeVariablesForSingleGraph(commonNodes, graphNumber = 1)
            val graph2EdgeVariables = graph2.extractNodeAndEdgeVariablesForSingleGraph(commonNodes, graphNumber = 2)

            val mergedEdgeVariables = mergeNodeAndEdgeVariables(graph1EdgeVariables, graph2EdgeVariables)

            commonGraph.edgeVariables.addAll(mergedEdgeVariables)
            commonGraph.nodeVariables.addAll(commonNodesEdgeVariables.map { it.nodeVariableLeg() })

            val g1Diff = graph1 - commonGraph
            val g2Diff = graph2 - commonGraph

            return Triple(commonGraph, g1Diff, g2Diff)
        }

        private fun extractEdgeVariablesBetweenCommonNodes(
            commonNode: Node,
            commonNodes: List<Node>,
            g1Edges: List<Node>,
            g2Edges: List<Node>,
        ): List<EdgeVariable> {
            val edgeVariables = mutableListOf<EdgeVariable>()

            val g1UncommonNeighbors = g1Edges.filter { it in commonNodes }.filter { it !in g2Edges }
            val g2UncommonNeighbors = g2Edges.filter { it in commonNodes }.filter { it !in g1Edges }

            g1UncommonNeighbors.forEach { uncommonNeighbor ->
                val edgeVariable = edgeVariables.firstOrNull { it.has(commonNode, uncommonNeighbor) }
                    ?: EdgeVariable(name = EdgeVariable.getUniqueName(), leg1 = commonNode, leg2 = uncommonNeighbor)
                edgeVariable.addEdge(tail = commonNode, head = uncommonNeighbor, graphNumber = 1)
            }
            g2UncommonNeighbors.forEach { uncommonNeighbor ->
                val edgeVariable = edgeVariables.firstOrNull { it.has(commonNode, uncommonNeighbor) }
                    ?: EdgeVariable(name = EdgeVariable.getUniqueName(), leg1 = commonNode, leg2 = uncommonNeighbor)
                edgeVariable.addEdge(tail = commonNode, head = uncommonNeighbor, graphNumber = 2)
            }

            return edgeVariables
        }

        private fun mergeNodeAndEdgeVariables(
            graph1EdgeVariables: MutableList<EdgeVariable>,
            graph2EdgeVariables: MutableList<EdgeVariable>
        ): MutableList<EdgeVariable> {
            val edgeVariables = mutableListOf<EdgeVariable>()

            graph1EdgeVariables.forEach { graph1EdgeVariable ->
                val commonNode = graph1EdgeVariable.simpleNodeLeg()

                if (graph2EdgeVariables.any { it.simpleNodeLeg() == commonNode }) {
                    val graph2EdgeVariable = graph2EdgeVariables.first { it.simpleNodeLeg() == commonNode }
                    val newEdgeVariable = EdgeVariable.merge(listOf(graph1EdgeVariable, graph2EdgeVariable), commonNode)

                    graph2EdgeVariables.remove(graph2EdgeVariable)
                    edgeVariables.add(newEdgeVariable)
                } else {
                    edgeVariables.add(graph1EdgeVariable)
                }
            }

            edgeVariables.addAll(graph2EdgeVariables)
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
    }

    private fun extractNodeAndEdgeVariablesForSingleGraph(
        commonNodes: List<Node>,
        graphNumber: Int
    ): MutableList<EdgeVariable> {
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

                    val edgeVariable = EdgeVariable(EdgeVariable.getUniqueName(), n, nv)
                    edgeVariable.addEdge(tail = node, head = neighbor, graphNumber = graphNumber)

                    edgeVariables.add(edgeVariable)
                } else {
                    val nodeVariable1 = nodeVariablesMap[node] ?: error("There is no NodeVariable for $node!")
                    val nodeVariable2 = nodeVariablesMap[neighbor] ?: error("There is no NodeVariable for $neighbor!")

                    val mergedNodeVariable = nodeVariable1.merge(nodeVariable2)
                    mergedNodeVariable.addEdge(tail = node, head = neighbor, graphNumber = graphNumber)

                    nodeVariablesMap[node] = mergedNodeVariable
                    nodeVariablesMap[neighbor] = mergedNodeVariable
                }
            }
        }

        commonNodes.forEach { commonNode ->
            val shouldBeMergedEdgeVariables = edgeVariables.filter { it.has(commonNode) }

            if (shouldBeMergedEdgeVariables.size >= 2) {
                val mergedEdgeVariable = EdgeVariable.merge(shouldBeMergedEdgeVariables, commonNode)

                edgeVariables.removeAll(shouldBeMergedEdgeVariables)
                edgeVariables.add(mergedEdgeVariable)
            }
        }

        return edgeVariables
    }

    private operator fun minus(otherGraph: Graph): Graph {
        val uncommonEdges = edges.map { (node, neighbors) ->
            node to (neighbors - otherGraph.edgesOf(node))
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

        if (nodes.any { !areListsEqual(first = edgesOf(it), second = other.edgesOf(it)) })
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
}