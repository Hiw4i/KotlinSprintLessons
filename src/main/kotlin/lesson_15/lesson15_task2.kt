package org.example.lesson_15

abstract class WeatherStationStats

class Temperature(val value: Double) : WeatherStationStats()

class PrecipitationAmount(val value: Double) : WeatherStationStats()

class WeatherServer {
    fun sendReport(data: WeatherStationStats) {
        when (data) {
            is Temperature -> println("Sending temperature data: ${data.value} to the server")
            is PrecipitationAmount -> println("PrecipitationAmount: ${data.value}")
            else -> println("Unknow data type: ${data::class}")
        }
    }
}

fun main() {
    val temp = Temperature(22.5)
    val precipitation = PrecipitationAmount(5.0)

    val server = WeatherServer()
    server.sendReport(data = temp)
    server.sendReport(data = precipitation)
}