package ca.ucalgary.cs.io

import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import java.io.File

object GraphScanner {
    fun scan(path: String): Graph {
        val lines = File(path).readLines()
        val nodes = extractNodes(lines[1])
        val edges = extractEdges(lines.subList(fromIndex = 3, toIndex = lines.size - 2))

        return Graph.from(nodes, edges)
    }

    private fun extractEdges(lines: List<String>): Map<Node, List<Node>> {
        return lines
            .map { it.trim().split(" to ") }
            .associate { parts -> Node(parts[0].capitalize()) to extractNodes(parts[1]) }
    }

    private fun extractNodes(line: String): List<Node> {
        val startOfNodes = line.indexOfFirst { it == '(' }
        val endOfNodes = line.indexOfFirst { it == ')' }
        return line
            .substring(startIndex = startOfNodes + 1, endIndex = endOfNodes)
            .split(",")
            .map { it.trim() }
            .filter { it.isNotBlank() }
            .map { Node(it.capitalize()) }
    }

    fun scanWithDefinition(path: String): Graph {
        val lines = File(path).readLines()
        val nodesMap = extractNodes(lines.filter { " = Node(" in it })
        val edges = extractEdgesOf(nodesMap, lines.filter { " to listOf(" in it })

        return Graph.from(nodesMap.values.toList(), edges)
    }

    private fun extractNodes(lines: List<String>): Map<String, Node> {
        return lines
            .map { it.split(" = Node(") }
            .associate { parts ->
                val nodeName = parts[0].split(" ").last()
                val defParts = parts[1].substring(0, parts[1].length - 1).split(", isDuplicate = ")
                val nodeValue = defParts[0].substring(1, defParts[0].length - 1)
                val isDuplicated = !(defParts.size == 1 || defParts[1] == "false")

                nodeName to Node(nodeValue, isDuplicated)
            }
    }

    private fun extractEdgesOf(nodesMap: Map<String, Node>, lines: List<String>): Map<Node, List<Node>> {
        return lines
            .map { line -> line.trim().split(" to listOf")  }
            .map { parts -> parts[0] to parts[1].substring(1, parts[1].length - 2).split(", ") }
            .associate { (from, tos) -> nodesMap[from]!! to tos.map { nodesMap[it]!! } }
    }
}