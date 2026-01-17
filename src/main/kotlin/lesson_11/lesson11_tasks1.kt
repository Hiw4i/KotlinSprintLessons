package org.example.lesson_11

private class User (
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
)

fun main() {
    val user1 = User(
        id = 1,
        login = "123" ,
        password = "ghf123",
        mail = "cat@gmail.com"
    )
    val user2 = User(
        id = 2,
        login = "123" ,
        password = "ghf123",
        mail = "cat@gmail.com"
    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.mail)
    println()
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.mail)
}