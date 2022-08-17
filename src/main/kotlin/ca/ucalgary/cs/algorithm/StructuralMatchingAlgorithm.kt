package ca.ucalgary.cs.algorithm

import ca.ucalgary.cs.graph.Graph

object StructuralMatchingAlgorithm {
    fun matchSameNodes(graph1: Graph, graph2: Graph) {
        val g1SameNodes = extractSameNodes(graph1)
        val g2SameNodes = extractSameNodes(graph2)

        // TODO: It's better to select the best nodes between 2 graphs for this, not the best in g1 and then go for g2
        g1SameNodes.forEach { g1Node ->
            val potentialNodes = graph2.nodes.filter { it == g1Node }
            val matchedNode = potentialNodes.associateWith { g2Node ->
                /*val outDegree = graph2.edges[g2Node]?.sumOf { g2Out ->
                            if (g2Out in (graph1.edges[g1Node] ?: emptyList())) 1L else 0
                        } ?: 0*/
                val g1Edges = graph1.edges.values.flatten().filter { edge -> edge.contain(g1Node) }
                val g2Edges = graph2.edges.values.flatten().filter { edge -> edge.contain(g2Node) }
                val degree = g1Edges.sumOf { g1Edge -> if (g1Edge in g2Edges) 1L else 0 }
                degree.toDouble() / (graph1.degreeOf(g1Node) + graph2.degreeOf(g2Node))
            }.toList().maxByOrNull { (_, degree) -> degree }
        }
        println(g2SameNodes)
    }

    private fun extractSameNodes(graph: Graph) =
        graph.nodes
            .groupBy { it.name }
            .filter { (_, list) -> list.size > 1 }
            .values
            .flatten()
            .sortedByDescending { node -> graph.degreeOf(node) }
}