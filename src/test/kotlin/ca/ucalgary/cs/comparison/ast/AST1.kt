package ca.ucalgary.cs.comparison.ast

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Edge
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node

class AST1: BaseCompareGraphTest() {
    override fun initializeGraphs() {
        val a = Node("A")
        val b1 = Node("B", isDuplicate = true)
        val b2 = Node("B", isDuplicate = true)
        val b4 = Node("B", isDuplicate = true)
        val d = Node("D")
        val e = Node("E")
        val f = Node("F")

        graph1 = Graph.from(
            nodes = listOf(a, b1, b2, d, e, f),
            edges = mapOf(
                a to listOf(b1, b2),
                e to listOf(d),
                b2 to listOf(e)
            )
        )

        graph2 = Graph.from(
            nodes = listOf(a, b4, d, e),
            edges = mapOf(
                a to listOf(b4),
                b4 to listOf(e),
                e to listOf(d),
            )
        )
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        val a = Node("A")
        val b = Node("B")
        val d = Node("D")
        val e = Node("E")

        val renamedB = commonGraph.nodes.first { b.name in it.name }
        checkListsInclusion(commonGraph.nodes, listOf(a, d, e, renamedB))
        checkListsEquality(commonGraph.edges[a], Edge.from(a, listOf(renamedB)))
        checkListsEquality(commonGraph.edges[e], Edge.from(e, listOf(d)))
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        val a = Node("A")
        val b = Node("B")
        val e = Node("E")
        val f = Node("F")

        val renamedCommonB = graph1Diff.nodes.first { b.name in it.name && it.isCommon}
        val uncommonB = graph1Diff.nodes.first { b.name in it.name && !it.isCommon}
        checkListsEquality(graph1Diff.nodes, listOf(a, renamedCommonB, uncommonB, f, e))
        checkListsEquality(graph1Diff.edges[a], Edge.from(a, listOf(uncommonB)))
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        val b = Node("B")
        val e = Node("E")

        val renamedCommonB = graph2Diff.nodes.first { b.name in it.name && it.isCommon}
        checkListsEquality(graph2Diff.nodes, listOf(e, renamedCommonB))
    }
}