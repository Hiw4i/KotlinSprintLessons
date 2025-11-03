package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val summa: Double =  70000.0
    val annualRate: Double = 16.7
    val years: Double = 20.0

    val percentDivider = 100
    val one = 1

    val finalSumma: Double = summa * (one + annualRate / percentDivider).pow(years)

    println(String.format("%.3f", finalSumma))
}
