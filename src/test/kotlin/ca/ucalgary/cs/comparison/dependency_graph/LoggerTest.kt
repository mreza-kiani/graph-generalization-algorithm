package ca.ucalgary.cs.comparison.dependency_graph

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.io.GraphScanner
import ca.ucalgary.cs.io.visualize

class LoggerTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        graph1 = GraphScanner.scan("src/test/kotlin/ca/ucalgary/cs/comparison/dependency_graph/graph1.txt")
        graph2 = GraphScanner.scan("src/test/kotlin/ca/ucalgary/cs/comparison/dependency_graph/graph2.txt")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
//        graph1.visualize("log4j")
        graph2.visualize("logback")
        commonGraph.visualize("log4j vs logback")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {}
    override fun checkGraph2Diff(graph2Diff: Graph) {}
}
