package org.example.lesson_5



fun main() {
    val winningNumbers = List(3) { (0..42).random() }

    println("Вам необходимо ввести 3 числа.")
    val userNumbers = List(3) {
        print("Введите число: ")
        readln().toInt()
    }

    val matchCount = userNumbers.intersect(winningNumbers).size

    when (matchCount) {
        3 -> println("Поздравляем! Джекпот!")
        2 -> println("Отлично! Два числа угаданы!")
        1 -> println("Угадано одно число — утешительный приз!")
        0 -> println("Неудача! Ни одного числа не угадано.")
    }

    println("Выигрышные числа: $winningNumbers")
}