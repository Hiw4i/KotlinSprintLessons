package org.example.lesson_7

fun main() {
    val passwordLength = 6
    var generatedPassword = ""

    for (i in 1..passwordLength) {
        if (i % 2 != 0) {
            val letter = ('a'..'z').random()
            generatedPassword += letter
        } else {
            val number = (0..9).random()
            generatedPassword += number
        }
    }

    println("Сгенерированный пароль: $generatedPassword")
}
