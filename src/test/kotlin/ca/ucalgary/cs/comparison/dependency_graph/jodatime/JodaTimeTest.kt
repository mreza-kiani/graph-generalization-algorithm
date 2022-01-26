package ca.ucalgary.cs.comparison.dependency_graph.jodatime

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.io.GraphScanner
import ca.ucalgary.cs.io.visualize

class JodaTimeTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        graph1 = GraphScanner.scan("src/test/kotlin/ca/ucalgary/cs/comparison/dependency_graph/jodatime/v2.9.9-withD.txt")
        graph2 = GraphScanner.scan("src/test/kotlin/ca/ucalgary/cs/comparison/dependency_graph/jodatime/v2.10.13-withD.txt")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
//        graph1.visualize("log4j")
//        graph2.visualize("logback")
//        commonGraph.visualize("jodatime-withD-commonalities")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("jodatime-withD-v2.9.9-differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("jodatime-withD-v2.10.13-differences")
    }
}

