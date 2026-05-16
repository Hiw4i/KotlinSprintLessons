package org.example.lesson_19

enum class Patron(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank(
    val name: String,
    var typeOfPatron: Patron? = null,
) {
    fun setPatron(patron: Patron) {
        typeOfPatron = patron
    }

    fun shoot() {
        if (typeOfPatron != null) {
            println("Tank $name is shoot by $typeOfPatron patron. Damage is ${typeOfPatron!!.damage}.")
        } else {
            println("Tank $name isn't loaded. You can't shoot.")
        }
    }
}

fun main() {

    val tank = Tank("Tiger")

    tank.shoot()

    tank.setPatron(Patron.GREEN)
    tank.shoot()

    tank.setPatron(Patron.BLUE)
    tank.shoot()

    tank.setPatron(Patron.RED)
    tank.shoot()

}