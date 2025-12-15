package org.example.lesson_8

fun main() {
    val dailyListOfAds = arrayOf(5, 1, 0, 7, 0, 1, 3)

    var totalOfAds = 0
    for (adsPerDay in dailyListOfAds) {
        totalOfAds += adsPerDay
    }

    println("Всего просмотрено рекламы за неделю: $totalOfAds")
}