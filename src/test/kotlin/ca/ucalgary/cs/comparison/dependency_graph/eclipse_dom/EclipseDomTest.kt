package ca.ucalgary.cs.comparison.dependency_graph.eclipse_dom

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.io.GraphScanner
import ca.ucalgary.cs.io.visualize

class EclipseDomTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
//        graph1 = GraphScanner.scan("src/test/kotlin/ca/ucalgary/cs/comparison/dependency_graph/eclipse_dom/3.8.txt")
        graph1 = GraphScanner.scan("src/test/kotlin/ca/ucalgary/cs/comparison/dependency_graph/eclipse_dom/3.12.txt")
        graph2 = GraphScanner.scan("src/test/kotlin/ca/ucalgary/cs/comparison/dependency_graph/eclipse_dom/3.27.txt")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
//        graph1.visualize("junit4")
//        graph2.visualize("junit5")
        //commonGraph.visualize("eclipse-dom-commonalities")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("eclipse-dom-3.12-vs-3.27-differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("eclipse-dom-3.27-vs-3.12-differences")
    }
}

