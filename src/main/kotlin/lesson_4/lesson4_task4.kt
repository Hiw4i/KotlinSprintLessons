package org.example.lesson_4



fun main() {
    val numberOfDayToday = 5
    val isArmsAndAbsToday = numberOfDayToday % 2 != 0
    val isLegAndBackToday = !isArmsAndAbsToday

    println("""
        Упражнения для рук: $isArmsAndAbsToday,
        Упражнения для ног: $isLegAndBackToday,
        Упражнения для спины: $isLegAndBackToday,
        Упражнения для пресса: $isArmsAndAbsToday
    """.trimIndent())
}