package org.example.lesson_2

fun main() {
    val crystalOre: Byte = 7
    val ironOre: Byte = 11

    val buff: Byte = 20

    val percentDivider = 100

    val buffCrystalOre = (crystalOre * buff) / percentDivider
    val buffIronOre = (ironOre * buff) / percentDivider

    println("Buff crystal ore: $buffCrystalOre")
    println("Buff iron ore: $buffIronOre")

}
