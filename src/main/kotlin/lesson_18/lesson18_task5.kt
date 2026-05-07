package org.example.lesson_18

class Screen {

    // 2 designs: with "=" and with "return"
    fun draw(x: Int, y: Int, side: Int? = null, isCircle: Boolean = false): String = when {
        side == null -> "A POINT is drawn at coordinates (x: $x, y: $y)"
        isCircle -> "A CIRCLE is drawn at (x: $x, y: $y) with radius $side"
        else -> "A SQUARE is drawn at (x: $x, y: $y) with side $side"
    }

    fun draw(x: Float, y: Float, side: Float? = null, isCircle: Boolean = false): String {
        return when {
            side == null -> "A POINT is drawn at coordinates (x: $x, y: $y)"
            isCircle -> "A CIRCLE is drawn at (x: $x, y: $y) with radius $side"
            else -> "A SQUARE is drawn at (x: $x, y: $y) with side $side"
        }
    }

}

fun main() {
    val screen = Screen()

    println(screen.draw(10, 20))           // Dot Int
    println(screen.draw(15.5f, 30.2f))     // Dot Float

    println(screen.draw(0, 0, 100))                // Square Int
    println(screen.draw(5.0f, 5.0f, 25.5f))        // Square Float

    println(screen.draw(50, 50, 15, isCircle = true))               // Circle Int
    println(screen.draw(100.1f, 100.2f, 40.0f, isCircle = true))    // Circle Float
}