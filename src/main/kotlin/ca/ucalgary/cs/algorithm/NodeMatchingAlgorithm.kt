package ca.ucalgary.cs.algorithm

import ca.ucalgary.cs.graph.Node

object NodeMatchingAlgorithm {

    fun similarityScoreOf(node1: Node?, node2: Node?): Double {
        if (node1 == null || node2 == null)
            return 0.0
        return if (node1.isExactMatch(node2)) 1.0
        else if (node1.isCommon || node2.isCommon) 0.0
        else if (node1.name == node2.name) 0.5
        else 0.0
    }

    fun similarityScoreOf(a: String, b: String): Double {
        return longestCommonSubstring(a, b).toDouble() / maxOf(a.length, b.length)
    }

    private fun longestCommonSubstring(a: String, b: String): Int {
        val scores = List(a.length) { MutableList(b.length) { 0 } }

        a.lowercase().forEachIndexed { aIndex, aChar ->
            b.lowercase().forEachIndexed { bIndex, bChar ->
                if (aChar == bChar) {
                    if (aIndex == 0 || bIndex == 0)
                        scores[aIndex][bIndex] = 1
                    else
                        scores[aIndex][bIndex] = scores[aIndex - 1][bIndex - 1] + 1
                }
            }
        }

        return scores.mapNotNull { list -> list.maxOrNull() }.maxOrNull() ?: 0
    }

    fun similarityScoreOf(nodes1: Set<Node>, nodes2: Set<Node>): Double {
        if (nodes1.isEmpty() || nodes2.isEmpty())
            return 0.0
        return 2.0 * nodes1.sumOf { node1 -> nodes2.maxOf { node2 -> similarityScoreOf(node1, node2) } } /
                (nodes1.size + nodes2.size)
    }

}