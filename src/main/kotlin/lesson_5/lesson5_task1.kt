package org.example.lesson_5

fun main() {
    val number1 = (1..10).random()
    val number2 = (1..10).random()

    println("Сложите 2 числа: $number1 + $number2 ")
    val result = readln().toInt()

    if (result == number1 + number2) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}