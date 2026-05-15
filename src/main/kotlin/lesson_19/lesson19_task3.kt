package org.example.lesson_19

class SpaceShip(
    val name: String,
) {
    fun takeOff() {
        println("Space Ship $name is taking off")
    }

    fun land() {
        TODO("Need a additional information about this logic.")
    }

    fun shootAsteroid() {
        throw NotImplementedError("The shooting logic is not implemented yet!")
        // OR  TODO("The shooting logic is not implemented yet!")

    }
}

fun main() {
    val spaceShip = SpaceShip("Ship")
    spaceShip.takeOff()
    spaceShip.land()
    spaceShip.shootAsteroid()
}