package org.example.lesson_9

fun main() {
    println("Enter the 5 ingredients.")
    val listOfIngredients = mutableSetOf<String>()
    var numberOfIngredients = 1

    while (numberOfIngredients <= 5) {
        println("Enter $numberOfIngredients ingredient: ")
        val ingredient =  readln().lowercase()
        listOfIngredients.add(ingredient)

        numberOfIngredients++
    }

    val sortedListOfIngredients = listOfIngredients.toList().sorted()

    val resultListOfIngredients = mutableListOf<String>()

    for (ingredient in sortedListOfIngredients) {
        if (sortedListOfIngredients.indexOf(ingredient) == 0) {
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