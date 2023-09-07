package ca.ucalgary.cs

object Config {
    //var BASE_DIR = "/home/mamareza/UofC/Thesis/CodeSearchNet/notebooks/java/CodeSearchNet"
    var BASE_DIR = "src/main/resources/CodeSearchNet"
    var DEBUG_MODE = false
    var VISUALIZATION = false
    var CONTEXT = Context.AST_DIFF
}

enum class Context {
    AST, AST_DIFF, CLASS_DIAGRAM;

    fun needsUniqueLabels(): Boolean {
        return when (this) {
            AST -> true
            AST_DIFF -> true
            CLASS_DIAGRAM -> false
        }
    }
}