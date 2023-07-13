package ca.ucalgary.cs

import ca.ucalgary.cs.Config.AST_CONTEXT
import ca.ucalgary.cs.Config.BASE_DIR
import ca.ucalgary.cs.Config.DEBUG_MODE
import ca.ucalgary.cs.Config.UNIQUE_LABELS
import ca.ucalgary.cs.Config.VISUALIZATION
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import kotlin.io.path.name
import kotlin.io.path.pathString
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.streams.toList
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime


fun extractDirectoryNumber(input: String): String {
    return input.split("/")[9]
}

@OptIn(ExperimentalTime::class)
fun runGeneralizationAndMeasureTime(input1: String, input2: String, timeMap: MutableMap<String, Long>, infoMap: MutableMap<String, String>) {
    var key: String
    val duration = measureTime {
        val (commonGraph, graph1, graph2) = runGeneralization(input1, input2)
        key = extractDirectoryNumber(input1)
        val info = "${commonGraph.nodes.size}, ${commonGraph.edgeCounts()}, ${commonGraph.nodeVariables.size}, ${commonGraph.edgeVariables.size}, ${graph1.nodes.size}, ${graph1.edgeCounts()}, ${graph2.nodes.size}, ${graph2.edgeCounts()},"
        if (infoMap[key] == null)
            infoMap[key] = info
    }
    timeMap[key] = duration.inWholeMilliseconds
}

fun saveAggregatedExecutionTimeReport(
    fileName: String,
    timeMap: MutableMap<String, MutableList<Long>>,
    infoMap: MutableMap<String, String> = mutableMapOf()
) {
    var result = "name,generalization_nodes,generalization_edges,generalization_node_variables,generalization_edge_variables,g1_nodes,g1_edges,g2_nodes,g2_edges,time0,time1,time2,time3,time4,avg_time,std_dev\n"
    timeMap.toSortedMap().forEach { (key, durations) ->
        val info = infoMap[key] ?: ""
        result += "$key,$info${durations.joinToString(",")},${durations.average()},${durations.standardDeviation()}\n"
    }
    File(fileName).writeText(result)
}

private fun List<Long>.standardDeviation(): Double {
    val average = this.average()
    return sqrt(this.sumOf { (it - average).pow(2) } / this.size)
}

fun main() {
    DEBUG_MODE = false
    UNIQUE_LABELS = false
    AST_CONTEXT = true
    VISUALIZATION = false
    BASE_DIR = "/home/mamareza/UofC/Thesis/CodeSearchNet/notebooks/java/RandomCodeSearchNet"

    val data = extractListOfFiles()

    var finalTimeMap = mutableMapOf<String, MutableList<Long>>()
    val infoMap = mutableMapOf<String, String>()
    for (k in 0..4) {
        val timeMap = mutableMapOf<String, Long>()

        data.shuffled().forEachIndexed { index, (input1, input2) ->
            println("${index + 1} / ${data.size}")
            runGeneralizationAndMeasureTime(input1, input2, timeMap, infoMap)
        }

        printExecutionTimeReport(timeMap)

        if (k == 0)
            finalTimeMap = timeMap.map { (key, value) -> key to mutableListOf(value) }.toMap().toMutableMap()
        else
            timeMap.forEach { (key, value) -> finalTimeMap[key]?.add(value) }
    }

    saveAggregatedExecutionTimeReport("/home/mamareza/UofC/Thesis/new-approach/src/main/resources/scripts/performance/CodeSearchNet/RandomAggregatedData.csv", finalTimeMap, infoMap)
}