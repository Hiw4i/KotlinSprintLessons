package org.example.lesson_22

data class GalacticGuide(
    val name: String,
    val desc: String,
    val dateTime: String,
    val distance: Double,
)

fun main() {

    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        desc = "Galaxy for Singles",
        dateTime = "2079-01-03 15:00",
        distance = 6.345
    )

    println("Name: ${alphaCentauri.component1()}")
    println("Description: ${alphaCentauri.component2()}")
    println("Time/Date:   ${alphaCentauri.component3()}")
    println("Distance:    ${alphaCentauri.component4()} light years from Earth")

}