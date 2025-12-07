package org.example.lesson_6

fun main() {
    val number = (1..9).random()
    var trying = 5

    println("Угадай число в промежутке от 1 до 9. Даётся 5 попыток.")

    while (trying > 0) {
        println("Введи число: ")
        val userNumber = readln().toInt()

        if (userNumber == number) {
            println("Это была великолепная игра!")
            return
        }
        else {
            trying--
            println("Неверно. Осталось попыток: $trying")
        }
    }

    println("Было загадано число $number")
}
