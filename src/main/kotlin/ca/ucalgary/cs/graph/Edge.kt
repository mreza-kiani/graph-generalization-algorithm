package ca.ucalgary.cs.graph

open class Edge(val from: Node, val to: Node, val name: String = "") {
    override fun equals(other: Any?): Boolean {
        if (other !is Edge)
            return false
        return from == other.from && to == other.to && name == other.name
    }

    fun isExactMatch(other: Edge): Boolean {
        return from.isExactMatch(other.from) && to.isExactMatch(other.to) && name == other.name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun toString(): String {
        return "Edge${if (name.isNotBlank()) "{$name}" else ""}[$from->$to]"
    }

    fun contain(node: Node): Boolean {
        return node.isExactMatch(from) || node.isExactMatch(to)
    }

    companion object {
        fun from(tail: Node, heads: List<Node>) = heads.map { Edge(tail, it) }
    }
}