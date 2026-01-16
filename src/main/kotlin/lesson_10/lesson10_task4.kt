package org.example.lesson_10

fun main() {
    var wantToPlay = "yes"
    var numberOfWinsByPerson = 0

    while (wantToPlay == "yes") {
        val winner = launchGame()
        if (winner) { numberOfWinsByPerson++ }

        println("Do you want to play again? Enter Yes or No:")
        wantToPlay = readln().lowercase()
    }

    println("Human won $numberOfWinsByPerson round(s).")

}

fun launchGame(): Boolean {
    val humanResult = numberGenerator()
    println("Human rolled the dice and $humanResult fell out.")

    val botResult = numberGenerator()
    println("Bot rolled the dice and $botResult fell out.")

    val message = when {
        humanResult > botResult -> "Humanity has won."
        humanResult < botResult -> "Bot has won."
        else -> "Friendship has won."
    }

    val winnerIsHuman = if (humanResult > botResult) { true } else { false }

    println(message)

    return winnerIsHuman
}

private fun numberGenerator(): Int {
    val number = 1..6
    return number.random()
}