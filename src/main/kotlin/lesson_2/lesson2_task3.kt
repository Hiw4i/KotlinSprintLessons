package org.example.lesson_2

fun main() {
    val departureHour: Byte = 9
    val departureMinute: Byte = 39

    val travelMinutes: Short = 457

    val hoursInMinutes = 60
    val minutesInHours = 60

    val totalMinutes: Int = departureHour * hoursInMinutes + departureMinute + travelMinutes

    val arrivalHour: Int = totalMinutes / minutesInHours
    val arrivalMinute: Int = totalMinutes % minutesInHours

    println(String.format("%02d:%02d", arrivalHour, arrivalMinute))

}
