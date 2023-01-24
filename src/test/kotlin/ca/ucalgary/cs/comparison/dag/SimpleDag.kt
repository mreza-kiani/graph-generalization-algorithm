package ca.ucalgary.cs.comparison.dag

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import ca.ucalgary.cs.io.visualize

class SimpleDag: BaseCompareGraphTest() {
    override fun initializeGraphs() {
        val a = Node("A")
        val b1 = Node("B", isDuplicate = true)
        val b2 = Node("B", isDuplicate = true)
        val b3 = Node("B")
        val c = Node("C")
        val d = Node("D")
        val e = Node("E")

        graph2 = Graph.from(
            nodes = listOf(a, b1, b2, c, d, e),
            edges = mapOf(
                a to listOf(b1, b2),
                b2 to listOf(c),
                c to listOf(e),
                b1 to listOf(c, d),
                d to listOf(e),
            )
        )

        graph1 = Graph.from(
            nodes = listOf(a, b3, d, e),
            edges = mapOf(
                a to listOf(b3),
                b3 to listOf(d),
                d to listOf(e),
            )
        )

        graph1.visualize("DagSimple/G1")
        graph2.visualize("DagSimple/G2")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        graph1.visualize("DagSimple/G1_Generalized", commonGraph)
        graph2.visualize("DagSimple/G2_Generalized", commonGraph)
        commonGraph.visualize("DagSimple/Generalization")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("DagSimple/G1_Differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("DagSimple/G2_Differences")
    }
}