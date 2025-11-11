package org.example.lesson_5

fun main() {
    val firstCorrectNumber = (0..42).random()
    val secondCorrectNumber = (0..42).random()

    println("Введите 2 числа от 0 до 42: ")
    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()

    if ((firstNumber == firstCorrectNumber && secondNumber == secondCorrectNumber) ||
        (firstNumber == secondCorrectNumber && secondNumber == firstCorrectNumber)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((firstNumber == firstCorrectNumber || secondNumber == secondCorrectNumber) ||
        (firstNumber == secondCorrectNumber || secondNumber == firstCorrectNumber)) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Правильные числа были: $firstCorrectNumber и $secondCorrectNumber")
}