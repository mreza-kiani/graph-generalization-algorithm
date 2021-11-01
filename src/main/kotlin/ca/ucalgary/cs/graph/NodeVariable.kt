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
        return name == other.name || (graph1 == other.graph1 && graph2 == other.graph2)
    }

    private fun isSubGraphOf(other: NodeVariable) : Boolean {
        return graph1.isSubGraphOf(other.graph1) && graph2.isSubGraphOf(other.graph2)
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun toString(): String {
        return "NodeVariable{$name}"
    }

    fun merge(other: NodeVariable): NodeVariable {
        if (this.isSubGraphOf(other))
            return other
        if (other.isSubGraphOf(this))
            return this

        val merged = NodeVariable(name = "{$name&${other.name}}")
        merged.graph1 = Graph(nodes = graph1.nodes + other.graph1.nodes, edges = graph1.edges + other.graph1.edges)
        merged.graph2 = Graph(nodes = graph2.nodes + other.graph2.nodes, edges = graph2.edges + other.graph2.edges)
        return merged
    }

    private fun neighborsOf(edgeVariables: List<EdgeVariable>) =
        edgeVariables.filter { it.has(this) }.map { it.otherLegThan(this) }.distinct()

    companion object {
        fun extractNeighborsMap(edgeVariables: MutableList<EdgeVariable>) =
            edgeVariables
                .map { it.nodeVariableLeg() }
                .distinct()
                .map { it to it.neighborsOf(edgeVariables) }
                .sortedByDescending { (_, neighbors) -> neighbors.size }
                .toMap()
                .toMutableMap()
    }
}
