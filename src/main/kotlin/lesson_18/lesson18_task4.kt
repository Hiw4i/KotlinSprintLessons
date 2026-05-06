package org.example.lesson_18

import kotlin.math.pow

open class Box {
    open fun getSurfaceArea() : Double = 0.0
}

class RectangleBox(
    val length: Double,
    val width: Double,
    val height: Double,
) : Box() {
    override fun getSurfaceArea() : Double {
        val area = 2 * (length * width + width * height + length * height)
        println("Sizes of rectangle box: $length, $width, $height, area: $area")

        return area
    }
}

class CubeBox(
    val edge: Double,
) : Box() {
    override fun getSurfaceArea() : Double {
        val area = 6 * edge.pow(2)
        println("Size of cube box: $edge, area: $area")

        return area
    }
}

fun main() {
    val box1: Box = RectangleBox(10.0, 5.0, 3.0)
    val box2: Box = CubeBox(4.0)
    val parcels: List<Box> = listOf(box1, box2)

    parcels.forEach {
        it.getSurfaceArea()
    }
}