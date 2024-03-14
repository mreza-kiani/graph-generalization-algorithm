package ca.ucalgary.cs.io

import ca.ucalgary.cs.Config.VISUALIZATION
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import ca.ucalgary.cs.graph.NodeVariable
import guru.nidi.graphviz.attribute.*
import guru.nidi.graphviz.engine.Format
import guru.nidi.graphviz.engine.Graphviz
import guru.nidi.graphviz.engine.GraphvizException
import guru.nidi.graphviz.model.Factory.*
import guru.nidi.graphviz.model.Link
import guru.nidi.graphviz.model.MutableGraph
import guru.nidi.graphviz.model.MutableNode
import java.io.File


fun Graph.visualize(name: String, commonGraph: Graph? = null) {
    if (!VISUALIZATION)
        return
    simplifyNodeVariableNames()

    val g: MutableGraph = mutGraph(name).setDirected(true)

    nodes
        .associateWith { edgesOf(it) }
        .map { (node, edges) ->
            g.add(getMutNode(node))
            (if (node.isCommon) edges else edges.reversed()).forEach { edge ->
                if (commonGraph == null || edge in commonGraph.edgesOf(node))
                    g.add(getMutNode(node).addLink(getMutNode(edge.to)))
                else
                    g.add(getMutNode(node).addLink(getColoredLinkTo(edge.to)))
            }
        }

    val edgeVariableMap = mutableMapOf<Node, MutableList<Node>>()
    nodeVariables.forEach { nodeVariable -> edgeVariableMap[nodeVariable] = mutableListOf() }
    nodes.forEach { node -> edgeVariableMap[node] = mutableListOf() }
    edgeVariables.forEach { edgeVariable ->
        if (edgeVariable.leg1 is NodeVariable)
            edgeVariableMap[edgeVariable.leg1 as NodeVariable]?.add(edgeVariable.leg2)
        else if (edgeVariable.leg2 is NodeVariable)
            edgeVariableMap[edgeVariable.leg2 as NodeVariable]?.add(edgeVariable.leg1)
        else
            edgeVariableMap[edgeVariable.leg1]?.add(edgeVariable.leg2)
    }

    edgeVariableMap.forEach { (node, neighbors) ->
        g.add(getMutNode(node))
        neighbors.forEach { neighbor ->
            g.add(getMutNode(node).addLink(getDottedUndirectedLinkTo(neighbor)))
        }
    }

    try {
        Graphviz.fromGraph(g).render(Format.PNG).toFile(File("data/$name.png"))
    } catch (e: GraphvizException) {
        println(e)
    }
}

private fun getDottedUndirectedLinkTo(neighbor: Node) =
    Link.to(getMutNode(neighbor)).with(Style.DOTTED, Arrow.NONE)

private fun getColoredLinkTo(neighbor: Node) =
    Link.to(getMutNode(neighbor)).with(Color.RED)

fun getMutNode(node: Node): MutableNode {
    val mutNode = mutNode(node.completeName())
    if (node is NodeVariable)
        mutNode.attrs().add(Shape.RECTANGLE, Style.FILLED, Color.hsv(.7, .3, 1.0))
    else if (node.isCommon)
        mutNode.attrs().add(Style.FILLED, Color.hsv(.3, .75, 0.63))
    return mutNode
}