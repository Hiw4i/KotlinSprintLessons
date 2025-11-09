package org.example.lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    val currentYear = 2025

    println("Введите год рождения: ")
    val dateOfBirth = readln().toInt()
    val userAge = currentYear - dateOfBirth

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом.")
    } else {
        println("Доступ запрещен.")
    }
}