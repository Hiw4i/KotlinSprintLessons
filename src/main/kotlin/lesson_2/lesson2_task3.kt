package org.example.lesson_2

const val HOURS_IN_MINUTES = 60
const val MINUTES_IN_HOURS = 60

fun main() {
    val departureHour: Byte = 9
    val departureMinute: Byte = 39

    val travelMinutes: Short = 457

    val totalMinutes: Int = departureHour * HOURS_IN_MINUTES + departureMinute + travelMinutes

    val arrivalHour: Int = totalMinutes / MINUTES_IN_HOURS
    val arrivalMinute: Int = totalMinutes % MINUTES_IN_HOURS

    println(String.format("%02d:%02d", arrivalHour, arrivalMinute))

}
