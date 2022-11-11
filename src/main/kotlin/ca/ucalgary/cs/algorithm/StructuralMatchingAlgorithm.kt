package ca.ucalgary.cs.algorithm

import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node

object StructuralMatchingAlgorithm {
    fun matchSameNodes(graph1: Graph, graph2: Graph) {
        matchSameNodesOf(sourceGraph = graph1, targetGraph = graph2)
        matchSameNodesOf(sourceGraph = graph2, targetGraph = graph1)
    }

    private fun matchSameNodesOf(sourceGraph: Graph, targetGraph: Graph) {
        // TODO: It's better to select the best nodes between 2 graphs for this, not the best in g1 and then go for g2
        val sameNodes = extractSameNodes(sourceGraph).toMutableList()
        val numberOfSameNodes = sameNodes.size
        repeat(numberOfSameNodes) {
            val g1Node = sameNodes.maxByOrNull { node -> sourceGraph.degreeOf(node) + sourceGraph.degreeOfMatchedNodes(node) }!!
            val potentialNodes = targetGraph.nodes.filter { it == g1Node }
            val matchedNode = potentialNodes.associateWith { g2Node ->
                val g1Edges = sourceGraph.allInAndOutEdgesOf(g1Node)
                val g2Edges = targetGraph.allInAndOutEdgesOf(g2Node)
                val degree = g1Edges.sumOf { g1Edge -> if (g1Edge in g2Edges) 1L else 0 } +
                        g1Edges.sumOf { g1Edge -> g2Edges.filter { g2Edge -> g1Edge.isExactMatch(g2Edge) }.size }

                degree.toDouble() / (sourceGraph.degreeOf(g1Node) + targetGraph.degreeOf(g2Node))
            }.toList().maxByOrNull { (_, degree) -> degree }?.first

            if (matchedNode != null)
                applyMatchingInNames(g1Node, matchedNode)

            sameNodes.remove(g1Node)
        }
    }

    private fun applyMatchingInNames(source: Node, matchedNode: Node) {
        source.name += "_${source.code}"
        source.isCommon = true
        matchedNode.name = source.name
        matchedNode.code = source.code
        matchedNode.isCommon = true
    }

    private fun extractSameNodes(graph: Graph) =
        graph.nodes
            .groupBy { it.name }
            .filter { (_, list) -> list.size > 1 }
            .values
            .flatten()

    fun unmarkIrrelevantParents(graph: Graph, dependentGraph: Graph) {
        // TODO       graph.extract
    }

}