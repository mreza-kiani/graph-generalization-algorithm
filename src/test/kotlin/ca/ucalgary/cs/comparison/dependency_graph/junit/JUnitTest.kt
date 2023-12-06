package ca.ucalgary.cs.comparison.dependency_graph.junit

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.io.GraphScanner
import ca.ucalgary.cs.io.visualize

class JUnitTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        graph1 = GraphScanner.scan("src/test/kotlin/ca/ucalgary/cs/comparison/dependency_graph/junit/junit4.12.txt")
//        graph2 = GraphScanner.scan("src/test/kotlin/ca/ucalgary/cs/comparison/dependency_graph/junit/junit4.13.txt")
        graph2 = GraphScanner.scan("src/test/kotlin/ca/ucalgary/cs/comparison/dependency_graph/junit/junit5.txt")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
//        graph1.visualize("junit4")
//        graph2.visualize("junit5")
        //commonGraph.visualize("junit-commonalities")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
//        graph1Diff.visualize("junit-4.12-differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
//        graph2Diff.visualize("junit-4.13-differences")
    }
}

