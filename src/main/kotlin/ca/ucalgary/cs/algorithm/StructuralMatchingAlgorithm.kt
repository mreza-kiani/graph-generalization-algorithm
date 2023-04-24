package ca.ucalgary.cs.algorithm

import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import ca.ucalgary.cs.graph.NodeVariable
import java.util.*

object StructuralMatchingAlgorithm {
    private const val MATCHING_THRESHOLD = 0.5
    private const val NODE_SIMILARITY_FACTOR = 0.5
    private const val PARENT_SIMILARITY_FACTOR = 0.2
    private const val CHILDREN_SIMILARITY_FACTOR = 0.3
    var nodesMatchingHappened = false
    var iteration = 1
    private var g1DepthMap: Map<Int, List<Node>> = emptyMap()
    private var g2DepthMap: Map<Int, List<Node>> = emptyMap()

    fun matchSimilarNodes(graph1: Graph, graph2: Graph, ignoreDraw: Boolean) {
        nodesMatchingHappened = false
        val similarities = List(graph1.nodes.size) { MutableList(graph2.nodes.size) { 0.0 } }

        compareLeaves(similarities, graph1, graph2)
        compareNonLeaves(similarities, graph1, graph2)

        if (ignoreDraw)
            matchSimilarNodesEvenIfDraw(similarities, graph1, graph2)
        else
            matchOnlySimilarNodes(similarities, graph1, graph2)
        println("----------------------------------------iteration:${iteration++}----------------------------------------")
    }

    private fun compareLeaves(similarities: List<MutableList<Double>>, graph1: Graph, graph2: Graph) {
        val g1Leaves = graph1.getLeaves()
        val g2Leaves = graph2.getLeaves()

        g1Leaves.forEach { g1Leaf ->
            val g1NodeIndex = graph1.indexOf(g1Leaf)
            graph2.nodes.forEachIndexed { g2NodeIndex, g2Node ->
                if (g2Node !in g2Leaves)
                    return@forEachIndexed

                val leavesSimilarity = NodeMatchingAlgorithm.similarityScoreOf(g1Leaf.name, g2Node.name)
                val parentsSimilarity = NodeMatchingAlgorithm.similarityScoreOf(graph1.findParents(g1Leaf), graph2.findParents(g2Node))
                similarities[g1NodeIndex][g2NodeIndex] = similarityOf(leavesSimilarity, parentsSimilarity, leavesSimilarity)
            }
        }
    }

    private fun compareNonLeaves(similarities: List<MutableList<Double>>, graph1: Graph, graph2: Graph) {
        fun extractChildrenSimilarity(g1ParentNode: Node, g2ParentNode: Node): Double {
            val g1Children = graph1.edgesOf(g1ParentNode)
            val g2Children = graph2.edgesOf(g2ParentNode)

            return 2.0 * g1Children.sumOf { g1Edge ->
                val g1Index = graph1.indexOf(g1Edge.to)
                g2Children.maxOfOrNull { g2Edge ->
                    val g2Index = graph2.indexOf(g2Edge.to)
                    similarities[g1Index][g2Index]
                } ?: 0.0
            } / (g1Children.size + g2Children.size)
        }

        val graph1DepthMap = getGraphDepthMap(graph1, graphNumber = 1)
        val graph2DepthMap = getGraphDepthMap(graph2, graphNumber = 2)
        val graph2MaximumDepth = graph2DepthMap.maxOf { (depth, _) -> depth }

        graph1DepthMap.forEach { (depth, g1Nodes) ->
            if (depth == 0)
                return@forEach

            g1Nodes.forEach { g1Node ->
                for (i in 1..graph2MaximumDepth) {
                    graph2DepthMap[i]?.forEach { g2Node ->
                        val leavesSimilarity = NodeMatchingAlgorithm.similarityScoreOf(g1Node, g2Node)
                        val parentsSimilarity = NodeMatchingAlgorithm.similarityScoreOf(graph1.findParents(g1Node), graph2.findParents(g2Node))
                        val childrenSimilarity = extractChildrenSimilarity(g1Node, g2Node)

                        similarities[graph1.indexOf(g1Node)][graph2.indexOf(g2Node)] = similarityOf(leavesSimilarity, parentsSimilarity, childrenSimilarity)
                    }
                }
            }
        }
    }

    private fun similarityOf(nodesSimilarity: Double, parentsSimilarity: Double, childrenSimilarity: Double): Double =
        nodesSimilarity * NODE_SIMILARITY_FACTOR + parentsSimilarity * PARENT_SIMILARITY_FACTOR + childrenSimilarity * CHILDREN_SIMILARITY_FACTOR

    private fun extractPriorityQueue(similarities: List<MutableList<Double>>, graph1: Graph, graph2: Graph): PriorityQueue<Pair<String, Double>> {
        val compareBySimilarity: Comparator<Pair<String, Double>> = compareByDescending { it.second }
        val queue = PriorityQueue(compareBySimilarity)

        graph1.nodes.forEachIndexed { g1Index, g1Node ->
            if (g1Node.isCommon)
                return@forEachIndexed
            graph2.nodes.forEachIndexed { g2Index, g2Node ->
                if (g2Node.isCommon)
                    return@forEachIndexed
                queue.add("${g1Node.completeName()}#${g2Node.completeName()}" to similarities[g1Index][g2Index])
            }
        }

        return queue
    }

    private fun matchOnlySimilarNodes(similarities: List<MutableList<Double>>, graph1: Graph, graph2: Graph) {
        val queue = extractPriorityQueue(similarities, graph1, graph2)

        while (queue.isNotEmpty()) {
            val (matchedKey, matchedSimilarityScore) = queue.remove()
            if (matchedSimilarityScore < MATCHING_THRESHOLD)
                continue

            val (g1Code, g2Code) = matchedKey.split("#")
            val drawMap = mutableMapOf<String, Double>()
            val drawList = mutableSetOf("$g1Code#", "#$g2Code")
            var isDraw = false

            while (queue.isNotEmpty()) {
                val (key, score) = queue.remove()
                if (score != matchedSimilarityScore) {
                    queue.add(key to score)
                    break
                } else if (drawList.any { it in key }) {
                    val (g1Key, g2Key) = key.split("#")
                    drawList.add("$g1Key#")
                    drawList.add("#$g2Key")
                    isDraw = true
                } else {
                    drawMap[key] = score
                }
                drawMap.forEach { (key, _) ->
                    if (drawList.any { it in key }) {
                        val (g1Key, g2Key) = key.split("#")
                        drawList.add("$g1Key#")
                        drawList.add("#$g2Key")
                    }
                }
                drawMap.entries.removeIf { (key, _) -> drawList.any { it in key } }
            }
            queue.addAll(drawMap.toList())
            println("match: ${if (isDraw) 'x' else '✓'} list: $drawList score: $matchedSimilarityScore")

            if (!isDraw) {
                val g1Node = graph1.nodes.first { it.completeName() == g1Code }
                val g2Node = graph2.nodes.first { it.completeName() == g2Code }

                applyMatchingInNames(g1Node, g2Node)
            }
            queue.removeIf { (key, _) -> drawList.any { it in key } }
        }
    }

    private fun matchSimilarNodesEvenIfDraw(similarities: List<MutableList<Double>>, graph1: Graph, graph2: Graph) {
        val queue = extractPriorityQueue(similarities, graph1, graph2)

        while (queue.isNotEmpty()) {
            val (matchedKey, matchedSimilarityScore) = queue.remove()
            if (matchedSimilarityScore < MATCHING_THRESHOLD)
                continue

            val (g1Code, g2Code) = matchedKey.split("#")

            val g1Node = graph1.nodes.first { it.completeName() == g1Code }
            val g2Node = graph2.nodes.first { it.completeName() == g2Code }

            applyMatchingInNames(g1Node, g2Node)

            queue.removeIf { (key, _) -> "$g1Code#" in key || "#$g2Code" in key }
        }
    }

    private fun applyMatchingInNames(source: Node, matchedNode: Node) {
        nodesMatchingHappened = true
        println("\t$source <> $matchedNode")
        source.name = NodeMatchingAlgorithm.extractLongestCommonSubstringWord(source.name, matchedNode.name)
        if (source.code != null)
            source.name += "_${source.code}"
        source.isCommon = true
        matchedNode.name = source.name
        matchedNode.code = source.code
        matchedNode.isCommon = true
    }

    fun getGraphDepthMap(graph: Graph, graphNumber: Int): Map<Int, List<Node>> {
        when (graphNumber) {
            1 -> if (g1DepthMap.isNotEmpty()) return g1DepthMap
            2 -> if (g2DepthMap.isNotEmpty()) return g2DepthMap
        }

        val result = extractGraphDepthMap(graph)
        when (graphNumber) {
            1 -> g1DepthMap = result
            2 -> g2DepthMap = result
        }
        return result
    }

    fun extractGraphDepthMap(graph: Graph): Map<Int, List<Node>> {
        val depthMap = graph.nodes.associateWith { 0 }.toMutableMap()
        dfs(node = graph.edges.keys.first(), depthMap, graph)
        return depthMap.toList().groupBy({ it.second }, { it.first }).toSortedMap()
    }

    fun extractLeavesOf(node: Node, graph: Graph): List<Node> {
        val depthMap = graph.nodes.associateWith { -1 }.toMutableMap()
        dfs(node = node, depthMap, graph)
        return depthMap.toList().groupBy({ it.second }, { it.first }).toSortedMap()[0] ?: emptyList()
    }

    private fun dfs(node: Node, depth: MutableMap<Node, Int>, graph: Graph): Int {
        val edges = graph.edgesOf(node)
        if (edges.isEmpty()) {
            depth[node] = 0
            return 0
        }

        val maximumDepth = edges.maxOfOrNull { edge -> dfs(node = edge.to, depth, graph) } ?: 0
        depth[node] = maximumDepth + 1
        return maximumDepth + 1
    }

    fun extractGraphDepthMapWithNodeVariables(graph: Graph): MutableMap<Int, List<Node>> {
        val depthMap = graph.nodes.associateWith { -1 }.toMutableMap()
        graph.nodeVariables.forEach { nv -> depthMap[nv] = -1 }
        val root = graph.edges.keys.first()
        val seenNodes = mutableListOf(root)
        val extraSeenLeaves = mutableListOf<Node>()
        dfsWithNodeVariables(root, depthMap, seenNodes, extraSeenLeaves, graph)
        val result = depthMap.toList().toMutableList().groupBy({ it.second }, { it.first }).toMutableMap()
        result[-2] = extraSeenLeaves
        result[-3] = (result[-1] ?: emptyList())
            .filterIsInstance<NodeVariable>()
            .associateWith { nv -> graph.edgeVariablesOf(nv).map { it.otherLegThan(nv) } }
            .filter { (_, list) -> list.size == 1 }
            .map { (nv, list) -> nv to list.first() as Node }
            .filter { (_, node) -> node !in (result[0] ?: emptyList()) }
            .map { (nv, _) -> nv }
        return result.toSortedMap()
    }

    private fun dfsWithNodeVariables(node: Node, depth: MutableMap<Node, Int>, seenNodes: MutableList<Node>, extraSeenLeaves: MutableList<Node>, graph: Graph): Int {
        val edges = graph.edgesOf(node).filter { it.to !in seenNodes }
        val edgeVariables = graph.edgeVariablesOf(node).filter { it.leg1 !in seenNodes || it.leg2 !in seenNodes }

        val seenEdges = graph.edgesOf(node).filter { it.to in seenNodes }
        seenEdges.forEach { edge -> extraSeenLeaves.add(edge.to) }

        if (node !in extraSeenLeaves) {
            val seenEdgeVariables = graph.edgeVariablesOf(node).filter { it.leg1 in seenNodes && it.leg2 in seenNodes }
            seenEdgeVariables.map { it.otherLegThan(node) }.forEach { if (it !is NodeVariable && it is Node) extraSeenLeaves.add(it) }
        }

        if (edges.isEmpty() && edgeVariables.isEmpty()) {
            depth[node] = 0
            return 0
        }

        seenNodes.addAll(edges.map { it.to })
        seenNodes.addAll(edgeVariables.map { it.otherLegThan(node) }.map { if (it is NodeVariable) it else if(it is Node) it else error("WTF!") })

        val maximumEdgeDepth = edges.maxOfOrNull { edge -> dfsWithNodeVariables(node = edge.to, depth, seenNodes, extraSeenLeaves, graph) }
        val maximumEdgeVariableDepth = edgeVariables.maxOfOrNull { edge ->
            when (val otherLeg = edge.otherLegThan(node)) {
                is NodeVariable -> dfsWithNodeVariables(otherLeg, depth, seenNodes, extraSeenLeaves, graph)
                is Node -> dfsWithNodeVariables(otherLeg, depth, seenNodes, extraSeenLeaves, graph)
                else -> error("WTF!")
            }
        }
        var maximumDepth = maximumEdgeVariableDepth ?: 0
        if (maximumEdgeDepth != null && maximumEdgeDepth > maximumDepth)
            maximumDepth = maximumEdgeDepth
        depth[node] = maximumDepth + 1
        return maximumDepth + 1
    }

    private fun dfsWithNodeVariables(nodeVariable: NodeVariable, depth: MutableMap<Node, Int>, seenNodes: MutableList<Node>, extraSeenLeaves: MutableList<Node>, graph: Graph): Int {
        val edgeVariables = graph.edgeVariablesOf(nodeVariable).filter { it.leg1 !in seenNodes || it.leg2 !in seenNodes }
        if (edgeVariables.isEmpty()) {
            depth[nodeVariable] = -1
            return -1
        }

        // TODO: Should we add seenEdgeVariables to extraSeenLeaves?

        seenNodes.addAll(edgeVariables.map { it.otherLegThan(nodeVariable) }.map { if (it is NodeVariable) it else if(it is Node) it else error("WTF!") })

        val maximumDepth = edgeVariables.maxOfOrNull { edge ->
            when (val otherLeg = edge.otherLegThan(nodeVariable)) {
                is NodeVariable -> dfsWithNodeVariables(otherLeg, depth, seenNodes, extraSeenLeaves, graph)
                is Node -> dfsWithNodeVariables(otherLeg, depth, seenNodes, extraSeenLeaves, graph)
                else -> error("WTF!")
            }
        } ?: 0

        depth[nodeVariable] = maximumDepth + 1
        return maximumDepth + 1
    }

    fun alterNameOfDifferentNodes(graph1: Graph, graph2: Graph) {
        (graph1.nodes + graph2.nodes).forEach { node ->
            if (!node.isCommon && node.code != null && "_${node.code}" !in node.name) {
                node.name += "#${node.code}"
            }
        }
    }

    fun extractNodesWithOrder(graph: Graph): List<Node> {
        val root = graph.edges.keys.first()
        val list = mutableListOf<Node>()
        fillOutTheOrderList(root, graph, list)
        return list
    }

    private fun fillOutTheOrderList(node: Node, graph: Graph, list: MutableList<Node>) {
        val edges = graph.edgesOf(node)
        if (edges.isNotEmpty()) {
            edges.forEach { edge -> fillOutTheOrderList(edge.to, graph, list) }
        }
        list.add(node)
    }

    fun reset() {
        nodesMatchingHappened = false
        iteration = 1
        g1DepthMap = emptyMap()
        g2DepthMap = emptyMap()
        NodeMatchingAlgorithm.reset()
    }

}