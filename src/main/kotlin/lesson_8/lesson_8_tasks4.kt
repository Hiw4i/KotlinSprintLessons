package org.example.lesson_8

fun main() {
    val listOfIngredients = arrayOf("flour", "butter", "sugar", "salt")

    println("Ingredient list:")
    for (i in listOfIngredients.indices) {
        println("${i + 1}: ${listOfIngredients[i]}")
    }

    print("Which ingredient number do you want to replace? ")
    var ingredientNumber = readln().toInt()

    while (ingredientNumber < 1 || ingredientNumber > listOfIngredients.size) {
        println("Oops! There is no ingredient with that number. Try again:")
        ingredientNumber = readln().toInt()
    }

    print("What do you want to replace '${listOfIngredients[ingredientNumber - 1]}' with? ")
    val newIngredient = readln()
    listOfIngredients[ingredientNumber - 1] = newIngredient

    println("Wow! Your updated ingredient list is ready:")
    for (i in listOfIngredients.indices) {
        println("${i + 1}: ${listOfIngredients[i]}")
    }
}