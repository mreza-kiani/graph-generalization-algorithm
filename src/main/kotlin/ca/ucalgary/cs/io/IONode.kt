package ca.ucalgary.cs.io

import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node


class IONode(
    name: String,
    val g1Representatives: List<Node>,
    val g2Representatives: List<Node>,
    isDuplicate: Boolean = false,
    code: Int? = null,
    isCommon: Boolean = true
) : Node(name, isDuplicate, code, isCommon) {

    companion object {
        fun from(reps: List<Node>, graph1: Graph, graph2: Graph): List<IONode> {
            val g1Reps = reps.filter { it in graph1.nodes }.filter { graph1.edgesOf(it).isNotEmpty() }
            val g2Reps =
                reps.filter { it in graph2.nodes }.filter { graph2.edgesOf(it).isNotEmpty() }.filter { it !in g1Reps }

            val g1RepsMap = g1Reps.groupBy { it.getRealName() }
            val g2RepsMap = g2Reps.groupBy { it.getRealName() }

            val commonReps = g1RepsMap.keys.filter { it in g2RepsMap.keys }
            val commonIONodes = commonReps.map { commonRep ->
                val g1CommonRepList = g1RepsMap[commonRep] ?: emptyList()
                val g2CommonRepList = g2RepsMap[commonRep] ?: emptyList()
                val g1CommonRepSize = g1CommonRepList.size
                val g2CommonRepSize = g2CommonRepList.size

                val name = if (g1CommonRepSize == 1 && g2CommonRepSize == 1) commonRep
                else if (g1CommonRepSize == g2CommonRepSize) "${g1CommonRepSize}_${commonRep}s"
                else "${g1CommonRepSize}_or_${g2CommonRepSize}_${commonRep}s"

                IONode(name, g1Representatives = g1CommonRepList, g2Representatives = g2CommonRepList)
            }

            val uncommonIONodes = mutableListOf<IONode>()
            val g1UncommonReps = g1RepsMap.keys.filter { it !in commonReps }
            val g2UncommonReps = g2RepsMap.keys.filter { it !in commonReps }

            val biggerList = if (g1UncommonReps.size <= g2UncommonReps.size) g2UncommonReps else g1UncommonReps
            val smallerList = if (g1UncommonReps.size <= g2UncommonReps.size) g1UncommonReps else g2UncommonReps

            for (i in smallerList.indices) {
                val g1UncommonRepList = g1RepsMap[g1UncommonReps[i]] ?: emptyList()
                val g2UncommonRepList = g2RepsMap[g2UncommonReps[i]] ?: emptyList()
                val g1UncommonRepSize = g1UncommonRepList.size
                val g2UncommonRepSize = g2UncommonRepList.size

                val name1 = if (g1UncommonRepSize == 1) g1UncommonReps[i]
                else "${g1UncommonRepSize}_${g1UncommonReps[i]}s"

                val name2 = if (g2UncommonRepSize == 1) g2UncommonReps[i]
                else "${g2UncommonRepSize}_${g2UncommonReps[i]}s"

                uncommonIONodes.add(IONode("${name1}_or_$name2", g1Representatives = g1UncommonRepList, g2Representatives = g2UncommonRepList))
            }

            for (i in smallerList.size until biggerList.size) {
                val repList = (if (biggerList == g1UncommonReps) g1RepsMap[g1UncommonReps[i]] else g2RepsMap[g2UncommonReps[i]]) ?: emptyList()
                val repKey = if (biggerList == g1UncommonReps) g1UncommonReps[i] else g2UncommonReps[i]
                val repSize = repList.size

                val name = if (repSize == 1) repKey else "${repSize}_${repKey}s"

                if (biggerList == g1UncommonReps) uncommonIONodes.add(IONode(name, g1Representatives = repList, g2Representatives = emptyList()))
                else uncommonIONodes.add(IONode(name, g1Representatives = emptyList(), g2Representatives = repList))
            }

            return commonIONodes + uncommonIONodes
        }
    }

    override fun equals(other: Any?): Boolean {
        if (other !is IONode)
            return false
        return name == other.name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun toString(): String {
        return "IONode{$name}"
    }
}