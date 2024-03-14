package ca.ucalgary.cs

import ca.ucalgary.cs.Config.BASE_DIR
import ca.ucalgary.cs.Config.CONTEXT
import ca.ucalgary.cs.Config.DEBUG_MODE
import ca.ucalgary.cs.Config.VISUALIZATION
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime


@OptIn(ExperimentalTime::class)
fun runGenDiffAndMeasureTime(input1: String, input2: String, timeMap: MutableMap<String, Long>) {
    var key: String
    val duration = measureTime {
        val (commonGraph, graph1, graph2) = runGeneralization(input1, input2)
        key = "${extractDirectoryNumber(input1)} ${commonGraph.nodes.size}, ${commonGraph.edgeCounts()}, ${commonGraph.nodeVariables.size}, ${commonGraph.edgeVariables.size}, ${graph1.nodes.size}, ${graph1.edgeCounts()}, ${graph2.nodes.size}, ${graph2.edgeCounts()},"
    }
    timeMap[key] = duration.inWholeMilliseconds
}

fun main() {
    DEBUG_MODE = false
    CONTEXT = Context.AST_DIFF
    VISUALIZATION = false
    BASE_DIR = "src/main/resources/Mays"

    val data = extractListOfFiles()

    val timeMap = mutableMapOf<String, Long>()

    data.forEachIndexed { index, (input1, input2) ->
        println("${index + 1} / ${data.size}")
        runGenDiffAndMeasureTime(input1, input2, timeMap)
    }

    printExecutionTimeReport(timeMap)
}