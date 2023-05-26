package ca.ucalgary.cs.io

import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node


class IONode(
    name: String,
    isDuplicate: Boolean = false,
    code: Int? = null,
    isCommon: Boolean = true
) : Node(name, isDuplicate, code, isCommon) {

    lateinit var g1Representatives: List<Node>
    lateinit var g2Representatives: List<Node>

    constructor(reps: List<Node>, graph1: Graph, graph2: Graph) : this("") {
        g1Representatives = reps.filter { it in graph1.nodes }.filter { graph1.edgesOf(it).isNotEmpty() }
        g2Representatives = reps.filter { it in graph2.nodes }.filter { graph2.edgesOf(it).isNotEmpty() }.filter { it !in g1Representatives }

        val name1 = g1Representatives.groupBy { it.getRealName() }.map { (key, list) ->
            if (list.size > 1) "${key}_sequence"
            else key
        }.joinToString("_or_") { it }
        val name2 = g2Representatives.groupBy { it.getRealName() }.map { (key, list) ->
            if (list.size > 1) "${key}_sequence"
            else key
        }.joinToString("_or_") { it }

        name = if (name1 == name2 || name2.isEmpty() || name2 in name1) name1
        else if (name1.isEmpty() || name1 in name2) name2
        else "${name1}_or_$name2"
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