package org.example.lesson_9

fun main() {
    println("Enter the 5 ingredients.")
    val listOfIngredients = mutableListOf<String>()
    var numberOfIngredients = 1

    while (numberOfIngredients <= 5) {
        println("Enter $numberOfIngredients ingredient: ")
        val ingredient =  readln().lowercase()
        if (!listOfIngredients.contains(ingredient)) {
            listOfIngredients.add(ingredient)
        }

        numberOfIngredients++
    }

    listOfIngredients.sort()

    val resultListOfIngredients = mutableListOf<String>()

    for (ingredient in listOfIngredients) {
        if (listOfIngredients.indexOf(ingredient) == 0) {
            resultListOfIngredients.add(
                ingredient.replaceFirstChar {
                    it.uppercase()
                }
            )
        }
        else {
            resultListOfIngredients.add(ingredient)
        }
    }

    println(resultListOfIngredients.joinToString(", "))
}