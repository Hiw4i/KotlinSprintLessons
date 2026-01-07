package org.example.lesson_9

fun main() {
    val listOfIngredients = listOf("flour", "butter", "sugar", "salt")

    println("The recipe contains the following ingredients: $listOfIngredients")

    listOfIngredients.forEach {
        println(it)
    }
}