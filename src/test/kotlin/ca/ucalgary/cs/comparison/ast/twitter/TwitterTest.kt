package ca.ucalgary.cs.comparison.ast.twitter

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.io.ASTPrinter
import ca.ucalgary.cs.io.GraphScanner
import ca.ucalgary.cs.io.visualize

class TwitterTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        graph1 = GraphScanner.scanWithDefinition("src/test/kotlin/ca/ucalgary/cs/comparison/ast/twitter/Twitter7.txt")
        graph2 = GraphScanner.scanWithDefinition("src/test/kotlin/ca/ucalgary/cs/comparison/ast/twitter/Twitter31.txt")

        graph1.visualize("Twitter7vs31/G1")
        graph2.visualize("Twitter7vs31/G2")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        ASTPrinter.from(graph1, graphNumber = 1, fileName = "Twitter7vs31/G1_Generalized")
        ASTPrinter.from(graph2, graphNumber = 2, fileName = "Twitter7vs31/G2_Generalized")
        ASTPrinter.from(commonGraph, fileName = "data/Twitter7vs31/Generalization", graph1, graph2)

        graph1.visualize("Twitter7vs31/G1_Generalized", commonGraph)
        graph2.visualize("Twitter7vs31/G2_Generalized", commonGraph)
        commonGraph.visualize("Twitter7vs31/Generalization")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("Twitter7vs31/G1_Differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("Twitter7vs31/G2_Differences")
    }
}