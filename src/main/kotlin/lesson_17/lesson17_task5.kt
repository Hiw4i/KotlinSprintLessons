package org.example.lesson_17

class User(
    realName: String,
    realPassword: String,
) {
    var password = realPassword
        set(value) {
            println("WARNING: You can't change password.")
        }
        get() = "*".repeat(field.length)

    var name: String = realName
        set(value) {
            field = value
            println("WARNING: Login has been changed to $name.")
        }
}


fun main() {
    val user = User("Findus", "123456")
    user.password = "123"
    println(user.password)
    user.name = "CoolFindus"


}