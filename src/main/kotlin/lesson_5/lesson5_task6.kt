package org.example.lesson_5

const val CM_TO_METRES = 100

fun main() {

    println("Введите ваш вес в кг: ")
    val userWeight = readln().toDouble()

    println("Введите ваш рост в см: ")
    var userHeight = readln().toDouble()

    userHeight /= CM_TO_METRES

    val bodyMassIndex = userWeight / (userHeight * userHeight)

    val category = when {
        bodyMassIndex < 18.5 -> "Недостаточная масса тела"
        bodyMassIndex < 25 -> "Нормальная масса тела"
        bodyMassIndex < 30 -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("Ваш ИМТ: ${"%.2f".format(bodyMassIndex)}, категория: $category")
}