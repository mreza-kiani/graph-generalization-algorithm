package ca.ucalgary.cs

import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.io.ASTPrinter
import ca.ucalgary.cs.io.GraphScanner
import ca.ucalgary.cs.io.visualize
import java.nio.file.Files
import java.nio.file.Paths
import kotlin.io.path.name
import kotlin.io.path.pathString
import kotlin.streams.toList
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime


val BASE_DIR = "src/main/resources/Mays"
val DEBUG_MODE = false

fun extractCategory(input: String): String {
    return input.split("/")[4]
}

fun extractTemplateNumber(input: String): String {
    return input.split("/")[5]
}

fun String.getBaseName(): String {
    return this.split("/").last().split(".").first()
}

fun extractDirName(input1: String, input2: String): String {
    val input1Name = input1.getBaseName()
    val input2Name = input2.getBaseName().filter { it.isDigit() }
    return "${input1Name}vs$input2Name"
}

fun runGeneralization(input1: String, input2: String) {
    val category = extractCategory(input1)
    val dirName = extractDirName(input1, input2)
    val baseName = input1.substringBefore("/Data/") + "/Output"

    val graph1: Graph = GraphScanner.scanWithDefinition(input1)
    val graph2: Graph = GraphScanner.scanWithDefinition(input2)

    println("-----------------$baseName-------------------")

    if (DEBUG_MODE) {
        graph1.visualize("$baseName/G1")
        graph2.visualize("$baseName/G2")
    }

    val startTime = System.currentTimeMillis()
    val (commonGraph, graph1Diff, graph2Diff) = Graph.compare(graph1, graph2)
    val endTime = System.currentTimeMillis()

    println("---------------------------------------------")
    println("Comparing took ${endTime - startTime} millis")
    println("---------------------------------------------")

    if (DEBUG_MODE) {
        println("Common Graph:")
        println(commonGraph)

        println("Graph 1 Diff:")
        println(graph1Diff)

        println("Graph 2 Diff:")
        println(graph2Diff)
        println("---------------------------------------------")
    }

    ASTPrinter.from(commonGraph, fileName = "$baseName/Generalization", graph1, graph2)

    if (DEBUG_MODE) {
        ASTPrinter.from(graph1, graphNumber = 1, fileName = "$baseName/G1_Generalized")
        ASTPrinter.from(graph2, graphNumber = 2, fileName = "$baseName/G2_Generalized")
        graph1.visualize("$baseName/G1_Generalized", commonGraph)
        graph2.visualize("$baseName/G2_Generalized", commonGraph)
        commonGraph.visualize("$baseName/Generalization")
        graph1Diff.visualize("$baseName/G1_Differences")
        graph2Diff.visualize("$baseName/G2_Differences")
    }
}

@OptIn(ExperimentalTime::class)
fun main() {
    val data = Files.walk(Paths.get(BASE_DIR))
        .filter { it.name == "Data" }
        .map { dir ->
            Files.walk(Paths.get(dir.pathString))
                .filter { ".txt" in it.name }
                .map { "${dir.pathString}/${it.fileName}" }
                .toList()
        }.toList()

    val timeMap = mutableMapOf<String, Long>()

    data.forEachIndexed { index, (input1, input2) ->
        println("${index + 1} / ${data.size}")
        val duration = measureTime {
            runGeneralization(input1, input2)
        }
        timeMap[extractCategory(input1)] = (timeMap[extractCategory(input1)] ?: 0) + duration.inWholeMilliseconds
        timeMap["${extractCategory(input1)}/${extractTemplateNumber(input1)}"] = duration.inWholeMilliseconds
    }

    println("----------------------Time Report-----------------------")
    timeMap.toSortedMap().forEach { (key, duration) ->
        println("$key -> $duration")
    }
    println("-------------------------Done!--------------------------")
}