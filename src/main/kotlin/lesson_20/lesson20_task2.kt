package org.example.lesson_20

class Player(
    val name: String,
    var currentHealth: Double,
    var maxHealth: Double,
) {
    fun printInfo() {
        println("""
            -----------
            player: $name
            current health: $currentHealth
            max health: $maxHealth
            -----------
        """.trimIndent())
    }
}

fun main() {
    val healingPotion: (Player) -> Unit = { player ->
        println("The healing potion was used by ${player.name}. All health restored!")
        player.currentHealth = player.maxHealth
    }

    val ivan = Player("Ivan", 30.0, 100.0)
    ivan.printInfo()
    healingPotion(ivan)
    ivan.printInfo()
}