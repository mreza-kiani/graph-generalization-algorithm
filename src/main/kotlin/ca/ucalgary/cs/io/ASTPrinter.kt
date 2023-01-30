package ca.ucalgary.cs.io

import ca.ucalgary.cs.algorithm.StructuralMatchingAlgorithm
import ca.ucalgary.cs.graph.Graph
import java.io.File

object ASTPrinter {
    fun from(graph: Graph, fileName: String) {
        val graphDepthMap = StructuralMatchingAlgorithm.extractGraphDepthMap(graph)

        var uncommonNode = false
        var result = ""
        graphDepthMap[0]?.forEach { child ->
            if (child.isCommon) {
                uncommonNode = false
                val realName = child.getRealName()
                if (realName !in listOf(".", ";", "(", ")", "{","}"))
                    result += " "
                result += realName
            } else {
                if (!uncommonNode)
                    result += " T "
                uncommonNode = true
            }

            if (child.getRealName() in listOf("}", ";", "{", "\\\\", "\\*"))
                result += "\n"
        }

        val file = File("data/$fileName.java")
        file.createNewFile()
        file.printWriter().use { out -> out.print(result) }
    }
}