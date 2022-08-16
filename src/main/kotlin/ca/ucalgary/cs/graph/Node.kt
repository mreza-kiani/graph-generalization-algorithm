package ca.ucalgary.cs.graph

open class Node(val name: String, var code: Int? = null, var isCommon: Boolean = false) : EdgeVariableLeg {
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

    private fun completeName(): String {
        return if (code == null) name else "$name-$code"
    }
}