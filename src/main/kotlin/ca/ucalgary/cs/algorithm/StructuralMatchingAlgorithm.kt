package ca.ucalgary.cs.algorithm

import ca.ucalgary.cs.graph.Graph

object StructuralMatchingAlgorithm {
    fun matchSameNodes(graph1: Graph, graph2: Graph) {
        val g1SameNodes = extractSameNodes(graph1)
        val g2SameNodes = extractSameNodes(graph2)

        // TODO: It's better to select the best nodes between 2 graphs for this, not the best in g1 and then go for g2
        g1SameNodes
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