package ca.ucalgary.cs.comparison

import ca.ucalgary.cs.exceptions.UninitializedGraphException
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.utils.areListsEqual
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

abstract class BaseCompareGraphTest {

    lateinit var graph1: Graph
    lateinit var graph2: Graph

    abstract fun initializeGraphs()

    @Before
    fun initialization() {
        initializeGraphs()
        if (!this::graph1.isInitialized || !this::graph2.isInitialized)
            throw UninitializedGraphException()
    }

    @Test
    fun compareGraphs() {
        val (commonGraph, graph1Diff, graph2Diff) = Graph.compare(graph1, graph2)

        println("Common Graph:")
        println(commonGraph)

        println("Graph 1 Diff:")
        println(graph1Diff)

        println("Graph 2 Diff:")
        println(graph2Diff)

        checkCommonGraph(commonGraph)
        checkGraph1Diff(graph1Diff)
        checkGraph2Diff(graph2Diff)

        assertEquals(graph1, Graph.reconstruct(commonGraph, graph1Diff))
        assertEquals(graph2, Graph.reconstruct(commonGraph, graph2Diff))

        assertEquals(graph1, Graph.reconstruct(commonGraph, graphNumber = 1))
        assertEquals(graph2, Graph.reconstruct(commonGraph, graphNumber = 2))
    }

    abstract fun checkCommonGraph(commonGraph: Graph)
    abstract fun checkGraph1Diff(graph1Diff: Graph)
    abstract fun checkGraph2Diff(graph2Diff: Graph)

    fun <E> checkListsEquality(first: List<E>?, second: List<E>?, message: String = "") =
        assertTrue(message, areListsEqual(first, second))
}