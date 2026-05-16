package org.example.lesson_19

enum class Gender(val letter: String) {
    MALE("male"),
    FEMALE("female");

    // Чтобы я мог вызвать метод fromString напрямую через имя класса,
    // не создавая самого человека или пол.
    companion object {
        // Среди полученного значения ищу совпадение с константами и возращаю нужную константу
        fun fromString(input: String): Gender? {
            val cleanedInput = input.trim().lowercase()
            return entries.find { it.letter == cleanedInput}
        }
    }
}

class Person(
    val name: String,
    val gender: Gender,
) {
    fun printInfo() {
        println("""
            Name: $name,
            gender: $gender
        """.trimIndent())
        println()
    }
}


fun main() {
    val cards = mutableListOf<Person>()

    println("=== Welcome to the 'CardIndex' app ===")
    println("You need to enter data for 5 people.")
    println("Input format: first enter the name, then the gender.")
    println("Available gender values: '${Gender.MALE}' or '${Gender.FEMALE}'")
    println("================================================\n")

    while (cards.size < 5) {
        println("------------------")
        println("\nNumber of card: ${cards.size + 1}")

        var name: String
        var gender: Gender?

        println("Enter the name:")
        name = readln()

        while (name.isBlank()) {
            println("Name cannot be empty. Please try again.\n")
            println("Enter the name: ")
            name = readln()
        }

        println("Enter the gender:")
        gender = Gender.fromString(readln())

        while (gender == null) {
            println("Invalid gender. Use the following values: '${Gender.MALE}' or '${Gender.FEMALE}'.\n")
            println("Enter the gender:")
            gender = Gender.fromString(readln())
        }

        val person = Person(name, gender)
        cards.add(person)
    }

    println("------------------")
    println("List of cards:\n")
    cards.forEachIndexed { index, card ->
        println("Card number: ${index + 1}")
        card.printInfo()
    }
}