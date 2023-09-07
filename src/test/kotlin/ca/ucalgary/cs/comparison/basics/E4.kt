package ca.ucalgary.cs.comparison.basics

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import ca.ucalgary.cs.io.ASTPrinter
import ca.ucalgary.cs.io.visualize

class E4 : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        val p = Node("P")
        val m1= Node("m1")
        val m2 = Node("m2")
        val n1= Node("n1")
        val n2 = Node("n2")
        val s1= Node("s1")
        val s2 = Node("s2")
        val s3= Node("s3")
        val s4 = Node("s4")

        graph1 = Graph.from(
            nodes = listOf(p, m1, m2, s1, s2, s3, s4),
            edges = mapOf(
                p to listOf(m1, m2),
                m1 to listOf(s1, s2),
                m2 to listOf(s3, s4),
            )
        )

        graph2 = Graph.from(
            nodes = listOf(p, n1, n2, s1, s2, s3),
            edges = mapOf(
                p to listOf(n1, n2),
                n1 to listOf(s1),
                n2 to listOf(s3, s2),
            )
        )

        graph1.visualize("IDK/G1")
        graph2.visualize("IDK/G2")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        graph1.visualize("IDK/G1_Generalized", commonGraph)
        graph2.visualize("IDK/G2_Generalized", commonGraph)
        commonGraph.visualize("IDK/Generalization")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("IDK/G1_Differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("IDK/G2_Differences")
    }
}