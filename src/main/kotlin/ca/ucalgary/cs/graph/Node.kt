package ca.ucalgary.cs.graph

open class Node(var name: String, var code: Int? = null, var isCommon: Boolean = false) : EdgeVariableLeg {
    override fun equals(other: Any?): Boolean {
        if (other !is Node)
            return false
        return name == other.name
    }

    override fun hashCode(): Int {
        return completeName().hashCode()
    }

    override fun toString(): String {
        return "Node{${completeName()}}"
    }

    fun completeName() = if (code == null) name else "$name-$code"
    fun isExactMatch(other: Node) = completeName() == other.completeName()
}