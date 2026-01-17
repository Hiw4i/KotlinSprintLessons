package org.example.lesson_9

fun main() {
    println("Enter the 5 ingredients separated by commas: ")
    val fiveIngredients = readln()

    val listOfIngredients = fiveIngredients.split(", ").sorted()

    println(listOfIngredients)
}