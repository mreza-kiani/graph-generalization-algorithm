package ca.ucalgary.cs.algorithm

import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node

object StructuralMatchingAlgorithm {
    private const val MATCHING_THRESHOLD = 0.5
    private const val NODE_SIMILARITY_FACTOR = 0.5
    private const val PARENT_SIMILARITY_FACTOR = 0.2
    private const val CHILDREN_SIMILARITY_FACTOR = 0.3

    fun matchSameNodes(graph1: Graph, graph2: Graph) {
        val similarities = List(graph1.nodes.size) { MutableList(graph2.nodes.size) { 0.0 } }

        compareLeaves(similarities, graph1, graph2)
        compareNonLeaves(similarities, graph1, graph2)

        matchSameNodesOf(sourceGraph = graph1, targetGraph = graph2)
        matchSameNodesOf(sourceGraph = graph2, targetGraph = graph1)
    }

    private fun compareLeaves(similarities: List<MutableList<Double>>, graph1: Graph, graph2: Graph) {
        val g1Leaves = graph1.getLeaves()
        val g2Leaves = graph2.getLeaves()

        g1Leaves.forEach { g1Leaf ->
            val g1NodeIndex = graph1.indexOf(g1Leaf)
            graph2.nodes.forEachIndexed { g2NodeIndex, g2Node ->
                if (g2Node !in g2Leaves)
                    return@forEachIndexed

                val leavesSimilarity = NodeMatchingAlgorithm.similarityScoreOf(g1Leaf.name, g2Node.name) * (NODE_SIMILARITY_FACTOR + CHILDREN_SIMILARITY_FACTOR)
                val parentsSimilarity = NodeMatchingAlgorithm.similarityScoreOf(graph1.findParent(g1Leaf), graph2.findParent(g2Node)) * PARENT_SIMILARITY_FACTOR
                similarities[g1NodeIndex][g2NodeIndex] = leavesSimilarity + parentsSimilarity
            }
        }
    }

    private fun compareNonLeaves(similarities: List<MutableList<Double>>, graph1: Graph, graph2: Graph) {
        fun extractGraphDepthMap(graph: Graph): Map<Int, List<Node>> {
            val depthMap = graph.nodes.associateWith { 0 }.toMutableMap()
            dfs(node = graph.edges.keys.first(), depthMap, graph)
            return depthMap.toList().groupBy({ it.second }, { it.first })
        }

        fun extractChildrenSimilarity(g1ParentNode: Node, g2ParentNode: Node): Double {
            val g1Children = graph1.edgesOf(g1ParentNode)
            val g2Children = graph2.edgesOf(g2ParentNode)

            return if (g1Children.size < g2Children.size) {
                g1Children.sumOf { g1Edge ->
                    val g1Index = graph1.indexOf(g1Edge.to)
                    g2Children.maxOfOrNull { g2Edge ->
                        val g2Index = graph2.indexOf(g2Edge.to)
                        similarities[g1Index][g2Index]
                    } ?: 0.0
                } / g2Children.size
            } else {
                g2Children.sumOf { g2Edge ->
                    val g2Index = graph2.indexOf(g2Edge.to)
                    g1Children.maxOfOrNull { g1Edge ->
                        val g1Index = graph1.indexOf(g1Edge.to)
                        similarities[g1Index][g2Index]
                    } ?: 0.0
                } / g1Children.size
            }
        }

        val graph1DepthMap = extractGraphDepthMap(graph1)
        val graph2DepthMap = extractGraphDepthMap(graph2)
        val graph2MaximumDepth = graph2DepthMap.maxOf { (depth, _) -> depth }

        graph1DepthMap.forEach { (depth, g1Nodes) ->
            if (depth == 0)
                return@forEach

            g1Nodes.forEach { g1Node ->
                for (i in 1..graph2MaximumDepth) {
                    graph2DepthMap[i]?.forEach { g2Node ->
                        val leavesSimilarity = NodeMatchingAlgorithm.similarityScoreOf(g1Node, g2Node) * NODE_SIMILARITY_FACTOR
                        val parentsSimilarity = NodeMatchingAlgorithm.similarityScoreOf(graph1.findParent(g1Node), graph2.findParent(g2Node)) * PARENT_SIMILARITY_FACTOR
                        val childrenSimilarity = extractChildrenSimilarity(g1Node, g2Node) * CHILDREN_SIMILARITY_FACTOR

                        similarities[graph1.indexOf(g1Node)][graph2.indexOf(g2Node)] = leavesSimilarity + parentsSimilarity + childrenSimilarity
                    }
                }
            }
        }
    }

    private fun matchSameNodesOf(sourceGraph: Graph, targetGraph: Graph) {
        // TODO: It's better to select the best nodes between 2 graphs for this, not the best in g1 and then go for g2
        val sameNodes = extractSameNodes(sourceGraph).toMutableList()
        val numberOfSameNodes = sameNodes.size
        repeat(numberOfSameNodes) {
            val g1Node =
                sameNodes.maxByOrNull { node -> sourceGraph.degreeOf(node) + sourceGraph.degreeOfMatchedNodes(node) }!!
            val potentialNodes = targetGraph.nodes.filter { it == g1Node }
            val matchedNode = potentialNodes.associateWith { g2Node ->
                val g1Edges = sourceGraph.allInAndOutEdgesOf(g1Node)
                val g2Edges = targetGraph.allInAndOutEdgesOf(g2Node)
                val degree = g1Edges.sumOf { g1Edge -> if (g1Edge in g2Edges) 1L else 0 } +
                        g1Edges.sumOf { g1Edge -> g2Edges.filter { g2Edge -> g1Edge.isExactMatch(g2Edge) }.size }

                degree.toDouble() / (sourceGraph.degreeOf(g1Node) + targetGraph.degreeOf(g2Node))
            }.toList().maxByOrNull { (_, degree) -> degree }?.first

            if (matchedNode != null)
                applyMatchingInNames(g1Node, matchedNode)

            sameNodes.remove(g1Node)
        }
    }

    private fun applyMatchingInNames(source: Node, matchedNode: Node) {
        source.name += "_${source.code}"
        source.isCommon = true
        matchedNode.name = source.name
        matchedNode.code = source.code
        matchedNode.isCommon = true
    }

    private fun extractSameNodes(graph: Graph) =
        graph.nodes
            .groupBy { it.name }
            .filter { (_, list) -> list.size > 1 }
            .values
            .flatten()

    fun unmatchIrrelevantParents(graph: Graph, dependentGraph: Graph) {
        if (graph.edges.isEmpty())
            return

        val levels = mutableListOf<MutableList<Node>>()
        dfs(node = graph.edges.keys.first(), level = 0, levels, graph)

        if (levels.size <= 1)
            return

        for (i in levels.size - 2 downTo 0)
            levels[i].forEach { node ->
                val neighbors = graph.edgesOf(node)
                if (!node.isCommon || neighbors.isEmpty())
                    return@forEach
                val matchedChildren =
                    neighbors.filter { edge -> dependentGraph.nodes.any { edge.to.isExactMatch(it) } }.size
                if (matchedChildren.toDouble() / neighbors.size < MATCHING_THRESHOLD)
                    unmatchNode(node, dependentGraph)
            }
    }

    private fun unmatchNode(node: Node, dependentGraph: Graph) {
        val otherNode = dependentGraph.nodes.first { node.isExactMatch(it) }
        applyUnMatchingInNames(node, otherNode)
    }

    private fun applyUnMatchingInNames(source: Node, matchedNode: Node) {
        source.name += "_UM"
        source.isCommon = false
        matchedNode.isCommon = false
    }

    private fun dfs(node: Node, level: Int, levels: MutableList<MutableList<Node>>, graph: Graph) {
        if (levels.any { seenNodes -> node in seenNodes })
            return

        if (levels.size <= level)
            levels.add(mutableListOf())

        levels[level].add(node)
        graph.edgesOf(node).forEach { edge ->
            dfs(node = edge.to, level = level + 1, levels, graph)
        }
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

}