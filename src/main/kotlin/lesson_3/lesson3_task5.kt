package org.example.lesson_3

fun main() {
    val moveInfo = "D2-D4;0"

    val splitMoveInfo = moveInfo.split("-", ";")

    val from = splitMoveInfo[0]
    val to = splitMoveInfo[1]
    val numberMove = splitMoveInfo[2]

    println("From: $from")
    println("To: $to")
    println("Number move: $numberMove")
}