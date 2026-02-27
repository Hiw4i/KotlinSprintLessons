package org.example.lesson_14

import kotlin.math.PI

const val COLOR_WHITE = "white"
const val COLOR_BLACK = "black"

abstract class Figure(val color: String) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circle(
    color: String,
    val radius: Double
) : Figure(color) {
    override fun area(): Double {
        return PI * radius * radius
    }

    override fun perimeter(): Double {
        val perimeter = 2 * PI * radius
        return perimeter
    }
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double
) : Figure(color) {
    override fun area(): Double {
        val area = width * height
        return area
    }
    override fun perimeter(): Double {
        val perimeter = (width + height) * 2
        return perimeter
    }
}

fun main() {
    val circle1 = Circle(COLOR_WHITE, radius = 2.0)
    val circle2 = Circle(COLOR_BLACK, radius = 25.0)
    val rectangle1 = Rectangle(color = COLOR_WHITE, width = 10.0, height = 10.0)
    val rectangle2 = Rectangle(color = COLOR_WHITE, width = 10.0, height = 10.0)

    val listOfFigures = listOf(circle1, circle2, rectangle1, rectangle2)

    val sumOfPerimetersOfBlackFigures = listOfFigures.filter { it.color == COLOR_BLACK }.sumOf { it.perimeter() }
    val sumOfAreasOfWhiteFigures = listOfFigures.filter { it.color == COLOR_WHITE }.sumOf{ it.area() }

    println("Sum of perimeters of black figures: %.2f".format(sumOfPerimetersOfBlackFigures))
    println("Sum of areas of white figures: %.2f".format(sumOfAreasOfWhiteFigures))
}
