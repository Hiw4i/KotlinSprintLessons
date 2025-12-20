package org.example.lesson_8

fun main() {
    val listOfIngredients = arrayOf("flour", "butter", "sugar", "salt")

    println("Ingredient list:")
    for (ingredient in listOfIngredients) {
        println("${listOfIngredients.indexOf(ingredient) + 1}: $ingredient")
    }

    print("Which ingredient do you want to replace? ")
    var ingredientToReplace = readln()

    while (listOfIngredients.indexOf(ingredientToReplace) == -1) {
        println("Oops! There is no such ingredient. Try again:")
        ingredientToReplace = readln()
    }

    print("What do you want to replace \"$ingredientToReplace\" with? ")
    val newIngredient = readln()
    listOfIngredients[listOfIngredients.indexOf(ingredientToReplace)] = newIngredient

    println("Wow! Your updated ingredient list is ready:")
    for (ingredient in listOfIngredients) {
        println("${listOfIngredients.indexOf(ingredient) + 1}: $ingredient")
    }
}