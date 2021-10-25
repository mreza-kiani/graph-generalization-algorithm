package ca.ucalgary.cs.comparison

import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import kotlin.test.assertEquals

class E4 : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        val a = Node("A")
        val b = Node("B")
        val c = Node("C")

        val g1d = Node("G1D")
        val g1e = Node("G1E")
        val g1f = Node("G1F")
        val g1g = Node("G1G")
        val g1h = Node("G1H")

        val g2d = Node("G2D")
        val g2e = Node("G2E")
        val g2f = Node("G2F")
        val g2g1 = Node("G2G1")
        val g2g2 = Node("G2G2")

        graph1 = Graph(
            nodes = listOf(a, b, c, g1d, g1e, g1h, g1g, g1f),
            edges = mapOf(
                g1d to listOf(g1h),
                a to listOf(g1g, g1h),
                g1g to listOf(b),
                c to listOf(g1g, g1f),
                g1e to listOf(g1f),
            )
        )

        graph2 = Graph(
            nodes = listOf(a, b, c, g2d, g2e, g2f, g2g1, g2g2),
            edges = mapOf(
                a to listOf(g2d, g2g1),
                g2g1 to listOf(g2g2),
                g2g2 to listOf(b),
                c to listOf(g2g1, g2f),
                g2e to listOf(g2f),
                b to listOf(g2e)
            )
        )
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        val g1d = Node("G1D")
        val g1e = Node("G1E")
        val g1f = Node("G1F")
        val g1g = Node("G1G")
        val g1h = Node("G1H")

        val g2d = Node("G2D")
        val g2e = Node("G2E")
        val g2f = Node("G2F")
        val g2g1 = Node("G2G1")
        val g2g2 = Node("G2G2")

        assertEquals(commonGraph.nodeVariables.size, 3)
        assertEquals(commonGraph.edgeVariables.size, 6)

        val nv1 = commonGraph.nodeVariables.first { it.graph1 == Graph(nodes = listOf(g1g), edges = mapOf()) }
        assertEquals(nv1.graph2, Graph(nodes = listOf(g2g1, g2g2), edges = mapOf(g2g1 to listOf(g2g2))))

        val nv2 = commonGraph.nodeVariables.first { it.graph2 == Graph(nodes = listOf(g2d), edges = mapOf()) }
        assertEquals(nv2.graph1, Graph(nodes = listOf(g1d, g1h), edges = mapOf(g1d to listOf(g1h))))

        val nv3 = commonGraph.nodeVariables.first { it.graph1 == Graph(nodes = listOf(g1e, g1f), edges = mapOf(g1e to listOf(g1f))) }
        assertEquals(nv3.graph2, Graph(nodes = listOf(g2e, g2f), edges = mapOf(g2e to listOf(g2f))))
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {}
    override fun checkGraph2Diff(graph2Diff: Graph) {}
}