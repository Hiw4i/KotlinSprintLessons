package org.example.lesson_10

fun main() {
    val humanResult = generateNumber()
    println("Human rolled the dice and $humanResult fell out.")

    val botResult = generateNumber()
    println("Bot rolled the dice and $botResult fell out.")

    val message = when {
        humanResult > botResult -> "Humanity has won."
        humanResult < botResult -> "Bot has won."
        else -> "Friendship has won."
    }

    println(message)
}

private fun generateNumber(): Int {
    val number = 1..6
    return number.random()
}