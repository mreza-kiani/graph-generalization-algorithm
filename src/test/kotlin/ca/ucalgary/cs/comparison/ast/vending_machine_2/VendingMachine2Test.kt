package ca.ucalgary.cs.comparison.ast.vending_machine_2

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.io.GraphScanner
import ca.ucalgary.cs.io.visualize

class VendingMachine2Test : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        graph1 = GraphScanner.scanWithDefinition("src/test/kotlin/ca/ucalgary/cs/comparison/ast/vending_machine_2/Funds.txt")
        graph2 = GraphScanner.scanWithDefinition("src/test/kotlin/ca/ucalgary/cs/comparison/ast/vending_machine_2/ProductController.txt")

        graph1.visualize("VendingMachine2/G1")
        graph2.visualize("VendingMachine2/G2")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        graph1.visualize("VendingMachine2/G1_Generalized", commonGraph)
        graph2.visualize("VendingMachine2/G2_Generalized", commonGraph)
        commonGraph.visualize("VendingMachine2/Generalization")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("VendingMachine2/G1_Differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("VendingMachine2/G2_Differences")
    }
}