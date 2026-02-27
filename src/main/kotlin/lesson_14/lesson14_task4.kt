package org.example.lesson_14

open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isSuitableForLanding: Boolean,
) {
    open fun printInfo() {
        println("Object: $name (atmosphere: $hasAtmosphere, landing: $isSuitableForLanding)")
    }
}

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
    val satellites: List<Satellite>,
) : CelestialBody(name, hasAtmosphere, isSuitableForLanding) {

    override fun printInfo() {
        super.printInfo()

        println("Satellites:")
        if (satellites.isEmpty()) {
            println("- None")
        } else {
            satellites.forEach { println("- ${it.name}") }
        }
    }
}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
) : CelestialBody(name, hasAtmosphere, isSuitableForLanding)

fun main() {
    val moon = Satellite(
        name = "Moon",
        hasAtmosphere = false,
        isSuitableForLanding = true
    )

    val deimos = Satellite(
        name = "Deimos",
        hasAtmosphere = false,
        isSuitableForLanding = false
    )

    val earth = Planet(
        name = "Earth",
        hasAtmosphere = true,
        isSuitableForLanding = true,
        satellites = listOf(moon, deimos)
    )

    earth.printInfo()
}
