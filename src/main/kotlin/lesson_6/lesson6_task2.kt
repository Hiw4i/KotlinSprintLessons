package org.example.lesson_6

//const val MILLISECOND_SECOND = 1000L
fun main() {
    println("Введите количество секунд для таймера: ")
    val seconds = readln().toInt()

    println("Таймер запущен на $seconds секунд...")

    Thread.sleep(seconds * MILLISECOND_SECOND)

    println("Прошло $seconds секунд")
}
