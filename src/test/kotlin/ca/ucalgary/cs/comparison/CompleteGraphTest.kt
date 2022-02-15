package ca.ucalgary.cs.comparison

import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import kotlin.test.assertEquals

class CompleteGraphTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        val a = Node("A")
        val b = Node("B")
        val c = Node("C")

        val g1d = Node("G1D")
        val g1e = Node("G1E")
        val g1f = Node("G1F")

        val g2d = Node("G2D")
        val g2e = Node("G2E")
        val g2f = Node("G2F")
        val g2g = Node("G2G")

        graph1 = Graph.from(
            nodes = listOf(a, b, c, g1d, g1e, g1f),
            edges = mapOf(
                a to listOf(b, c, g1d, g1e, g1f),
                b to listOf(a, c, g1d, g1e, g1f),
                c to listOf(a, b, g1d, g1e, g1f),
                g1d to listOf(a, b, c, g1e, g1f),
                g1e to listOf(a, b, c, g1d, g1f),
                g1f to listOf(a, b, c, g1e, g1d),
            )
        )

        graph2 = Graph.from(
            nodes = listOf(a, b, c, g2d, g2e, g2f, g2g),
            edges = mapOf(
                a to listOf(b, c, g2d, g2e, g2f, g2g),
                b to listOf(a, c, g2d, g2e, g2f, g2g),
                c to listOf(a, b, g2d, g2e, g2f, g2g),
                g2d to listOf(a, b, c, g2e, g2f, g2g),
                g2e to listOf(a, b, c, g2d, g2f, g2g),
                g2f to listOf(a, b, c, g2e, g2d, g2g),
                g2g to listOf(a, b, c, g2e, g2d, g2f),
            )
        )
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        val g1d = Node("G1D")
        val g1e = Node("G1E")
        val g1f = Node("G1F")

        val g2d = Node("G2D")
        val g2e = Node("G2E")
        val g2f = Node("G2F")
        val g2g = Node("G2G")

        assertEquals(commonGraph.nodeVariables.size, 1)
        assertEquals(commonGraph.edgeVariables.size, 3)

        val nv1 = commonGraph.nodeVariables.first {
            it.graph1 == Graph.from(
                nodes = listOf(g1d, g1e, g1f),
                edges = mapOf(
                    g1d to listOf(g1e, g1f),
                    g1e to listOf(g1d, g1f),
                    g1f to listOf(g1d, g1e),
                )
            )
        }
        assertEquals(
            nv1.graph2, Graph.from(
                nodes = listOf(g2d, g2e, g2f, g2g),
                edges = mapOf(
                    g2d to listOf(g2e, g2f, g2g),
                    g2e to listOf(g2d, g2f, g2g),
                    g2f to listOf(g2d, g2e, g2g),
                    g2g to listOf(g2d, g2e, g2f),
                )
            )
        )
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {}
    override fun checkGraph2Diff(graph2Diff: Graph) {}
}