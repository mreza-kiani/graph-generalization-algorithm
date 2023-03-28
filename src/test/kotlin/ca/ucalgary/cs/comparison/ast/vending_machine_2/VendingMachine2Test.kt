package ca.ucalgary.cs.comparison.ast.vending_machine_2

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.io.ASTPrinter
import ca.ucalgary.cs.io.GraphScanner
import ca.ucalgary.cs.io.visualize

class VendingMachine2Test : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        graph1 = GraphScanner.scanWithDefinition("src/test/kotlin/ca/ucalgary/cs/comparison/ast/vending_machine_2/SelectProductController.txt")
        graph2 = GraphScanner.scanWithDefinition("src/test/kotlin/ca/ucalgary/cs/comparison/ast/vending_machine_2/Communication.txt")

        graph1.visualize("VendingMachine3/G1")
        graph2.visualize("VendingMachine3/G2")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        ASTPrinter.from(graph1, graphNumber = 1, fileName = "VendingMachine3/G1_generalized_v2")
        ASTPrinter.from(graph2, graphNumber = 2, fileName = "VendingMachine3/G2_generalized_v2")

        ASTPrinter.from(commonGraph, fileName = "VendingMachine3/Generalization_F", graph1, graph2)
        ASTPrinter.from(commonGraph, fileName = "VendingMachine3/Generalization_S", graph2, graph1)

        graph1.visualize("VendingMachine3/G1_Generalized", commonGraph)
        graph2.visualize("VendingMachine3/G2_Generalized", commonGraph)
        commonGraph.visualize("VendingMachine3/Generalization")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("VendingMachine3/G1_Differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("VendingMachine3/G2_Differences")
    }
}