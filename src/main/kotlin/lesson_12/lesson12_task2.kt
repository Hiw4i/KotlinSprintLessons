package org.example.lesson_12

class WeatherDay(
    var dayTemp: Int,
    var nightTemp: Int,
    var isPrecipitation: Boolean,
) {

    fun printInfo() {
        println("Day temperature: $dayTemp °C.")
        println("Night temperature: $nightTemp °C.")
        println("Precipitation: $isPrecipitation.")
    }
}

fun main() {

    val monday = WeatherDay(dayTemp = 15, nightTemp = 10, isPrecipitation = false)

    monday.printInfo()
}