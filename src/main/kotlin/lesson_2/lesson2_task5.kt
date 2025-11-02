package org.example.lesson_2

fun main() {
    val summa: Double =  70000.0
    val annualRate: Double = 16.7
    val years: Double = 20.0

    val finalSumma: Double = summa * Math.pow(1 + annualRate/100, years)

    println(String.format("%.3f", finalSumma))
}
