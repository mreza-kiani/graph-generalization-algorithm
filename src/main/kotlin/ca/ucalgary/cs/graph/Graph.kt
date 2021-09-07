package ca.ucalgary.cs.graph

import ca.ucalgary.cs.exceptions.IllegalEdgeException
import ca.ucalgary.cs.utils.areListsEqual

class Graph(val nodes: List<Node>, val edges: Map<Node, List<Node>>) {
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

    private fun edgesOf(node: Node) = edges[node] ?: emptyList()
    private fun edgeCounts(): Int = edges.values.sumOf { it.size }

    companion object {
        fun compare(graph1: Graph, graph2: Graph): Triple<Graph, Graph, Graph> {
            val referables = graph1.nodes.filter { it in graph2.nodes }
            val commonEdges = mutableMapOf<Node, List<Node>>()
            var totalSimilarityScore = 0.0

            referables.forEach { referable ->
                val g1Edges = graph1.edgesOf(referable)
                val g2Edges = graph2.edgesOf(referable)

                val commonNeighbors = g2Edges.filter { it in g1Edges }
                val all = (g2Edges.size + g1Edges.size).toDouble() / 2

                commonEdges[referable] = commonNeighbors

                val nodeSimilarity = if (all != 0.0) commonNeighbors.size.toDouble() / all else 1.0
                totalSimilarityScore += nodeSimilarity
                println("${referable.name} -> #similarity: $nodeSimilarity")
            }

            (graph1.nodes + graph2.nodes).filter { it !in referables }.forEach { node ->
                println("${node.name} -> #similarity: 0.0 (NOT COMMON!)")
            }

            println("############################")
            println("Similar Nodes Rate: ${referables.size * 2.0 / (graph1.nodes.size + graph2.nodes.size)}")
            println("Similar Edges Rate: ${commonEdges.size * 2.0 / (graph1.edgeCounts() + graph2.edgeCounts())}")
            println("Common Graph #Similarity: ${if (referables.isNotEmpty()) totalSimilarityScore / referables.size else 0}")
            println("############################")

            val commonGraph = Graph(nodes = referables, edges = commonEdges)

            val g1Diff = graph1 - commonGraph
            val g2Diff = graph2 - commonGraph

            return Triple(commonGraph, g1Diff, g2Diff)
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