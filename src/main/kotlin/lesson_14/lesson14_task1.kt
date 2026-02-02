package org.example.lesson_14

open class Liner(
    val name: String,
    val speed: Int = 50,
    val loadCapacity: Int = 100,
    val passengerCapacity: Int = 500,
)

class CargoShip(
    name: String,
) : Liner(
    name = name,
    speed = 30,
    loadCapacity = 500,
    passengerCapacity = 20
)

class IceShip(
    name: String,
) : Liner(
    name = name,
    speed = 20,
    loadCapacity = 50,
    passengerCapacity = 50
) {
    val canBreakIce: Boolean = true
}

fun main() {
    val liner = Liner("Liner Kiwi")
    val cargoShip = CargoShip("Cargo ship Kiwi")
    val iceShip = IceShip("Ice ship Kiwi")
}