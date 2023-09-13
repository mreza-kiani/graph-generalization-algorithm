package ca.ucalgary.cs.comparison.call_graph

import ca.ucalgary.cs.Config.CONTEXT
import ca.ucalgary.cs.Config.DEBUG_MODE
import ca.ucalgary.cs.Config.VISUALIZATION
import ca.ucalgary.cs.Context
import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.io.GraphScanner
import ca.ucalgary.cs.io.visualize

class JodaTimeTest : BaseCompareGraphTest() {


    override fun initializeGraphs() {
        DEBUG_MODE = false
        CONTEXT = Context.CALL_GRAPH
        VISUALIZATION = false

        graph1 = GraphScanner.scan("src/test/kotlin/ca/ucalgary/cs/comparison/call_graph/junit-4.12.txt")
        graph2 = GraphScanner.scan("src/test/kotlin/ca/ucalgary/cs/comparison/call_graph/junit-4.13.txt")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
//        graph1.visualize("log4j")
//        graph2.visualize("logback")
//        commonGraph.visualize("jodatime-withD-commonalities")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
//        graph1Diff.visualize("jodatime-v2.0-main-differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
//        graph2Diff.visualize("jodatime-v2.10-main-differences")
    }
}

