package org.example.lesson_7

fun main() {
    val passwordLength = 6
    var generatedPassword = ""
    val letter = 'a'..'z'
    val number = 0..9

    for (i in 1..passwordLength) {
        if (i % 2 != 0) {
            generatedPassword += letter.random()
        } else {
            generatedPassword += number.random()
        }
    }

    println("Сгенерированный пароль: $generatedPassword")
}
