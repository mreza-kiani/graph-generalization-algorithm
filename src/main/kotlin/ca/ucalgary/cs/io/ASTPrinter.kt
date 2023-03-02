package ca.ucalgary.cs.io

import ca.ucalgary.cs.algorithm.StructuralMatchingAlgorithm
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import java.io.File

object ASTPrinter {
    fun from(graph: Graph, fileName: String) {
        val graphDepthMap = StructuralMatchingAlgorithm.extractGraphDepthMapWithNodeVariables(graph)

        from(graph, graphDepthMap, fileName)
    }

    fun from(graph: Graph, fileName: String, orderedGraph: Graph, graphNumber: Int) {
        val graphDepthMap = StructuralMatchingAlgorithm.extractGraphDepthMapWithNodeVariables(graph)
        val orderedGraphDepthMap = StructuralMatchingAlgorithm.getGraphDepthMap(orderedGraph, graphNumber)

        val leaves = graphDepthMap[0] ?: emptyList()
        val orderedLeaves = mutableListOf<Node>()

        orderedGraphDepthMap[0]?.forEach { node -> if (node in leaves) orderedLeaves.add(node) }
        graphDepthMap[0] = orderedLeaves

        from(graph, graphDepthMap, fileName)
    }

    fun from(graph: Graph, graphNumber: Int, fileName: String) {
        val graphDepthMap = StructuralMatchingAlgorithm.getGraphDepthMap(graph, graphNumber)

        from(graph, graphDepthMap, fileName)
    }

    private fun from(graph: Graph, graphDepthMap: Map<Int, List<Node>>, fileName: String) {
        val templateValueMap = mutableMapOf<String, String>()
        var templateCounter = 1

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
                    val leavesValue = extractLeavesValueOf(parent, graph)
                    if (templateValueMap[leavesValue] != null) {
                        result += " ${templateValueMap[leavesValue]} "
                    } else {
                        val nodeName = "T_${parent.getRealName().uppercase()}_$templateCounter"
                        templateValueMap[leavesValue] = nodeName
                        templateCounter++
                        result += " $nodeName "
                    }
                    lastUncommonParent = parent
                }
            }

            if (child.getRealName() in listOf("}", ";", "{", "\\\\", "\\*")) result += "\n"
        }

        val file = File("data/$fileName.java")
        file.createNewFile()
        file.printWriter().use { out -> out.print(result) }
    }

    private fun extractLeavesValueOf(parent: Node, graph: Graph): String {
        val leaves = StructuralMatchingAlgorithm.extractLeavesOf(parent, graph)
        return leaves.joinToString("-") { it.getRealName() }
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