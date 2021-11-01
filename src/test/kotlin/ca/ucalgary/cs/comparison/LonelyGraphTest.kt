package ca.ucalgary.cs.comparison

import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import kotlin.test.assertEquals

class LonelyGraphTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        val a = Node("A")
        val b = Node("B")
        val c = Node("C")

        val g1d = Node("G1D")
        val g1e = Node("G1E")
        val g1f = Node("G1F")

        val g2d = Node("G2D")
        val g2e = Node("G2E")

        graph1 = Graph(
            nodes = listOf(a, b, c, g1d, g1e, g1f),
            edges = mapOf(
                g1d to listOf(g1e),
            )
        )

        graph2 = Graph(
            nodes = listOf(a, b, c, g2d, g2e),
            edges = mapOf()
        )
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        val g1d = Node("G1D")
        val g1e = Node("G1E")
        val g1f = Node("G1F")

        val g2d = Node("G2D")
        val g2e = Node("G2E")

        assertEquals(commonGraph.nodeVariables.size, 1)
        assertEquals(commonGraph.edgeVariables.size, 0)

        val nv1 = commonGraph.nodeVariables.first {
            it.graph1 == Graph(
                nodes = listOf(g1d, g1e, g1f),
                edges = mapOf(
                    g1d to listOf(g1e),
                )
            )
        }
        assertEquals(nv1.graph2, Graph(nodes = listOf(g2d, g2e), edges = mapOf()))
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {}
    override fun checkGraph2Diff(graph2Diff: Graph) {}
}