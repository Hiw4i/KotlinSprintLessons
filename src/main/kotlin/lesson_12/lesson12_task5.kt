package org.example.lesson_12

import kotlin.random.Random

class WeatherInfo4(
    dayTempInKelvin: Int,
    nightTempInKelvin: Int,
    isPrecipitationInput: Boolean,
) {
    val dayTemp: Int = dayTempInKelvin - 273
    val nightTemp: Int = nightTempInKelvin - 273
    val isPrecipitation: Boolean = isPrecipitationInput
}

fun main() {
    val weatherForMonth = mutableListOf<WeatherInfo4>()

    repeat(30) {
        val randomDayTempInKelvin = (0..373).random()
        val randomNightTempInKelvin = (0..373).random()
        val randomIsPrecipitationInput = Random.nextBoolean()

        val dayInfo = WeatherInfo4(
            dayTempInKelvin = randomDayTempInKelvin,
            nightTempInKelvin = randomNightTempInKelvin,
            isPrecipitationInput = randomIsPrecipitationInput
        )
        weatherForMonth.add(dayInfo)
    }
    val dayTemp = weatherForMonth.map { it.dayTemp }
    val nightTemp = weatherForMonth.map { it.nightTemp }


    val avgDayTemp = dayTemp.average()
    val avgNightTemp = nightTemp.average()

    val isPrecipitation = weatherForMonth.count { it.isPrecipitation }

    println("Average day temperature: $avgDayTemp °C.")
    println("Average night temperature: $avgNightTemp °C.")
    println("Number of days with precipitation: $isPrecipitation.")
}