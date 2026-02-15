package org.example.lesson_14

import kotlin.math.PI

abstract class Figure(val color: String) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circle(
    color: String,
    val radius: Double
) : Figure(color) {
    override fun area(): Double {
        val area = PI * radius * radius
        return area
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
    val circle1 = Circle("white", radius = 2.0)
    val circle2 = Circle("black", radius = 25.0)
    val rectangle1 = Rectangle(color = "white", width = 10.0, height = 10.0)
    val rectangle2 = Rectangle(color = "white", width = 10.0, height = 10.0)

    val listOfFigures = listOf(circle1, circle2, rectangle1, rectangle2)

    val sumOfPerimetersOfBlackFigures = listOfFigures.filter { it.color == "black" }.sumOf { it.perimeter() }
    val sumOfAreasOfWhiteFigures = listOfFigures.filter { it.color == "white" }.sumOf{ it.area() }

    println("Sum of perimeters of black figures: %.2f".format(sumOfPerimetersOfBlackFigures))
    println("Sum of areas of white figures: %.2f".format(sumOfAreasOfWhiteFigures))
}
