package org.example.lesson_13

class PhoneContact(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)

fun main() {
    val human = PhoneContact("Kiwi", 65173482701, null)
    println(human.company)
}