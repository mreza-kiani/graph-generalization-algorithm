package ca.ucalgary.cs.graph

class EdgeVariable(
    val name: String,
    var leg1: EdgeVariableLeg,
    var leg2: EdgeVariableLeg,
    val graph1Edges: MutableMap<Node, MutableList<Edge>> = mutableMapOf(),
    val graph2Edges: MutableMap<Node, MutableList<Edge>> = mutableMapOf()
) {
    fun has(l1: EdgeVariableLeg, l2: EdgeVariableLeg) = (leg1 == l1 && leg2 == l2) || (leg1 == l2 && leg2 == l1)
    fun has(leg: EdgeVariableLeg) = leg1 == leg || leg2 == leg
    fun getGraphEdges(graphNumber: Int) = if (graphNumber == 1) graph1Edges else graph2Edges

    fun addEdge(edge: Edge, graphNumber: Int) = addEdgeTo(graphOf(graphNumber), edge)

    private fun graphOf(graphNumber: Int) = when (graphNumber) {
        1 -> graph1Edges
        2 -> graph2Edges
        else -> error("graphNumber should be 1 or 2")
    }

    private fun addEdgeTo(edges: MutableMap<Node, MutableList<Edge>>, edge: Edge) {
        if (edges[edge.from] == null)
            edges[edge.from] = mutableListOf()
        edges[edge.from]?.add(edge)
    }

    fun nodeVariableLeg(): NodeVariable {
        return when {
            leg1 is NodeVariable && leg2 is NodeVariable -> error("Two NodeVariables detected as two legs!")
            leg1 is NodeVariable -> leg1 as NodeVariable
            leg2 is NodeVariable -> leg2 as NodeVariable
            else -> error("Couldn't find node variable as a leg in $name edge variable!")
        }
    }

    private fun hasNodeVariableLeg() = leg1 is NodeVariable || leg2 is NodeVariable

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

    fun otherLegThan(leg: Node): EdgeVariableLeg {
        return when (leg) {
            leg1 -> leg2
            leg2 -> leg1
            else -> error("Couldn't find the leg argument in the edge variable")
        }
    }

    override fun toString(): String {
        return "($name) : [ $leg1 ----- $leg2 ]"
    }

    companion object {
        private var counter = 1
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

        fun merge(
            graph1EdgeVariables: MutableList<EdgeVariable>,
            graph2EdgeVariables: MutableList<EdgeVariable>,
            commonNodeVariable: NodeVariable
        ): List<EdgeVariable> {
            val mergedEdgeVariables = mutableListOf<EdgeVariable>()

            if (graph1EdgeVariables.any { !it.has(commonNodeVariable) }
                || graph2EdgeVariables.any { !it.has(commonNodeVariable) })
                error("Can not merge edge variables without common node variable leg!")

            graph1EdgeVariables.forEach { graph1EdgeVariable ->
                val nodeLeg = graph1EdgeVariable.simpleNodeLeg()

                graph2EdgeVariables.firstOrNull { it.has(nodeLeg) }?.also { graph2EdgeVariable ->
                    graph2EdgeVariables.remove(graph2EdgeVariable)
                    mergedEdgeVariables.add(merge(listOf(graph1EdgeVariable, graph2EdgeVariable), nodeLeg))
                } ?: run { mergedEdgeVariables.add(graph1EdgeVariable) }
            }
            mergedEdgeVariables.addAll(graph2EdgeVariables)

            return mergedEdgeVariables
        }

        private fun mergeGraphEdges(edgeVariables: List<EdgeVariable>, graphNumber: Int) = edgeVariables
            .map { it.graphOf(graphNumber) }
            .flatMap { it.keys }
            .distinct()
            .associateWith { node ->
                edgeVariables.map { it.graphOf(graphNumber)[node] ?: emptyList() }.flatten().toMutableList()
            }.toMutableMap()

        fun updateNodeVariablesOf(
            edgeVariables: MutableList<EdgeVariable>,
            previousVariables: List<NodeVariable>,
            newVariable: NodeVariable
        ) {
            edgeVariables
                .filter { it.hasNodeVariableLeg() }
                .filter { it.nodeVariableLeg() in previousVariables }
                .forEach { it.updateNodeVariable(newVariable) }
        }

        fun removeDuplicates(edgeVariables: MutableList<EdgeVariable>) =
            edgeVariables.groupBy { it.simpleNodeLeg() to it.nodeVariableLeg() }
                .map { (_, list) -> list }
                .filter { list -> list.size > 1 }
                .forEach { list ->
                    edgeVariables.removeAll(list)
                    edgeVariables.add(mergeSimilarLegs(list))
                }

        private fun mergeSimilarLegs(edgeVariables: List<EdgeVariable>): EdgeVariable {
            val nodeVariable = edgeVariables.first().nodeVariableLeg()
            val simpleNode = edgeVariables.first().simpleNodeLeg()

            if (edgeVariables.any { !it.has(nodeVariable, simpleNode) })
                error("The received edge variable list don't have similar legs!")

            return EdgeVariable(
                name = edgeVariables.joinToString { it.name },
                leg1 = simpleNode,
                leg2 = nodeVariable,
                graph1Edges = mergeGraphEdges(edgeVariables, graphNumber = 1),
                graph2Edges = mergeGraphEdges(edgeVariables, graphNumber = 2)
            )
        }
    }
}