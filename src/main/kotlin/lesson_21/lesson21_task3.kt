package org.example.lesson_21

class User(
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

fun User.isHealthy(): Boolean = currentHealth == maxHealth

fun main() {

    val user = User(name = "Ivan", currentHealth = 18.0, maxHealth = 100.0)
    println(user.isHealthy())

}