package org.example.lesson_9

fun main() {
    println("Enter the 5 ingredients.")
    val setOfIngredients = mutableSetOf<String>()
    var numberOfIngredients = 1

    while (numberOfIngredients <= 5) {
        println("Enter $numberOfIngredients ingredient: ")
        val ingredient =  readln().lowercase()
        setOfIngredients.add(ingredient)

        numberOfIngredients++
    }

    val sortedSetOfIngredients = setOfIngredients.sorted()

    val resultListOfIngredients = mutableListOf<String>()

    for (ingredient in sortedSetOfIngredients) {
        if (sortedSetOfIngredients.indexOf(ingredient) == 0) {
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