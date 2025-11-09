package org.example.lesson_4

const val WEATHER_IS_SUNNY = true
const val IS_TENT_OPEN = true
const val REQUIRED_HUMIDITY = 20
const val SEASON_IS_NOT_ALLOWED = "зима"

fun main() {

    val weatherTodayIsSunny = true
    val isTentOpenToday = true
    val humidityToday = 20
    val seasonToday = "зима"

    val favorableConditions = (weatherTodayIsSunny == WEATHER_IS_SUNNY) && (isTentOpenToday == IS_TENT_OPEN) && (humidityToday == REQUIRED_HUMIDITY) && (seasonToday != SEASON_IS_NOT_ALLOWED)

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}