package ca.ucalgary.cs.comparison.basics

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Edge
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import kotlin.test.assertEquals

class E2 : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        val a = Node("A")
        val b = Node("B")
        val c = Node("C")
        val d = Node("D")
        val e = Node("E")
        val f = Node("F")

        graph1 = Graph.from(
            nodes = listOf(a, b, c, d, e, f),
            edges = mapOf(
                a to listOf(b, c),
                b to listOf(f),
                e to listOf(d),
            )
        )

        graph2 = Graph.from(
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
        val f = Node("F")

        checkListsEquality(commonGraph.nodes, listOf(a, b, c, d, e))
        checkListsEquality(commonGraph.edges[a], Edge.from(a, listOf(c)))
        checkListsEquality(commonGraph.edges[e], Edge.from(e, listOf(d)))

        assertEquals(commonGraph.nodeVariables.size, 1)
        assertEquals(commonGraph.edgeVariables.size, 3)
        checkListsEquality(commonGraph.nodeVariables.first().graph1.nodes, listOf(f))
        checkListsEquality(commonGraph.nodeVariables.first().graph2.nodes, emptyList())
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        val a = Node("A")
        val b = Node("B")
        val f = Node("F")

        checkListsEquality(graph1Diff.nodes, listOf(a, b, f))
        checkListsEquality(graph1Diff.edges[a], Edge.from(a, listOf(b)))
        checkListsEquality(graph1Diff.edges[b], Edge.from(b, listOf(f)))
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        val a = Node("A")
        val b = Node("B")
        val d = Node("D")

        checkListsEquality(graph2Diff.nodes, listOf(a, b, d))
        checkListsEquality(graph2Diff.edges[b], Edge.from(b, listOf(a, d)))
    }
}