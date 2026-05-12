package org.example.lesson_19

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun main() {
    println("Available fish: ")
    Fish.entries.forEach {
        println(it)
    }
}