package org.example.lesson_2

import kotlin.math.pow

const val PERCENT_DIVIDER = 100
const val ONE = 1

fun main() {
    val summa: Double =  70000.0
    val annualRate: Double = 16.7
    val years: Double = 20.0

    val finalSumma: Double = summa * (ONE + annualRate / PERCENT_DIVIDER).pow(years)

    println("%.3f".format(finalSumma))
}
