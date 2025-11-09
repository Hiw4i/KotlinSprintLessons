package org.example.lesson_5

fun main() {
    val number1 = 6
    val number2 = 7

    println("Сложите 2 числа: $number1 + $number2")
    val result = readln().toInt()

    if (result == number1 + number2) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}