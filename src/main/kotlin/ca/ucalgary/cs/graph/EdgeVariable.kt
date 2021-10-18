package ca.ucalgary.cs.graph

class EdgeVariable(
    val name: String,
    var leg1: EdgeVariableLeg,
    var leg2: EdgeVariableLeg,
    val graph1Edges: MutableMap<Node, MutableList<Node>> = mutableMapOf(),
    val graph2Edges: MutableMap<Node, MutableList<Node>> = mutableMapOf()
) {
    fun has(l1: EdgeVariableLeg, l2: EdgeVariableLeg) = (leg1 == l1 && leg2 == l2) || (leg1 == l2 && leg2 == l1)
    fun has(leg: EdgeVariableLeg) = leg1 == leg || leg2 == leg

    fun addEdge(tail: Node, head: Node, graphNumber: Int) = addEdgeTo(graphOf(graphNumber), tail, head)

    private fun graphOf(graphNumber: Int) = when (graphNumber) {
        1 -> graph1Edges
        2 -> graph2Edges
        else -> error("graphNumber should be 1 or 2")
    }

    private fun addEdgeTo(edges: MutableMap<Node, MutableList<Node>>, tail: Node, head: Node) {
        if (edges[tail] == null)
            edges[tail] = mutableListOf()
        edges[tail]?.add(head)
    }

    fun nodeVariableLeg(): NodeVariable {
        return when {
            leg1 is NodeVariable && leg2 is NodeVariable -> error("Two NodeVariables detected as two legs!")
            leg1 is NodeVariable -> leg1 as NodeVariable
            leg2 is NodeVariable -> leg2 as NodeVariable
            else -> error("Couldn't find node variable as a leg in $name edge variable!")
        }
    }

    fun simpleNodeLeg(): Node {
        return when {
            leg1 is Node && leg1 !is NodeVariable -> leg1 as Node
            leg2 is Node && leg2 !is NodeVariable -> leg2 as Node
            else -> error("Couldn't find simple node as a leg in $name edge variable!")
        }
    }

    fun updateNodeVariable(newNodeVariable: NodeVariable) {
        when {
            leg1 is NodeVariable -> leg1 = newNodeVariable
            leg2 is NodeVariable -> leg2 = newNodeVariable
        }
    }

    companion object {
        var counter = 1
        fun getUniqueName() = "E${counter++}"

        fun merge(edgeVariables: List<EdgeVariable>, commonLeg: EdgeVariableLeg): EdgeVariable {
            if (edgeVariables.any { !it.has(commonLeg) })
                error("Can not merge edge variables without common leg!")

            val mergedVariable = edgeVariables.map { it.nodeVariableLeg() }
                .fold(NodeVariable(name = "Merged")) { a, b -> a.merge(b) }

            return EdgeVariable(
                name = edgeVariables.joinToString { it.name },
                leg1 = commonLeg,
                leg2 = mergedVariable,
                graph1Edges = mergeGraphEdges(edgeVariables, graphNumber = 1),
                graph2Edges = mergeGraphEdges(edgeVariables, graphNumber = 2)
            )
        }

        private fun mergeGraphEdges(edgeVariables: List<EdgeVariable>, graphNumber: Int) = edgeVariables
            .map { it.graphOf(graphNumber) }
            .flatMap { it.keys }
            .distinct()
            .associateWith { node ->
                edgeVariables.map { it.graphOf(graphNumber)[node] ?: emptyList() }.flatten().toMutableList()
            }.toMutableMap()
    }
}