package ca.ucalgary.cs.graph

open class Node(val name: String) : EdgeVariableLeg {
    override fun equals(other: Any?): Boolean {
        if (other !is Node)
            return false
        return name == other.name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun toString(): String {
        return "Node{$name}"
    }
}