package ca.ucalgary.cs.comparison.ast.twitter_user

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.io.ASTPrinter
import ca.ucalgary.cs.io.GraphScanner
import ca.ucalgary.cs.io.visualize

class TwitterUserTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        graph1 = GraphScanner.scanWithDefinition("src/test/kotlin/ca/ucalgary/cs/comparison/ast/twitter_user/TwitterUser2.txt")
        graph2 = GraphScanner.scanWithDefinition("src/test/kotlin/ca/ucalgary/cs/comparison/ast/twitter_user/TwitterUser15.txt")

        graph1.visualize("TwitterUser2vs15/G1")
        graph2.visualize("TwitterUser2vs15/G2")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        ASTPrinter.from(graph1, graphNumber = 1, fileName = "TwitterUser2vs15/G1_Generalized")
        ASTPrinter.from(graph2, graphNumber = 2, fileName = "TwitterUser2vs15/G2_Generalized")
        ASTPrinter.from(commonGraph, fileName = "TwitterUser2vs15/Generalization_1", orderedGraph = graph1)
        ASTPrinter.from(commonGraph, fileName = "TwitterUser2vs15/Generalization_2", orderedGraph = graph2)

        graph1.visualize("TwitterUser2vs15/G1_Generalized", commonGraph)
        graph2.visualize("TwitterUser2vs15/G2_Generalized", commonGraph)
        commonGraph.visualize("TwitterUser2vs15/Generalization")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("TwitterUser2vs15/G1_Differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("TwitterUser2vs15/G2_Differences")
    }
}