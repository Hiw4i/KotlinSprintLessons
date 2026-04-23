package org.example.lesson_16

class Player(
    val name: String,
    private var health: Int,
    private var attackPower: Int,
) {
    private var isDead: Boolean = false

    private fun death() {
        isDead = true
        health = 0
        attackPower = 0
        println("$name is dead.")
    }

    fun attack(target: Player) {
        if (isDead) {
            println("$name is dead and cannot attack!")
            return
        }

        println("$name attacks ${target.name}!")
        target.receiveDamage(target.attackPower)
    }

    private fun receiveDamage(damage: Int) {
        if (isDead) {
            println("$name is already dead.")
            return
        }

        health -= damage

        if (health <= 0) {
            death()
        } else {
            println("$name took $damage damage. Health: $health units.")
        }
    }

    fun takeHeal(amount: Int) {
        if (!isDead) {
            health += amount
            println("$name healed. His health is $health units.")
        } else {
            println("$name is dead. You can't help him.")
        }
    }
}

fun main() {
    val player1 = Player("Dolbaeb", 100, 90)
    val player2 = Player("Alice", 100, 75)

    player2.attack(player1) // Alice атакует Dolbaeb
    player1.takeHeal(10)

    println()
    player1.attack(player2) //Dolbaeb атакует Alice

    println()
    player2.attack(player1)
    player1.takeHeal(100)
    player2.attack(player1)
}