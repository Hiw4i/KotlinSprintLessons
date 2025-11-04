package org.example.lesson_1

const val secondsInHour = 3600
const val secondsInMinute = 60

fun main() {
    val totalSeconds: Short = 5409

    val hours: Int = totalSeconds / secondsInHour
    val minutes: Int = (totalSeconds % secondsInHour) / secondsInMinute
    val seconds: Int = totalSeconds % secondsInMinute

    println("%02d:%02d:%02d".format(hours, minutes, seconds))

}