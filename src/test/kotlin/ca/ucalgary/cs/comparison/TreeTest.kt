package ca.ucalgary.cs.comparison

import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import kotlin.test.assertEquals

class TreeTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        val a = Node("A")
        val b = Node("B")
        val c = Node("C")
        val d = Node("D")

        val g1root = Node("G1Root")
        val g1subRoot = Node("G1SubRoot")
        val g1child1A = Node("G1Child1A")
        val g1subChild1A = Node("G1SubChild1A")
        val g1child2A = Node("G1Child2A")

        val g2root = Node("G2Root")
        val g2child1A = Node("G2Child1A")
        val g2child2A = Node("G2Child2A")
        val g2child1B = Node("G2Child1B")
        val g2Child2B = Node("G2Child2B")

        graph1 = Graph.from(
            nodes = listOf(a, b, c, d, g1root, g1subRoot, g1child1A, g1child2A, g1subChild1A),
            edges = mapOf(
                g1subRoot to listOf(g1root),
                a to listOf(g1subRoot),
                g1child1A to listOf(a),
                g1subChild1A to listOf(g1child1A),
                c to listOf(g1subChild1A),
                d to listOf(c),
                g1child2A to listOf(a),
                b to listOf(g1child2A)
            )
        )

        graph2 = Graph.from(
            nodes = listOf(a, b, c, d, g2root, g2child1A, g2child2A, g2child1B, g2Child2B),
            edges = mapOf(
                a to listOf(g2root),
                g2child1A to listOf(a),
                c to listOf(g2child1A),
                d to listOf(c),
                g2child2A to listOf(a),
                b to listOf(g2child2A),
                g2child1B to listOf(b),
                g2Child2B to listOf(b)
            )
        )
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        val g1root = Node("G1Root")
        val g1subRoot = Node("G1SubRoot")
        val g1child1A = Node("G1Child1A")
        val g1subChild1A = Node("G1SubChild1A")
        val g1child2A = Node("G1Child2A")

        val g2root = Node("G2Root")
        val g2child1A = Node("G2Child1A")
        val g2child2A = Node("G2Child2A")
        val g2childB = Node("G2ChildB")
        val g2subChildB = Node("G2SubChildB")

        assertEquals(commonGraph.nodeVariables.size, 4)
        assertEquals(commonGraph.edgeVariables.size, 6)

        //TODO: add assertions
        /*
        val nv1 = commonGraph.nodeVariables.first { it.graph1 == Graph(nodes = listOf(g1g), edges = mapOf()) }
        assertEquals(nv1.graph2, Graph(nodes = listOf(g2g1, g2g2), edges = mapOf(g2g1 to listOf(g2g2))))

        val nv2 = commonGraph.nodeVariables.first { it.graph2 == Graph(nodes = listOf(g2d), edges = mapOf()) }
        assertEquals(nv2.graph1, Graph(nodes = listOf(g1d, g1h), edges = mapOf(g1d to listOf(g1h))))

        val nv3 = commonGraph.nodeVariables.first {
            it.graph1 == Graph(
                nodes = listOf(g1e, g1f),
                edges = mapOf(g1e to listOf(g1f))
            )
        }
        assertEquals(nv3.graph2, Graph(nodes = listOf(g2e, g2f), edges = mapOf(g2e to listOf(g2f))))
         */
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {}
    override fun checkGraph2Diff(graph2Diff: Graph) {}
}