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

    fun from(graph: Graph, fileName: String, graph1: Graph, graph2: Graph) {
        val graphDepthMap = StructuralMatchingAlgorithm.extractGraphDepthMapWithNodeVariables(graph)
        val graph1OrderedLeaves = StructuralMatchingAlgorithm.extractNodesWithOrder(graph1)
        val graph2OrderedLeaves = StructuralMatchingAlgorithm.extractNodesWithOrder(graph2).filter { it.isCommon }

        val conflictNodes = graphDepthMap[-2] ?: emptyList()
        val leaves = graphDepthMap[0] ?: emptyList()
        val orderedLeaves = mutableListOf<Node>()

        val conflictNodePositionMap = mutableMapOf<Node, MutableList<Node>>()
        var i = 0
        while (i < graph2OrderedLeaves.size) {
            if (graph2OrderedLeaves[i] in conflictNodes) {
                var j = i
                while (j < graph2OrderedLeaves.size) {
                    if (graph2OrderedLeaves[j] !in conflictNodes) {
                        if (graph2OrderedLeaves[j] !in conflictNodePositionMap)
                            conflictNodePositionMap[graph2OrderedLeaves[j]] = mutableListOf()
                        conflictNodePositionMap[graph2OrderedLeaves[j]]?.add(graph2OrderedLeaves[i])
                        break
                    }
                    j++
                }
            }
            i++
        }

        graph1OrderedLeaves.forEach { node ->
            if (node in conflictNodePositionMap)
                conflictNodePositionMap[node]?.let { orderedLeaves.addAll(it) }
            if (node in leaves)
                orderedLeaves.add(node)
            if (node in conflictNodes)
                orderedLeaves.add(Node("//->${node.completeName()}", isCommon = true))
        }

        from(graph1, graph2, orderedLeaves, conflictNodes, fileName)
    }

    private fun getTemplateNodeName(node: Node, counter: Int): String = "T_${node.getRealName().uppercase()}_$counter"

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

    private fun from(graph1: Graph, graph2: Graph, leaves: List<Node>, conflictNodes: List<Node>, fileName: String) {
        var result = ""
        var counter = 1
        val g1ValueMap = mutableMapOf<String, MutableList<Int>>()
        val g2ValueMap = mutableMapOf<String, MutableList<Int>>()

        fun extractNodeCounter(node: Node): Int {
            val g1Value = extractLeavesValueOf(node, graph1)
            val g2Value = extractLeavesValueOf(node, graph2)

            var selectedCounter = counter
            if (g1Value in g1ValueMap && g2Value in g2ValueMap) {
                if (g1ValueMap[g1Value]!!.any { it in g2ValueMap[g2Value]!! }) {
                    selectedCounter = g1ValueMap[g1Value]!!.first { it in g2ValueMap[g2Value]!! }
                } else {
                    g1ValueMap[g1Value]?.add(counter)
                    g2ValueMap[g2Value]?.add(counter)
                    counter++
                }
            } else {
                if (g1ValueMap[g1Value] == null)
                    g1ValueMap[g1Value] = mutableListOf()
                if (g2ValueMap[g2Value] == null)
                    g2ValueMap[g2Value] = mutableListOf()
                g1ValueMap[g1Value]?.add(counter)
                g2ValueMap[g2Value]?.add(counter)
                counter++
            }

            return selectedCounter
        }

        leaves.forEach { node ->
            val realName = if (graph1.edgesOf(node).isNotEmpty()) {
                getTemplateNodeName(node, extractNodeCounter(node))
            } else if (node !in graph1.nodes) {
                val selectedNode = leaves.filter { it in graph1.nodes }.first { it.completeName() in node.name }
                getTemplateNodeName(selectedNode, extractNodeCounter(selectedNode))
            } else {
                node.getRealName()
            }

            when (node) {
                in conflictNodes -> result += "\n // $realName \n"
                !in graph1.nodes -> result += "// -> $realName \n"
                else -> {
                    if (realName !in listOf(".", ";", "(", ")", "{", "}")) result += " "
                    result += realName
                }
            }

            if (realName in listOf("}", ";", "{", "//", "/*", "*/")) result += "\n"
        }

        val file = File("data/$fileName.java")
        file.createNewFile()
        file.printWriter().use { out -> out.print(result) }
    }

    private fun extractLeavesValueOf(parent: Node, graph: Graph): String {
        val leaves = StructuralMatchingAlgorithm.extractLeavesOf(parent, graph)
        return leaves.joinToString("") { it.getRealName() }
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