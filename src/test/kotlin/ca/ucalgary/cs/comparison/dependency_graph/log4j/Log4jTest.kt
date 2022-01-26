package ca.ucalgary.cs.comparison.dependency_graph.log4j

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.io.GraphScanner
import ca.ucalgary.cs.io.visualize

class Log4jTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        graph1 = GraphScanner.scan("src/test/kotlin/ca/ucalgary/cs/comparison/dependency_graph/log4j/log4j-v1.txt")
        graph2 = GraphScanner.scan("src/test/kotlin/ca/ucalgary/cs/comparison/dependency_graph/log4j/log4j-v2.txt")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
//        graph1.visualize("junit4")
//        graph2.visualize("junit5")
        commonGraph.visualize("log4j-commonalities")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("log4j-1-differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("log4j-2-differences")
    }
}

