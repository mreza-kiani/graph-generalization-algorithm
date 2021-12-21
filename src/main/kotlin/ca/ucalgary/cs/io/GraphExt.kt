package ca.ucalgary.cs.io

import ca.ucalgary.cs.graph.Graph
import java.io.File

fun Graph.createClassFile(address: String) {
    File("data/$address.kt").writeText(
        nodes
            .sortedBy { edges[it]?.size ?: 0 }
            .associateWith { edgesOf(it) }
            .map { (node, neighbors) ->
                val parents = neighbors.joinToString(", ") { it.name }
                "${"open class"} ${node.name} ${if (parents.isNotBlank()) ":" else ""} $parents"
            }
            .joinToString("\n")
    )
}