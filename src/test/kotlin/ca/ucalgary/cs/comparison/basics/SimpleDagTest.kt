package ca.ucalgary.cs.comparison.basics

import ca.ucalgary.cs.Config
import ca.ucalgary.cs.Context
import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Edge
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import ca.ucalgary.cs.io.visualize
import kotlin.test.assertEquals

class SimpleDagTest: BaseCompareGraphTest() {
    override fun initializeGraphs() {
        Config.CONTEXT = Context.AST

        val a = Node("A")
        val b1 = Node("B", isDuplicate = true)
        val b2 = Node("B", isDuplicate = true)
        val b3 = Node("B")
        val c = Node("C")
        val d = Node("D")
        val e = Node("E")

        graph2 = Graph.from(
            nodes = listOf(a, b1, b2, c, d, e),
            edges = mapOf(
                a to listOf(b1, b2),
                b2 to listOf(c),
                c to listOf(e),
                b1 to listOf(c, d),
                d to listOf(e),
            )
        )

        graph1 = Graph.from(
            nodes = listOf(a, b3, d, e),
            edges = mapOf(
                a to listOf(b3),
                b3 to listOf(d),
                d to listOf(e),
            )
        )

        graph1.visualize("DagSimple/G1")
        graph2.visualize("DagSimple/G2")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        graph1.visualize("DagSimple/G1_Generalized", commonGraph)
        graph2.visualize("DagSimple/G2_Generalized", commonGraph)
        commonGraph.visualize("DagSimple/Generalization")

        val a = Node("A")
        val b = Node("B")
        val c = Node("C")
        val d = Node("D")
        val e = Node("E")

        val renamedB = commonGraph.nodes.first { b.name in it.name }
        checkListsEquality(commonGraph.nodes, listOf(a, d, e, renamedB))
        checkListsEquality(commonGraph.edges[a], Edge.from(a, listOf(renamedB)))
        checkListsEquality(commonGraph.edgesOf(renamedB), Edge.from(renamedB, listOf(d)))

        assertEquals(1, commonGraph.nodeVariables.size)
        assertEquals(3, commonGraph.edgeVariables.size)

        val graph2Diff = commonGraph.nodeVariables.first().graph2
        val unmatchedB = graph2Diff.nodes.first { b.name in it.name }
        checkListsEquality(graph2Diff.nodes, listOf(unmatchedB, c))
        checkListsEquality(graph2Diff.edgesOf(unmatchedB), Edge.from(unmatchedB, listOf(c)))
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("DagSimple/G1_Differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("DagSimple/G2_Differences")
    }
}