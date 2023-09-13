package ca.ucalgary.cs.comparison

import ca.ucalgary.cs.Config.CONTEXT
import ca.ucalgary.cs.Config.DEBUG_MODE
import ca.ucalgary.cs.Config.EASY_COPY
import ca.ucalgary.cs.Config.VISUALIZATION
import ca.ucalgary.cs.Context
import ca.ucalgary.cs.exceptions.UninitializedGraphException
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import ca.ucalgary.cs.graph.NodeVariable
import ca.ucalgary.cs.utils.areListsEqual
import ca.ucalgary.cs.utils.areListsSubset
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import java.io.File
import kotlin.test.assertEquals

abstract class BaseCompareGraphTest {

    lateinit var graph1: Graph
    lateinit var graph2: Graph
    val foundClasses = mutableListOf<String>()
    val outputFile = File("output.txt").also { it.writeText("") }

    abstract fun initializeGraphs()

    @Before
    fun initialization() {
        DEBUG_MODE = false
        CONTEXT = Context.CLASS_DIAGRAM
        VISUALIZATION = true
        EASY_COPY = false
        initializeGraphs()
        if (!this::graph1.isInitialized || !this::graph2.isInitialized)
            throw UninitializedGraphException()
    }

    @Test
    fun compareGraphs() {
        val startTime = System.currentTimeMillis()
        val (commonGraph, graph1Diff, graph2Diff) = Graph.compare(graph1, graph2)
        val endTime = System.currentTimeMillis()

        println("---------------------------------------------")
        println("Comparing took ${endTime - startTime} millis")
        println("---------------------------------------------")

        printStats(commonGraph)

        if (DEBUG_MODE) {
            println("Common Graph:")
            println(commonGraph)

            println("Graph 1 Diff:")
            println(graph1Diff)

            println("Graph 2 Diff:")
            println(graph2Diff)
        }

        println("---------------------Centrality----------------------")
        printTopNodesIn(commonGraph, label = "Common Graph", notInCommon = false)
        printTopNodesIn(graph1Diff, label = "Graph 1 Diff", notInCommon = true)
        printTopNodesIn(graph2Diff, label = "Graph 2 Diff", notInCommon = true)

        println("---------------------Smart Cnt.----------------------")
        printTopCommonClasses(commonGraph)
        printTopDifferentClasses(commonGraph, graphNumber = 1)
        printTopDifferentClasses(commonGraph, graphNumber = 2)

        checkCommonGraph(commonGraph)
        checkGraph1Diff(graph1Diff)
        checkGraph2Diff(graph2Diff)

        // TODO: fix reconstruction with the renamed nodes
        assertEquals(graph1, Graph.reconstruct(commonGraph, graph1Diff))
        assertEquals(graph2, Graph.reconstruct(commonGraph, graph2Diff))

//        assertEquals(graph1, Graph.reconstruct(commonGraph, graphNumber = 1))
//        assertEquals(graph2, Graph.reconstruct(commonGraph, graphNumber = 2))
    }

    private fun printTopDifferentClasses(commonGraph: Graph, graphNumber: Int) {
        println("---------------------------------------------")
        val differentNodes = commonGraph.nodeVariables.flatMap { it.getGraph(graphNumber).nodes }
        val graph = if (graphNumber == 1) graph1 else graph2
        val classesMap = differentNodes.associateWith { graph.edgesOf(it).size }

        extractAndPrintTopClasses(classesMap)
    }

    private fun printTopCommonClasses(commonGraph: Graph) {
        println("---------------------------------------------")
        val commonClasses = commonGraph.nodes.associateWith { 0 }.toMutableMap()
        commonClasses.keys.forEach { commonClass ->
            var changes = 0
            commonGraph.edgeVariables.forEach { ev ->
                for (i in 1..2) {
                    val edges = ev.getGraphEdges(i)
                    changes += edges[commonClass]?.size ?: 0
                    changes += edges.values.filter { list -> list.any { commonClass == it.to } }.size
                }
            }
            commonClasses[commonClass] = commonClasses[commonClass]!! + changes
        }

        extractAndPrintTopClasses(commonClasses)
    }

    private fun extractAndPrintTopClasses(classesMap: Map<Node, Int>) {
        classesMap.toList()
            .groupBy({ it.first.name.split(":").first().split("$").first() }, { it.second })
            .map { (name, list) -> name to list.sum() }
            .filter { (name, changes) -> !name.startsWith("Java.") && changes != 0 }
            .filter { (name, _) -> name !in foundClasses }
            .sortedByDescending { (_, changes) -> changes }
            .onEachIndexed { index, (name, score) ->
                foundClasses.add(name)
                if (index < 10) {
                    println("\t${index + 1}. $name: $score")
                    outputFile.appendText(name.split(".").last() + "\n")
                }
            }
    }

    private fun printStats(commonGraph: Graph) {
        println("G1  -> Nodes: ${graph1.nodes.size}, Edges: ${graph1.edgeCounts()}")
        println("G2  -> Nodes: ${graph2.nodes.size}, Edges: ${graph2.edgeCounts()}")
        println("~G  -> Nodes: ${commonGraph.nodes.size}, Edges: ${commonGraph.edgeCounts()}, NodeVariables: ${commonGraph.nodeVariables.size}, EdgeVariables: ${commonGraph.edgeVariables.size}")
        println("AVG -> Nodes: ${(graph1.nodes.size + graph2.nodes.size) / 2},  Edges: ${(graph1.edgeCounts() + graph2.edgeCounts()) / 2}")
        println("UNQ -> Nodes: ${graph1.nodes.size + graph2.nodes.size - commonGraph.nodes.size},  Edges: ${graph1.edgeCounts() + graph2.edgeCounts() - commonGraph.edgeCounts()}")
    }

    private fun printTopNodesIn(commonGraph: Graph, label: String, notInCommon: Boolean) {
        println("Top nodes in ${label}:")
        commonGraph.extractNodeCentrality()
            .filter { (node, _) -> if (notInCommon) !node.isCommon else true }
            .filter { (node, _) -> node !is NodeVariable }
            .filterNot { (node, _) -> node.name.endsWith("Test") || node.name.endsWith("Tests") }
            .onEachIndexed { index, (node, score) ->
                if (index < 10) {
                    println("\t${index + 1}. $node: $score")
                    outputFile.appendText(node.name + "\n")
                }
            }
    }

    abstract fun checkCommonGraph(commonGraph: Graph)
    abstract fun checkGraph1Diff(graph1Diff: Graph)
    abstract fun checkGraph2Diff(graph2Diff: Graph)

    fun <E> checkListsEquality(first: List<E>?, second: List<E>?, message: String = "") =
        assertTrue(message, areListsEqual(first, second))

    fun <E> checkListsInclusion(first: List<E>, second: List<E>, message: String = "") =
        assertTrue(message, areListsSubset(first, second))
}