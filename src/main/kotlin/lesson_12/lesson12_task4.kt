package org.example.lesson_12

class WeatherInfo3(
    dayTempInKelvin: Int,
    nightTempInKelvin: Int,
    isPrecipitationInput: Boolean,
) {
    val dayTemp: Int = dayTempInKelvin - 273
    val nightTemp: Int = nightTempInKelvin - 273
    val isPrecipitation: Boolean = isPrecipitationInput

    init {
        printInfo()
    }

    fun printInfo() {
        println("Day temperature: $dayTemp °C.")
        println("Night temperature: $nightTemp °C.")
        println("Precipitation: $isPrecipitation.")
    }
}

fun main() {
    val monday = WeatherInfo3(dayTempInKelvin = 288, nightTempInKelvin = 283, isPrecipitationInput = false)
}