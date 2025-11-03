package org.example.lesson_3

fun main() {
    val moveInfo = "D2-D4;0"

    val splitMoveInfo = moveInfo.split(";")
    val splitMoveInfoWithoutNumber = splitMoveInfo[0].split("-")

    val from = splitMoveInfoWithoutNumber[0]
    val to = splitMoveInfoWithoutNumber[1]
    val numberMove = splitMoveInfo[1]

    println("From: $from")
    println("To: $to")
    println("Number move: $numberMove")
}