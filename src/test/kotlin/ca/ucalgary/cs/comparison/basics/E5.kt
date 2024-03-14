package ca.ucalgary.cs.comparison.basics

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import ca.ucalgary.cs.io.visualize

class E5 : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        val a = Node("A")
        val b = Node("B")
        val c = Node("C")
        val d = Node("D")
        val e = Node("E")
        val f = Node("F")
        val g = Node("G")

        graph1 = Graph.from(
            nodes = listOf(a, b, c, d),
            edges = mapOf(
                b to listOf(a, d),
                c to listOf(a),
            )
        )

        graph2 = Graph.from(
            nodes = listOf(a, b, c, e, f, g),
            edges = mapOf(
                a to listOf(f, b),
                c to listOf(a),
                b to listOf(e),
                f to listOf(e),
            )
        )
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        graph1.visualize("E5_G1")
        graph2.visualize("E5_G2")
        commonGraph.visualize("E5_G")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("E5_G1_Diff")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("E5_G2_Diff")
    }
}