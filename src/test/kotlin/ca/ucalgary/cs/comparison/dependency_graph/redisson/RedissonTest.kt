package ca.ucalgary.cs.comparison.dependency_graph.redisson

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.io.GraphScanner

class RedissonTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        graph1 = GraphScanner.scan("src/test/kotlin/ca/ucalgary/cs/comparison/dependency_graph/redisson/2.9.0-with-inners.txt")
        graph2 = GraphScanner.scan("src/test/kotlin/ca/ucalgary/cs/comparison/dependency_graph/redisson/3.23.4-with-inners.txt")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
//        graph1.visualize("junit4")
//        graph2.visualize("junit5")
//        commonGraph.visualize("log4j-commonalities")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
//        graph1Diff.visualize("log4j-1-differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
//        graph2Diff.visualize("log4j-2-differences")
    }
}

