package ca.ucalgary.cs.comparison

import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import kotlin.test.assertEquals

class E3 : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        val a = Node("A")
        val b = Node("B")
        val c = Node("C")
        val d = Node("D")
        val e = Node("E")
        val f = Node("F")
        val g = Node("G")
        val h = Node("H")
        val i = Node("I")

        graph1 = Graph(
            nodes = listOf(a, b, c, d, e),
            edges = mapOf(
                b to listOf(a, d),
                c to listOf(a),
                e to listOf(c),
            )
        )

        graph2 = Graph(
            nodes = listOf(a, d, e, f, g, h, i),
            edges = mapOf(
                f to listOf(a),
                e to listOf(f),
                g to listOf(a),
                d to listOf(g, h),
                h to listOf(i),
            )
        )
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        assertEquals(commonGraph.nodeVariables.size, 3)
        assertEquals(commonGraph.edgeVariables.size, 5)
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {}
    override fun checkGraph2Diff(graph2Diff: Graph) {}
}