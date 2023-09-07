package ca.ucalgary.cs

import ca.ucalgary.cs.Config.BASE_DIR
import ca.ucalgary.cs.Config.CONTEXT
import ca.ucalgary.cs.Config.DEBUG_MODE
import ca.ucalgary.cs.Config.VISUALIZATION
import java.nio.file.Files
import java.nio.file.Paths
import kotlin.io.path.pathString
import kotlin.streams.toList


private fun String.isWithDependencies() = "-all" in this

fun main() {
    DEBUG_MODE = false
    CONTEXT = Context.CLASS_DIAGRAM
    VISUALIZATION = false
    BASE_DIR = "src/main/resources/Selenium/Graph"

    val files = Files.walk(Paths.get(BASE_DIR)).map { it.pathString }.filter { it.endsWith(".txt") }.toList()
    val n = files.size
    val totalPairs = choose(n, 2)

    val expTypes = listOf("AggregatedData", "AggregatedDataWithoutDependencies", "AggregatedDataWithDependencies")
    for (exp in 0..2) {
        var finalTimeMap = mutableMapOf<String, MutableList<Long>>()
        for (k in 0..9) {
            val timeMap = mutableMapOf<String, Long>()

            files.forEachIndexed { i, input1 ->
                for (j in (i + 1) until n) {
                    println("${(choose(n, 2) - choose(n - i, 2) + (j - i))} / $totalPairs")
                    val input2 = files[j]
                    when (exp) {
                        1 -> if (input1.isWithDependencies() || input2.isWithDependencies()) continue
                        2 -> if (!input1.isWithDependencies() || !input2.isWithDependencies()) continue
                    }
                    runGeneralizationAndMeasureTime(input1, input2, timeMap)
                }
            }
            printExecutionTimeReport(timeMap)
            if (k == 0)
                finalTimeMap = timeMap.map { (key, value) -> key to mutableListOf(value) }.toMap().toMutableMap()
            else
                timeMap.forEach { (key, value) -> finalTimeMap[key]?.add(value) }
        }

        saveAggregatedExecutionTimeReport("$BASE_DIR/../${expTypes[exp]}.csv", finalTimeMap)
    }
}