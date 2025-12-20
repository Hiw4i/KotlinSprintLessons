package org.example.lesson_7

const val MILLISECOND_SECOND = 1000L

fun main() {
    println("Сколько тебе секунд нужно?")
    val seconds = readln().toInt()

    for (i in seconds downTo 1) {
        println("Осталось $i сек")
        Thread.sleep(MILLISECOND_SECOND)
    }

    println("Время вышло")
}
