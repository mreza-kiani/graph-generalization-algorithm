package ca.ucalgary.cs.algorithm

import ca.ucalgary.cs.graph.Node

object NodeMatchingAlgorithm {

    fun similarityScoreOf(node1: Node, node2: Node): Double {
        return if (node1.name == node2.name) 1.0
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

}