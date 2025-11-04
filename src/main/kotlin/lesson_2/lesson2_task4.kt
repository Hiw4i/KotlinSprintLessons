package org.example.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11

    val buff = 20

    val percentDivider = 100

    val buffCrystalOre = (crystalOre * buff) / percentDivider
    val buffIronOre = (ironOre * buff) / percentDivider

    println("Buff crystal ore: $buffCrystalOre")
    println("Buff iron ore: $buffIronOre")

}
