package ca.ucalgary.cs.io

import ca.ucalgary.cs.algorithm.StructuralMatchingAlgorithm
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import java.io.File

object ASTPrinter {
    fun from(graph: Graph, fileName: String) {
        val graphDepthMap = StructuralMatchingAlgorithm.extractGraphDepthMap(graph)

        from(graph, graphDepthMap, fileName)
    }

    fun from(graph: Graph, graphNumber: Int, fileName: String) {
        val graphDepthMap = StructuralMatchingAlgorithm.getGraphDepthMap(graph, graphNumber)

        from(graph, graphDepthMap, fileName)
    }

    private fun from(graph: Graph, graphDepthMap: Map<Int, List<Node>>, fileName: String) {
        var lastUncommonParent: Node? = null
        var result = ""
        graphDepthMap[0]?.forEach { child ->
            if (child.isCommon) {
                val realName = child.getRealName()
                if (realName !in listOf(".", ";", "(", ")", "{", "}")) result += " "
                result += realName
            } else {
                val parent = getNodeFirstUncommonParent(child, graph)
                if (lastUncommonParent != parent) {
                    result += " T_${parent.getRealName().uppercase()} "
                    lastUncommonParent = parent
                }
            }

            if (child.getRealName() in listOf("}", ";", "{", "\\\\", "\\*")) result += "\n"
        }

        val file = File("data/$fileName.java")
        file.createNewFile()
        file.printWriter().use { out -> out.print(result) }
    }

    private fun getNodeFirstUncommonParent(child: Node, graph: Graph): Node {
        var curr: Node = findParent(child, graph) ?: error("IMPOSSIBLE!")
        var lastParent: Node
        do {
            lastParent = curr
            curr = findParent(curr, graph) ?: return lastParent
        } while (!curr.isCommon)
        return lastParent
    }

    private fun findParent(child: Node, graph: Graph): Node? {
        return graph.findParents(child).firstOrNull()
    }
}