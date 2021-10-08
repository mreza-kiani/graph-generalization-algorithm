package ca.ucalgary.cs.graph

class NodeVariable(name: String) : Node(name) {
    var graph1: Graph = Graph(nodes = emptyList(), edges = emptyMap())
    var graph2: Graph = Graph(nodes = emptyList(), edges = emptyMap())

    constructor(name: String, node: Node, graphNumber: Int) : this(name) {
        addNode(node, graphNumber)
    }

    fun addNode(node: Node, graphNumber: Int) {
        if (graphNumber == 1) {
            graph1 = Graph(nodes = (graph1.nodes + node).distinct(), edges = graph1.edges)
        } else {
            graph2 = Graph(nodes = (graph2.nodes + node).distinct(), edges = graph2.edges)
        }
    }

    fun addEdge(tail: Node, head: Node, graphNumber: Int) {
        addNode(tail, graphNumber)
        addNode(head, graphNumber)
        if (graphNumber == 1) {
            graph1 = Graph(nodes = graph1.nodes, edges = graph1.edges + (tail to graph1.edgesOf(tail) + listOf(head)))
        } else {
            graph2 = Graph(nodes = graph2.nodes, edges = graph2.edges + (tail to graph2.edgesOf(tail) + listOf(head)))
        }
    }

    override fun equals(other: Any?): Boolean {
        if (other !is NodeVariable)
            return false
        return name == other.name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun toString(): String {
        return "NodeVariable{$name}"
    }

    fun merge(other: NodeVariable): NodeVariable {
        val merged = NodeVariable(name = "$name&${other.name}")
        merged.graph1 = Graph(nodes = graph1.nodes + other.graph1.nodes, edges = graph1.edges + other.graph1.edges)
        merged.graph2 = Graph(nodes = graph2.nodes + other.graph2.nodes, edges = graph2.edges + other.graph2.edges)
        return merged
    }
}
