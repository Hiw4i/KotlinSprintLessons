package org.example.lesson_18
import kotlin.random.Random

open class Dice(
    val diceName: String,
    val numberOfSides: Int,
) {
    open fun roll() {
        val result = Random.nextInt(numberOfSides + 1)
        println("The $diceName  is rolled, $result points were rolled")
    }
}

class DiceD4() : Dice("d4", 4) {
// Можно прописать так ещё в каждом, но в данном задании я не вижу смысла
//    override fun roll() {
//        val result = Random.nextInt(numberOfSides + 1)
//        println("The D4  is rolled, $result points were rolled")
//    }
}
class DiceD6() : Dice("d6", 6)
class DiceD8() : Dice("d8", 8)

fun main() {
    val diceD4 = DiceD4()
    val diceD6 = DiceD6()
    val diceD8 = DiceD8()

    val listOfDices = listOf(diceD4, diceD6, diceD8, diceD8)

    listOfDices.forEach {
        it.roll()
    }
}