package ca.ucalgary.cs.io

import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import ca.ucalgary.cs.graph.NodeVariable
import guru.nidi.graphviz.attribute.*
import guru.nidi.graphviz.engine.Format
import guru.nidi.graphviz.engine.Graphviz
import guru.nidi.graphviz.model.Factory.*
import guru.nidi.graphviz.model.Link
import guru.nidi.graphviz.model.MutableGraph
import guru.nidi.graphviz.model.MutableNode
import java.io.File


fun Graph.visualize(name: String) {
    simplifyNodeVariableNames()

    val g: MutableGraph = mutGraph(name).setDirected(true)

    nodes
        .associateWith { edgesOf(it) }
        .map { (node, edges) ->
            g.add(getMutNode(node))
            edges.reversed().forEach { edge ->
                g.add(getMutNode(node).addLink(getMutNode(edge.to)))
            }
        }

    val edgeVariableMap = mutableMapOf<Node, MutableList<Node>>()
    nodeVariables.forEach { nodeVariable -> edgeVariableMap[nodeVariable] = mutableListOf() }
    nodes.forEach { node -> edgeVariableMap[node] = mutableListOf() }
    edgeVariables.forEach { edgeVariable ->
        if (edgeVariable.leg1 is NodeVariable && edgeVariable.leg2 is Node)
            edgeVariableMap[edgeVariable.leg1 as NodeVariable]?.add(edgeVariable.leg2 as Node)
        else if (edgeVariable.leg1 is Node && edgeVariable.leg2 is NodeVariable)
            edgeVariableMap[edgeVariable.leg2 as NodeVariable]?.add(edgeVariable.leg1 as Node)
        else
            edgeVariableMap[edgeVariable.leg1 as Node]?.add(edgeVariable.leg2 as Node)
    }

    edgeVariableMap.forEach { (node, neighbors) ->
        g.add(getMutNode(node))
        neighbors.forEach { neighbor ->
            g.add(getMutNode(node).addLink(getDottedUndirectedLinkTo(neighbor)))
        }
    }

    Graphviz.fromGraph(g).render(Format.PNG).toFile(File("data/$name.png"))
}

private fun getDottedUndirectedLinkTo(neighbor: Node) =
    Link.to(getMutNode(neighbor)).with(Style.DOTTED, Arrow.NONE)

fun getMutNode(node: Node): MutableNode {
    val mutNode = mutNode(node.completeName())
    if (node is NodeVariable)
        mutNode.attrs().add(Shape.RECTANGLE, Style.FILLED, Color.hsv(.7, .3, 1.0))
    else if (node.isCommon)
        mutNode.attrs().add(Style.FILLED, Color.hsv(.3, .75, 0.63))
    return mutNode
}