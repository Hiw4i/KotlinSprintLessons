package org.example.lesson_6

const val MILLISECOND_SECOND = 1000L

fun main() {
    println("Введите количество секунд для таймера: ")
    var seconds = readln().toInt()

    println("Таймер запущен на $seconds секунд...")

    while (seconds > 0) {
        println("Осталось секунд: $seconds")
        Thread.sleep(MILLISECOND_SECOND)
        seconds--
    }

    println("Время вышло")
}
