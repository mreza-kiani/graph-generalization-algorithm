package ca.ucalgary.cs.comparison

import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node

class E1: BaseCompareGraphTest() {
    override fun initializeGraphs() {
        val a = Node("A")
        val b = Node("B")
        val c = Node("C")
        val d = Node("D")
        val e = Node("E")
        val f = Node("F")

        graph1 = Graph(
            nodes = listOf(a, b, c, d, e, f),
            edges = mapOf(
                a to listOf(b, c),
                e to listOf(d),
            )
        )

        graph2 = Graph(
            nodes = listOf(a, b, c, d, e),
            edges = mapOf(
                a to listOf(c),
                b to listOf(a, d),
                e to listOf(d),
            )
        )
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        val a = Node("A")
        val b = Node("B")
        val c = Node("C")
        val d = Node("D")
        val e = Node("E")

        checkListsEquality(commonGraph.nodes, listOf(a, b, c, d, e))
        checkListsEquality(commonGraph.edges[a], listOf(c))
        checkListsEquality(commonGraph.edges[e], listOf(d))
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        val a = Node("A")
        val b = Node("B")
        val f = Node("F")

        checkListsEquality(graph1Diff.nodes, listOf(a, b, f))
        checkListsEquality(graph1Diff.edges[a], listOf(b))
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        val a = Node("A")
        val b = Node("B")
        val d = Node("D")

        checkListsEquality(graph2Diff.nodes, listOf(a, b, d))
        checkListsEquality(graph2Diff.edges[b], listOf(a, d))
    }
}