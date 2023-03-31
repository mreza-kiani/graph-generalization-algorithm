package ca.ucalgary.cs.comparison.ast.junit

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.io.ASTPrinter
import ca.ucalgary.cs.io.GraphScanner
import ca.ucalgary.cs.io.visualize

class JUnitTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        graph1 = GraphScanner.scanWithDefinition("src/test/kotlin/ca/ucalgary/cs/comparison/ast/junit/Assert9.txt")
        graph2 = GraphScanner.scanWithDefinition("src/test/kotlin/ca/ucalgary/cs/comparison/ast/junit/Assert23.txt")

        graph1.visualize("JUnit/Assert9vs23/G1")
        graph2.visualize("JUnit/Assert9vs23/G2")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        ASTPrinter.from(graph1, graphNumber = 1, fileName = "JUnit/Assert9vs23/G1_Generalized")
        ASTPrinter.from(graph2, graphNumber = 2, fileName = "JUnit/Assert9vs23/G2_Generalized")
        ASTPrinter.from(commonGraph, fileName = "JUnit/Assert9vs23/Generalization_f", graph1, graph2)
        ASTPrinter.from(commonGraph, fileName = "JUnit/Assert9vs23/Generalization_s", graph2, graph1)

        graph1.visualize("JUnit/Assert9vs23/G1_Generalized", commonGraph)
        graph2.visualize("JUnit/Assert9vs23/G2_Generalized", commonGraph)
        commonGraph.visualize("JUnit/Assert9vs23/Generalization")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("JUnit/Assert9vs23/G1_Differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("JUnit/Assert9vs23/G2_Differences")
    }
}