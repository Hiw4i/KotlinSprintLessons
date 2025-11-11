package org.example.lesson_5

const val HUNDRED = 100

fun main() {
    print("Введите расстояние поездки в км: ")
    val distance = readln().toDouble()

    print("Введите расход топлива на 100км: ")
    val fuelConsumption = readln().toDouble()

    print("Введите цену за литр топлива: ")
    val fuelPrice = readln().toDouble()

    val fuelNeeded = (distance * fuelConsumption) / HUNDRED

    val totalCost = fuelNeeded * fuelPrice

    println("Необходимое топливо: ${"%.2f".format(fuelNeeded)} л")
    println("Итоговая стоимость поездки: ${"%.2f".format(totalCost)}")
}
