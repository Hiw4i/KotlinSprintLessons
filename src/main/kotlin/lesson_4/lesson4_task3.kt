package org.example.lesson_4

const val REQUIRED_HUMIDITY = 20

fun main() {

    val weatherTodayIsSunny = true
    val isTentOpenToday = true
    val humidityToday = 20
    val seasonToday = "зима"

    val favorableConditions = (weatherTodayIsSunny) && (isTentOpenToday) && (humidityToday == REQUIRED_HUMIDITY) && (seasonToday != "зима")

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}