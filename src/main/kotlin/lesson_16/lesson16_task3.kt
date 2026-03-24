package org.example.lesson_16

class User(
    val login: String,
    private val password: String,
) {
    fun checkPassword(input: String): Boolean {
        return input == password
    }
}

fun main() {
    val user = User("Alice_Developer", "Secret123")

    println("Input your password: ")
    val passwordInput = readln()

    if (user.checkPassword(passwordInput)) {
        println("Access granted for ${user.login}!")
    } else {
        println("Invalid password")
    }
}