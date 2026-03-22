package org.example.lesson_16

import kotlin.random.Random

class Dice {
    private val number: Int = Random.nextInt(1,7)

    fun showResult() {
        println("The dice shows $number.")
    }
}

fun main() {
    val myDice = Dice()
    myDice.showResult()
}