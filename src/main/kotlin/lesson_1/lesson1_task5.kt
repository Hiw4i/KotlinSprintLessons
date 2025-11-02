package org.example.lesson_1

fun main() {
    val totalSeconds: Short = 5409

    val hours: Int = totalSeconds / 3600
    val minutes: Int = (totalSeconds % 3600) / 60   //остаток от часов перевожу в минуты
    val seconds: Int = totalSeconds % 60   //остаток от минут = оставшиеся сукунды

    if (hours < 10) print("0$hours") else print(hours)
    print(":")
    if (minutes < 10) print("0$minutes") else print(minutes)
    print(":")
    if (seconds < 10) print("0$seconds") else print(seconds)

}