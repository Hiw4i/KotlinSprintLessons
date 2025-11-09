package org.example.lesson_4



fun main() {
    val numberOfDayToday = 5
    val isArmsAndAbsToday = numberOfDayToday % 2 != 0

    println("""
        Упражнения для рук: $isArmsAndAbsToday,
        Упражнения для ног: ${!isArmsAndAbsToday},
        Упражнения для спины: ${!isArmsAndAbsToday},
        Упражнения для пресса: $isArmsAndAbsToday
    """.trimIndent())
}