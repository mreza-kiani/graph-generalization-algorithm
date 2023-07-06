package ca.ucalgary.cs.io

import ca.ucalgary.cs.Config.AST_CONTEXT
import ca.ucalgary.cs.algorithm.StructuralMatchingAlgorithm
import ca.ucalgary.cs.graph.EdgeVariable
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import ca.ucalgary.cs.graph.NodeVariable
import java.io.File

object ASTPrinter {
    fun from(graph: Graph, fileName: String) {
        val graphDepthMap = StructuralMatchingAlgorithm.extractGraphDepthMapWithNodeVariables(graph)

        from(graph, graphDepthMap, fileName)
    }

    fun from(generalizedGraph: Graph, fileName: String, graph1: Graph, graph2: Graph) {
        if (!AST_CONTEXT)
            return
        val graphDepthMap = StructuralMatchingAlgorithm.extractGraphDepthMapWithNodeVariables(generalizedGraph)
        val graph1OrderedLeaves = StructuralMatchingAlgorithm.extractNodesWithOrder(graph1)
        val graph2OrderedLeaves = StructuralMatchingAlgorithm.extractNodesWithOrder(graph2)
//        val combinedGraphsOrderedLeaves = combineOrderedLeaves(graph1OrderedLeaves, graph2OrderedLeaves)
        val commonNodes = graph2OrderedLeaves.filter { it.isCommon }

        val conflictNodes = graphDepthMap[-2] ?: emptyList()
        val leaves = graphDepthMap[0] ?: emptyList()
        val orderedLeaves = mutableListOf<Node>()
        val nodeVariablesWithoutRep = (graphDepthMap[-3] ?: emptyList()).filterIsInstance<NodeVariable>()
        val edgeVariableRepMap = mutableMapOf<Node, EdgeVariable>()
        val fixingNodePositionMap = nodeVariablesWithoutRep
            .associateWith { nv -> generalizedGraph.edgeVariablesOf(nv) }
            .filter { (_, list) -> list.size == 1 }
            .map { (nv, list) -> nv to list.first() }
            .map { (nv, ev) -> ev to nv }
            .map { (ev, nv) -> ev to ev.otherLegThan(nv) as Node }
            .map { (ev, n) ->
                val g1UncommonNodes = (ev.graph1Edges[n]?.map { it.to } ?: emptyList()) +
                        ev.graph1Edges.filter { (_, list) -> n in list.map { it.to } }.keys

                val g2UncommonNodes = (ev.graph2Edges[n]?.map { it.to } ?: emptyList()) +
                        ev.graph2Edges.filter { (_, list) -> n in list.map { it.to } }.keys

                val map1 = extractFixingNodePositionMap(
                    graph1OrderedLeaves,
                    targetNodes = g1UncommonNodes,
                    eligibleNodes = commonNodes
                )
                val map2 = extractFixingNodePositionMap(
                    graph2OrderedLeaves,
                    targetNodes = g2UncommonNodes,
                    eligibleNodes = commonNodes
                )

                edgeVariableRepMap[n] = ev

                mergeMaps(map1, map2)
//                mergeMapsToKeepOneResultPerKey(map1, map2, graph1, graph2)
            }.fold(mapOf<Node, List<Node>>()) { acc, curr -> mergeMaps(acc, curr) }
            .map { (key, list) -> key to IONode.from(list, graph1, graph2) }.toMap()

        val conflictNodePositionMap =
            extractFixingNodePositionMap(graph2OrderedLeaves, targetNodes = conflictNodes, eligibleNodes = commonNodes)

        graph1OrderedLeaves.forEach { node ->
            if (node in fixingNodePositionMap)
                fixingNodePositionMap[node]?.let { orderedLeaves.addAll(it) }
            if (node in conflictNodePositionMap)
                conflictNodePositionMap[node]?.let { orderedLeaves.addAll(it) }
            if (node in leaves)
                orderedLeaves.add(node)
//            if (node in conflictNodes)
//                orderedLeaves.add(Node("//${node.completeName()}", isCommon = true))
        }

//        filterRepeatedUselessLeaves(orderedLeaves)

        from(graph1, graph2, orderedLeaves, conflictNodes, fileName, edgeVariableRepMap)
    }

    private fun mergeMapsToKeepOneResultPerKey(
        map1: Map<Node, List<Node>>,
        map2: Map<Node, List<Node>>,
        graph1: Graph,
        graph2: Graph
    ): Map<Node, List<Node>> {
        return if (map1.isEmpty())
            map2
        else if (map2.isEmpty())
            map1
        else {
            val result = mutableMapOf<Node, List<Node>>()
            val commonKeys = map1.keys.filter { it in map2.keys }
            map1.filter { (key, _) -> key !in commonKeys }.forEach { (key, list) -> result[key] = list }
            map2.filter { (key, _) -> key !in commonKeys }.forEach { (key, list) -> result[key] = list }
            commonKeys.forEach { key ->
                val list1 = map1[key] ?: emptyList()
                val list2 = map2[key] ?: emptyList()
                if (list1.size > list2.size)
                    result[key] = list1
                else if (list1.size < list2.size)
                    result[key] = list2
                else {
                    val value1 = extractLeavesValueOf(list1.first(), graph1)
                    val value2 = extractLeavesValueOf(list2.first(), graph2)
                    if (value1.length >= value2.length)
                        result[key] = list1
                    else
                        result[key] = list2
                }
            }
            result
        }
    }

    private fun mergeMaps(map1: Map<Node, List<Node>>, map2: Map<Node, List<Node>>) =
        (map1.asSequence() + map2.asSequence())
            .distinct()
            .groupBy({ it.key }, { it.value })
            .mapValues { (_, values) -> values.flatten().toSet().toList() }

    private fun extractFixingNodePositionMap(
        graphOrderedLeaves: List<Node>,
        targetNodes: List<Node>,
        eligibleNodes: List<Node>,
        targetSubstitutionMap: Map<Node, Node> = emptyMap()
    ): Map<Node, List<Node>> {
        val fixingNodePositionMap = mutableMapOf<Node, MutableList<Node>>()

        var i = 0
        while (i < graphOrderedLeaves.size) {
            if (graphOrderedLeaves[i] in targetNodes) {
                var j = i
                while (j < graphOrderedLeaves.size) {
                    if (graphOrderedLeaves[j] !in targetNodes && graphOrderedLeaves[j] in eligibleNodes) {
                        if (graphOrderedLeaves[j] !in fixingNodePositionMap)
                            fixingNodePositionMap[graphOrderedLeaves[j]] = mutableListOf()
                        fixingNodePositionMap[graphOrderedLeaves[j]]?.add(
                            targetSubstitutionMap[graphOrderedLeaves[i]] ?: graphOrderedLeaves[i]
                        )
                        break
                    }
                    j++
                }
            }
            i++
        }

        return fixingNodePositionMap
    }

    private fun getTemplateNodeName(node: Node, counter: Int): String = "T${counter}_${node.getRealName().uppercase()}"

    fun from(graph: Graph, graphNumber: Int, fileName: String) {
        if (!AST_CONTEXT)
            return
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
                        val nodeName = getTemplateNodeName(parent, templateCounter)
                        templateValueMap[leavesValue] = nodeName
                        templateCounter++
                        result += " $nodeName "
                        if (";" in extractLeavesValueOf(parent, graph))
                            result += ";"
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

    private fun from(graph1: Graph, graph2: Graph, leaves: List<Node>, conflictNodes: List<Node>, fileName: String, edgeVariableRepMap: Map<Node, EdgeVariable>) {
        var result = ""
        var counter = 1
        val g1ValueMap = mutableMapOf<String, MutableList<Int>>()
        val g2ValueMap = mutableMapOf<String, MutableList<Int>>()

        fun extractNodeCounter(node: Node, relatedEdgeVariable: EdgeVariable? = null): Int {
            val g1Value: String
            val g2Value: String
            if (node is IONode) {
                g1Value = node.g1Representatives.joinToString { extractLeavesValueOf(it, graph1) }
                g2Value = node.g2Representatives.joinToString { extractLeavesValueOf(it, graph2) }
            } else if (relatedEdgeVariable != null) {
                val g1Parent = relatedEdgeVariable.graph1Edges[node]?.firstOrNull()?.to
                val g2Parent = relatedEdgeVariable.graph2Edges[node]?.firstOrNull()?.to
                if (g1Parent != null && g2Parent != null) {
                    g1Value = extractLeavesValueOf(g1Parent, graph1)
                    g2Value = extractLeavesValueOf(g2Parent, graph2)
                } else {
                    g1Value = extractLeavesValueOf(node, graph1)
                    g2Value = extractLeavesValueOf(node, graph2)
                }
            } else {
                g1Value = extractLeavesValueOf(node, graph1)
                g2Value = extractLeavesValueOf(node, graph2)
            }

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

        fun isSemicolonInNode(node: IONode) =
            node.g1Representatives.all { ";" in extractLeavesValueOf(it, graph1) } &&
                    node.g2Representatives.all { ";" in extractLeavesValueOf(it, graph2) }

        leaves.forEach { node ->
            val realName = if (node is IONode) {
                getTemplateNodeName(node, extractNodeCounter(node))
            } else if (graph1.edgesOf(node).isNotEmpty() || graph2.edgesOf(node).isNotEmpty()) {
                getTemplateNodeName(node, extractNodeCounter(node, edgeVariableRepMap[node]))
            } else if (node !in (graph1.nodes + graph2.nodes)) {
                val selectedNode = leaves.filter { it in graph1.nodes }.firstOrNull { it.completeName() in node.name } ?: return@forEach
                getTemplateNodeName(selectedNode, extractNodeCounter(selectedNode))
            } else {
                node.getRealName()
            }

            when (node) {
                is IONode -> result += " $realName "
                in conflictNodes -> result += "" //"\n // $realName \n"
                !in (graph1.nodes + graph2.nodes) -> result += "" //""// -> $realName \n"
                else -> {
                    if (realName !in listOf(".", ";", "(", ")", "{", "}")) result += " "
                    result += realName
                }
            }

            if (node is IONode && isSemicolonInNode(node)) result += ";"
            if (listOf("}", ";", "{", "//", "/*", "*/").any { it in realName }) result += "\n"
        }

        val file = File("$fileName.java")
        file.parentFile.mkdirs()
        file.createNewFile()
        file.printWriter().use { out -> out.print(result) }
    }

    private fun filterRepeatedUselessLeaves(orderedLeaves: MutableList<Node>) {
        var baseNodeName = ""
        var i = 0
        while (true) {
            if (i >= orderedLeaves.size)
                break
            if (i == 0 || (baseNodeName !in orderedLeaves[i].completeName())) {
                baseNodeName = orderedLeaves[i].completeName().replace("//", "")
                i++
            } else {
                if (listOf("(", "{").any { baseNodeName.startsWith(it) } || listOf(")", "}").any { baseNodeName.endsWith(it) }) {
                    i++
                } else {
                    orderedLeaves.remove(orderedLeaves[i])
                    if (baseNodeName in orderedLeaves[i - 1].completeName()) {
                        i--
                        orderedLeaves.remove(orderedLeaves[i])
                    }
                }
            }
        }
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