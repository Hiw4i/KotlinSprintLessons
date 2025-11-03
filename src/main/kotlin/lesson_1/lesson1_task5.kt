package org.example.lesson_1

fun main() {
    val totalSeconds: Short = 5409

    val secondsInHour = 3600
    val secondsInMinute = 60

    val hours: Int = totalSeconds / secondsInHour
    val minutes: Int = (totalSeconds % secondsInHour) / secondsInMinute
    val seconds: Int = totalSeconds % secondsInMinute

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))

}