package ca.ucalgary.cs.algorithm

import ca.ucalgary.cs.graph.Node

object NodeMatchingAlgorithm {
    private var LCSMap = mutableMapOf<String, Int>()

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
        if (LCSMap["$a#$b"] != null)
            return LCSMap["$a#$b"] ?: 0
        val lcs = extractLongestCommonSubstringTable(a, b).mapNotNull { list -> list.maxOrNull() }.maxOrNull() ?: 0
        LCSMap["$a#$b"] = lcs
        return lcs
    }

    private fun extractLongestCommonSubstringTable(a: String, b: String): List<List<Int>> {
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

        return scores
    }

    fun extractLongestCommonSubstringWord(a: String, b: String): String {
        if (a == b)
            return a

        val table = extractLongestCommonSubstringTable(a, b)
        val lcs = longestCommonSubstring(a, b)
        var aMaxIndex = 0
        var bMaxIndex = 0

        table.forEachIndexed { aIndex, list ->
            list.forEachIndexed { bIndex, value ->
               if (value == lcs) {
                   aMaxIndex = aIndex
                   bMaxIndex = bIndex
               }
            }
        }

        var result = a.substring(aMaxIndex - lcs + 1, aMaxIndex + 1)
        if ((aMaxIndex - lcs + 1 > 0) || (bMaxIndex - lcs + 1 > 0))
            result = "X$result"
        if ((aMaxIndex + 1 < a.length) || (bMaxIndex + 1 < b.length))
            result = "${result}X"
        listOf("/*", "\"").forEach { prefix ->
            if (a.startsWith(prefix) && !result.startsWith(prefix))
                result = "$prefix$result"
        }
        listOf("*/", "\"").forEach { postfix ->
            if (a.endsWith(postfix) && !result.endsWith(postfix))
                result = "$result$postfix"
        }
        return result
    }

    fun similarityScoreOf(nodes1: Set<Node>, nodes2: Set<Node>): Double {
        if (nodes1.isEmpty() || nodes2.isEmpty())
            return 0.0
        return 2.0 * nodes1.sumOf { node1 -> nodes2.maxOf { node2 -> similarityScoreOf(node1, node2) } } /
                (nodes1.size + nodes2.size)
    }

    fun reset() {
        LCSMap = mutableMapOf()
    }

}