package org.example.lesson_16

private const val PI = 3.14

class Circle(
    private val radius: Double,
) {
    fun calculateCircumference(): Double {
        return 2 * PI * radius
    }

    fun calculateArea(): Double {
        return PI * radius * radius
    }
}

fun main() {
    val radius = 5.0
    val myCircle = Circle(radius)
    val circumference = myCircle.calculateCircumference()
    val area = myCircle.calculateArea()

    println("""
        Radius: $radius
        Circumference: $circumference
        Area: $area
    """.trimIndent())
}