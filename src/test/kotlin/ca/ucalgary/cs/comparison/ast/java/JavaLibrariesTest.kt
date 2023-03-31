package ca.ucalgary.cs.comparison.ast.java

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.io.ASTPrinter
import ca.ucalgary.cs.io.GraphScanner
import ca.ucalgary.cs.io.visualize

class JavaLibrariesTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        graph1 = GraphScanner.scanWithDefinition("src/test/kotlin/ca/ucalgary/cs/comparison/ast/java/BufferedReader18.txt")
        graph2 = GraphScanner.scanWithDefinition("src/test/kotlin/ca/ucalgary/cs/comparison/ast/java/BufferedReader24.txt")

        graph1.visualize("BufferedReader18vs24/G1")
        graph2.visualize("BufferedReader18vs24/G2")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        ASTPrinter.from(graph1, graphNumber = 1, fileName = "BufferedReader18vs24/G1_Generalized")
        ASTPrinter.from(graph2, graphNumber = 2, fileName = "BufferedReader18vs24/G2_Generalized")
        ASTPrinter.from(commonGraph, fileName = "BufferedReader18vs24/Generalization_f", graph1, graph2)
        ASTPrinter.from(commonGraph, fileName = "BufferedReader18vs24/Generalization_s", graph2, graph1)

        graph1.visualize("BufferedReader18vs24/G1_Generalized", commonGraph)
        graph2.visualize("BufferedReader18vs24/G2_Generalized", commonGraph)
        commonGraph.visualize("BufferedReader18vs24/Generalization")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("BufferedReader18vs24/G1_Differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("BufferedReader18vs24/G2_Differences")
    }
}