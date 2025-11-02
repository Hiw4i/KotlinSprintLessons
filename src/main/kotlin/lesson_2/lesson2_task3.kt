package org.example.lesson_2

fun main() {
    val departureHour: Byte = 9
    val departureMinute: Byte = 39

    val travelMinutes: Short = 457

    val totalMinutes: Int = departureHour * 60 + departureMinute + travelMinutes

    val arrivalHour: Int = totalMinutes / 60
    val arrivalMinute: Int = totalMinutes % 60

    print(if (arrivalHour < 10) "0$arrivalHour" else "$arrivalHour")
    print(':')
    print(if (arrivalMinute < 10) "0$arrivalMinute" else "$arrivalMinute")

}
