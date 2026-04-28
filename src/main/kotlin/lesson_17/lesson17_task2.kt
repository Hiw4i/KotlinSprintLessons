package org.example.lesson_17

class Ship(
    name: String,
    val speed: Int,
    val port: String,
) {
    var name: String = name
        get() = field
        set(value) {
            println("WARNING: You can't change name.")
        }
}

fun main() {

    val ship = Ship("Dolbaeb", 90, "Huevo")

    println("Ship's name is ${ship.name}")
    ship.name = "Poop"
    println("Ship's name is ${ship.name}")

}