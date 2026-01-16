package org.example.lesson_10

fun main() {
    val humanResult = numberGenerator()
    println("Human rolled the dice and $humanResult fell out.")

    val botResult = numberGenerator()
    println("Bot rolled the dice and $botResult fell out.")

    val message = when {
        humanResult > botResult -> "Humanity has won."
        humanResult < botResult -> "Bot has won."
        else -> "Friendship has won."
    }

    println(message)
}

private fun numberGenerator(): Int {
    val number = 1..6
    return number.random()
}