package org.example.lesson_8

fun main() {
    println("How long do you want to create your list? Yes, I'm very interested!")
    val listLength = readln().toInt()

    val listOfIngredients = Array(listLength) { "" }

    for (ingredient in listOfIngredients) {
        print("Enter ingredient ${listOfIngredients.indexOf(ingredient) + 1}: ")
        listOfIngredients[listOfIngredients.indexOf(ingredient)] = readln()
    }


    println("Wow! I didn't expect this from you, but you did it! Your ingredient list is ready:")

    println(listOfIngredients.joinToString(", "))
}