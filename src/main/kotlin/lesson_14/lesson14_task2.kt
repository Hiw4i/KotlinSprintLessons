package org.example.lesson_14

open class Liner2(
    val name: String,
    val speed: Int = 50,
    val loadCapacity: Int = 100,
    val passengerCapacity: Int = 500,
) {
    open fun loadAction() {
        println("Extends the horizontal ladder from the waist.")
    }

    open fun printInfo() {
        println("""
            $name
            speed = $speed,
            loadCapacity = $loadCapacity,
            passengerCapacity = $passengerCapacity
            """.trimIndent()
        )
        println()

    }
}

class CargoShip2(
    name: String,
) : Liner2(
    name = name,
    speed = 30,
    loadCapacity = 500,
    passengerCapacity = 20
) {
    override fun loadAction() {
        println("Activates the loading crane.")
    }
}

class IceShip2(
    name: String,
) : Liner2(
    name = name,
    speed = 20,
    loadCapacity = 50,
    passengerCapacity = 50
) {
    val canBreakIce: Boolean = true

    override fun loadAction() {
        println("Opens the gate from the aft side.")
    }
}

fun main() {
    val liner = Liner2("Liner Kiwi")
    val cargoShip = CargoShip2("Cargo ship Kiwi")
    val iceShip = IceShip2("Ice ship Kiwi")

    liner.printInfo()
    cargoShip.printInfo()
    iceShip.printInfo()

    liner.loadAction()
    cargoShip.loadAction()
    iceShip.loadAction()
}