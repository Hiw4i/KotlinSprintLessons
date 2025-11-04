package org.example.lesson_4

const val NumbersOfTables = 13

fun main() {
    val bookedTablesToday = 13
    val bookedTablesTomorrow = 9

    val availableTablesToday = NumbersOfTables > bookedTablesToday
    val availableTablesTomorrow = NumbersOfTables > bookedTablesTomorrow

    println("Доступность столиков на сегодня: $availableTablesToday \nДоступность столиков на завтра: $availableTablesTomorrow")

}