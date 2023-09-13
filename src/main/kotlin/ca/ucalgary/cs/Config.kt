package ca.ucalgary.cs

object Config {
    //var BASE_DIR = "/home/mamareza/UofC/Thesis/CodeSearchNet/notebooks/java/CodeSearchNet"
    var BASE_DIR = "src/main/resources/CodeSearchNet"
    var DEBUG_MODE = false
    var VISUALIZATION = false
    var EASY_COPY = false
    var CONTEXT = Context.AST_DIFF
}

enum class Context {
    AST, AST_DIFF, CLASS_DIAGRAM, CALL_GRAPH;

    fun needsUniqueLabels(): Boolean {
        return when (this) {
            AST -> true
            AST_DIFF -> true
            CLASS_DIAGRAM -> false
            CALL_GRAPH -> false
        }
    }
}