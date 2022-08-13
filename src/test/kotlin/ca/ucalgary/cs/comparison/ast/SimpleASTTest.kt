package ca.ucalgary.cs.comparison.ast

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import ca.ucalgary.cs.io.visualize

class SimpleASTTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        val p = Node("Program")
        val animalClass = Node("ClassDeclaration: Animal")
        val animalClassMethod1 = Node("MethodDeclaration: Animal.animalSound(String)")
        val animalClassPrint = Node("Statement: print")
        val animalClassPrintStringAddition = Node("StringAdditionStatement: left + right")
        val stringAdditionLeftChild = Node("ConstantString: The animal says: ")
        val stringAdditionRightChild = Node("Variable: sound")
        val dogClass = Node("ClassDeclaration: Dog")
        val dogClassMethod1 = Node("MethodDeclaration: Dog.animalSound(String)")
        val dogClassMethod1Stm1 = Node("VariableDeclaration: int a")
        val dogClassMethod1Stm1Part2 = Node("Assignment: a = 12")
        val dogClassMethod1Stm2 = Node("Assignment: sound = x")
        val dogClassMethod1Stm2Part2 = Node("StringAdditionStatement: sound + \"!!\"")
        val mainClass = Node("ClassDeclaration: Main")
        val mainMethodMain = Node("MethodDeclaration: Main.main(String[])")
        val mainMethodStm1 = Node("VariableDeclaration: Animal myAnimal")
        val mainMethodStm1Part2 = Node("Assignment: myAnimal = new Animal()")
        val mainMethodStm2 = Node("VariableDeclaration: Dog myDog")
        val mainMethodStm2Part2 = Node("Assignment: myDog = new Dog()")
        val mainMethodStm3 = Node("MethodCall: myAnimal.animalSound(\"Foo\"")
        val mainMethodStm4 = Node("MethodCall: myDog.animalSound(\"Bar\"")
        val catClass = Node("ClassDeclaration: Cat")
        val catClassMethod1 = Node("MethodDeclaration: Cat.animalSound(String)")
        val catClassMethod1Stm1 = Node("VariableDeclaration: int b")
        val catClassMethod1Stm1Part2 = Node("Assignment: b = 8")
        val catClassMethod1Stm2 = Node("Assignment: sound = x")
        val catClassMethod1Stm2Part2 = Node("Assignment: sound = \"meow\"")
        val main2MethodStm2 = Node("VariableDeclaration: Cat myCat")
        val main2MethodStm2Part2 = Node("Assignment: myCat = new Cat()")
        val main2MethodStm4 = Node("MethodCall: myCat.animalSound(\"Meow\"")

        graph1 = Graph.from(
            nodes = listOf(p, animalClass, animalClassMethod1, animalClassPrint, animalClassPrintStringAddition,
                stringAdditionLeftChild, stringAdditionRightChild, dogClass, dogClassMethod1, dogClassMethod1Stm1,
                dogClassMethod1Stm1Part2, dogClassMethod1Stm2, dogClassMethod1Stm2Part2, mainClass, mainMethodMain,
                mainMethodStm1, mainMethodStm1Part2, mainMethodStm2, mainMethodStm2Part2, mainMethodStm3, mainMethodStm4),
            edges = mapOf(
                p to listOf(animalClass, dogClass, mainClass),
                animalClass to listOf(animalClassMethod1),
                animalClassMethod1 to listOf(animalClassPrint),
                animalClassPrint to listOf(animalClassPrintStringAddition),
                animalClassPrintStringAddition to listOf(stringAdditionLeftChild, stringAdditionRightChild),
                dogClass to listOf(dogClassMethod1),
                dogClassMethod1 to listOf(dogClassMethod1Stm1, dogClassMethod1Stm2),
                dogClassMethod1Stm1 to listOf(dogClassMethod1Stm1Part2),
                dogClassMethod1Stm2 to listOf(dogClassMethod1Stm2Part2),
                mainClass to listOf(mainMethodMain),
                mainMethodMain to listOf(mainMethodStm1, mainMethodStm2, mainMethodStm3, mainMethodStm4),
                mainMethodStm1 to listOf(mainMethodStm1Part2),
                mainMethodStm2 to listOf(mainMethodStm2Part2),
            )
        )

        graph2 = Graph.from(
            nodes = listOf(p, animalClass, animalClassMethod1, animalClassPrint, animalClassPrintStringAddition,
                stringAdditionLeftChild, stringAdditionRightChild, catClass, catClassMethod1, catClassMethod1Stm1,
                catClassMethod1Stm1Part2, catClassMethod1Stm2, catClassMethod1Stm2Part2, mainClass, mainMethodMain,
                mainMethodStm1, mainMethodStm1Part2, main2MethodStm2, main2MethodStm2Part2, mainMethodStm3, main2MethodStm4),
            edges = mapOf(
                p to listOf(animalClass, catClass, mainClass),
                animalClass to listOf(animalClassMethod1),
                animalClassMethod1 to listOf(animalClassPrint),
                animalClassPrint to listOf(animalClassPrintStringAddition),
                animalClassPrintStringAddition to listOf(stringAdditionLeftChild, stringAdditionRightChild),
                catClass to listOf(catClassMethod1),
                catClassMethod1 to listOf(catClassMethod1Stm1, catClassMethod1Stm2),
                catClassMethod1Stm1 to listOf(catClassMethod1Stm1Part2),
                catClassMethod1Stm2 to listOf(catClassMethod1Stm2Part2),
                mainClass to listOf(mainMethodMain),
                mainMethodMain to listOf(mainMethodStm1, main2MethodStm2, mainMethodStm3, main2MethodStm4),
                mainMethodStm1 to listOf(mainMethodStm1Part2),
                main2MethodStm2 to listOf(main2MethodStm2Part2),
            )
        )
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        graph1.visualize("Animal_Dog")
        graph2.visualize("Animal_Cat")
        commonGraph.visualize("Animal_Generalization")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("Animal_Dog_Diff")
    }
    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("Animal_Cat_Diff")
    }
}