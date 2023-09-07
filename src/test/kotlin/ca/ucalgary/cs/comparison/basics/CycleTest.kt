package ca.ucalgary.cs.comparison.basics

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import ca.ucalgary.cs.io.visualize

class CycleTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        val a = Node("A")
        val b = Node("B")
        val c = Node("C")
        val d = Node("D")
        val e = Node("E")
        val f = Node("F")

        graph1 = Graph.from(
            nodes = listOf(a, b, c, d, e),
            edges = mapOf(
                a to listOf(b, c),
                b to listOf(a, d, e),
                c to listOf(a),
                e to listOf(b),
                d to listOf(b),
            )
        )

        graph2 = Graph.from(
            nodes = listOf(b, d, f),
            edges = mapOf(
                d to listOf(b, f),
                b to listOf(d),
                f to listOf(d),
            )
        )

        graph1.visualize("Cycle/G1")
        graph2.visualize("Cycle/G2")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        graph1.visualize("Cycle/G1_Generalized", commonGraph)
        graph2.visualize("Cycle/G2_Generalized", commonGraph)
        commonGraph.visualize("Cycle/Generalization")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("Cycle/G1_Differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("Cycle/G2_Differences")
    }
}