package ca.ucalgary.cs.comparison.ast.debug

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.io.ASTPrinter
import ca.ucalgary.cs.io.GraphScanner
import ca.ucalgary.cs.io.visualize

class DebugTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        graph1 = GraphScanner.scanWithDefinition("src/test/kotlin/ca/ucalgary/cs/comparison/ast/debug/input1.txt")
        graph2 = GraphScanner.scanWithDefinition("src/test/kotlin/ca/ucalgary/cs/comparison/ast/debug/input2.txt")

        graph1.visualize("debug/G1")
        graph2.visualize("debug/G2")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        ASTPrinter.from(graph1, graphNumber = 1, fileName = "debug/G1_Generalized")
        ASTPrinter.from(graph2, graphNumber = 2, fileName = "debug/G2_Generalized")
        ASTPrinter.from(commonGraph, fileName = "debug/Generalization_f", graph1, graph2)
        ASTPrinter.from(commonGraph, fileName = "debug/Generalization_s", graph2, graph1)

        graph1.visualize("debug/G1_Generalized", commonGraph)
        graph2.visualize("debug/G2_Generalized", commonGraph)
        commonGraph.visualize("debug/Generalization")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("debug/G1_Differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("debug/G2_Differences")
    }
}