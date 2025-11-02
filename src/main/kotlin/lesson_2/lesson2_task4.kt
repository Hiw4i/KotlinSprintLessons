package org.example.lesson_2

fun main() {
    val crystalOre: Byte = 7
    val ironOre: Byte = 11

    val buff: Byte = 20

    val buffCrystalOre = (crystalOre * buff) / 100
    val buffIronOre = (ironOre * buff) / 100

    println("Buff crystal ore: $buffCrystalOre")
    println("Buff iron ore: $buffIronOre")

}
