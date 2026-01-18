package org.example.lesson_10

const val CORRECT_USERNAME = "user123"
const val CORRECT_PASSWORD = "password123"

fun main() {
    println("Log in to your account: ")
    println("Enter your username: ")
    val userName = readln()

    println("Enter your password: ")
    val password = readln()

    val token = checkingAccountLogin(userName, password)

    println(giveShoppingCartList(token))
}

fun checkingAccountLogin(username: String, password: String): String? {
    return if (username == CORRECT_USERNAME && password == CORRECT_PASSWORD) {
        generateToken()
    } else {
        null
    }
}

fun generateToken(): String {
    val charPool = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
    return (1..32).map { charPool.random() }.joinToString("")
}

fun giveShoppingCartList(token: String?): Any {
    if (token != null) {
        val shoppingCartList = listOf("Carpet", "Smartphone", "TV", "Wedding ring", "Coffin")
        return shoppingCartList
    } else {
        val failedAuthorisation = "Failed authorization."
        return failedAuthorisation
    }
}