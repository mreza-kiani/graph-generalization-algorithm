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
}