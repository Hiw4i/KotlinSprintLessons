package org.example.lesson_21

                    // возвращает Int
fun List<Int>.evenNumbersSum(): Int {
    var sum = 0

    for (number in this) {
        if (number % 2 == 0) {
            sum += number
        }
    }
    return sum
}

fun main() {

    val listOfIntegers = listOf(0, 1, 2, 3, 4, 5)

    println(listOfIntegers.evenNumbersSum())

}