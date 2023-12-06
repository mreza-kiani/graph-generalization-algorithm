package ca.ucalgary.cs.comparison.dependency_graph.jodatime

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.io.GraphScanner
import ca.ucalgary.cs.io.visualize

class JodaTimeTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        graph1 = GraphScanner.scan("src/test/kotlin/ca/ucalgary/cs/comparison/dependency_graph/jodatime/v2.0.txt")
        graph2 = GraphScanner.scan("src/test/kotlin/ca/ucalgary/cs/comparison/dependency_graph/jodatime/v2.10.txt")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
//        graph1.visualize("log4j")
//        graph2.visualize("logback")
//        commonGraph.visualize("jodatime-withD-commonalities")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("jodatime-v2.0-main-differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("jodatime-v2.10-main-differences")
    }
}

