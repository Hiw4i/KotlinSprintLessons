package org.example.lesson_3

fun main() {
    var lastName = "Андреева"
    val firstName = "Татьяна"
    val middleName = "Сергеевна"
    var age = 20

    println("$lastName $firstName $middleName, $age лет")

    age = 22
    lastName = "Сидорова"

    println(" $lastName $firstName $middleName, $age года")
}