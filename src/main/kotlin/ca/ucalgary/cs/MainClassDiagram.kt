package ca.ucalgary.cs

import ca.ucalgary.cs.Config.AST_CONTEXT
import ca.ucalgary.cs.Config.BASE_DIR
import ca.ucalgary.cs.Config.DEBUG_MODE
import ca.ucalgary.cs.Config.UNIQUE_LABELS
import ca.ucalgary.cs.Config.VISUALIZATION
import java.nio.file.Files
import java.nio.file.Paths
import kotlin.io.path.pathString
import kotlin.streams.toList

private fun choose(n: Int, k: Int): Int {
    var numerator = 1
    var denominator = 1
    for (i in n downTo n - k + 1)
        numerator *= i
    for (i in k downTo 1)
        denominator *= i
    return numerator / denominator
}

fun main() {
    DEBUG_MODE = false
    UNIQUE_LABELS = true
    AST_CONTEXT = false
    VISUALIZATION = false
    BASE_DIR = "src/main/resources/Selenium/Graph"

    val files = Files.walk(Paths.get(BASE_DIR)).map { it.pathString }.filter { it.endsWith(".txt") }.toList()
    val n = files.size
    val totalPairs = choose(n, 2)

    val timeMap = mutableMapOf<String, Long>()

    files.forEachIndexed { i, input1 ->
        for (j in (i + 1) until n) {
            println("${(choose(n, 2) - choose(n - i, 2) + (j - i))} / $totalPairs")
            val input2 = files[j]
            runGeneralizationAndMeasureTime(input1, input2, timeMap)
        }
    }
    printExecutionTimeReport(timeMap)
}