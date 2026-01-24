package org.example.lesson_12

class WeatherInfo {
    var dayTemp = 15
    var nightTemp = 10
    var isPrecipitation = false

    fun printInfo() {
        println("Day temperature: $dayTemp °C.")
        println("Night temperature: $nightTemp °C.")
        println("Precipitation: $isPrecipitation.")
    }
}

fun main() {

    val monday = WeatherInfo()
    monday.dayTemp = 11
    monday.nightTemp = 7
    monday.isPrecipitation = true

    val tuesday = WeatherInfo()
    tuesday.dayTemp = 18
    tuesday.nightTemp = 15
    tuesday.isPrecipitation = false

    monday.printInfo()
    tuesday.printInfo()
}