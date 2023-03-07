package ca.ucalgary.cs.comparison.ast.twitter_exceptions

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.io.ASTPrinter
import ca.ucalgary.cs.io.GraphScanner
import ca.ucalgary.cs.io.visualize

class TwitterExceptionTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        graph1 = GraphScanner.scanWithDefinition("src/test/kotlin/ca/ucalgary/cs/comparison/ast/twitter_exceptions/TwitterException3.txt")
        graph2 = GraphScanner.scanWithDefinition("src/test/kotlin/ca/ucalgary/cs/comparison/ast/twitter_exceptions/TwitterException38.txt")

        graph1.visualize("TwitterExceptions3vs38/G1")
        graph2.visualize("TwitterExceptions3vs38/G2")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        ASTPrinter.from(graph1, graphNumber = 1, fileName = "TwitterExceptions3vs38/G1_Generalized")
        ASTPrinter.from(graph2, graphNumber = 2, fileName = "TwitterExceptions3vs38/G2_Generalized")
        ASTPrinter.from(commonGraph, fileName = "TwitterExceptions3vs38/Generalization_1", orderedGraph = graph1, graphNumber = 1)
        ASTPrinter.from(commonGraph, fileName = "TwitterExceptions3vs38/Generalization_2", orderedGraph = graph2, graphNumber = 2)

        graph1.visualize("TwitterExceptions3vs38/G1_Generalized", commonGraph)
        graph2.visualize("TwitterExceptions3vs38/G2_Generalized", commonGraph)
        commonGraph.visualize("TwitterExceptions3vs38/Generalization")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("TwitterExceptions3vs38/G1_Differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("TwitterExceptions3vs38/G2_Differences")
    }
}