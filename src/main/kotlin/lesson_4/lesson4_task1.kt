package org.example.lesson_4

const val NUMBERS_OF_TABLES = 13

fun main() {
    val bookedTablesToday = 13
    val bookedTablesTomorrow = 9

    val availableTablesToday = NUMBERS_OF_TABLES > bookedTablesToday
    val availableTablesTomorrow = NUMBERS_OF_TABLES > bookedTablesTomorrow

    println("Доступность столиков на сегодня: $availableTablesToday \nДоступность столиков на завтра: $availableTablesTomorrow")

}