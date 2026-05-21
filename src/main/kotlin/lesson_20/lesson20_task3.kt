package org.example.lesson_20

class GamePlayer(
    val name: String,
    val hasKey: Boolean,
)

fun main() {
    val checkKey: (GamePlayer) -> String = { player ->
        if (player.hasKey) {
            "The player ${player.name} opened the door."
        } else {
            "The door is locked."
        }
    }

    val ivan = GamePlayer("Ivan", false)
    val liam = GamePlayer("Liam", true)
    println(checkKey(ivan))
    println(checkKey(liam))
}