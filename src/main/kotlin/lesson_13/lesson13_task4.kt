package org.example.lesson_13

class PhoneContact4(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInfo() {
        println("Your name: $name")
        println("Your phone number: $phoneNumber")
        println("Your company: ${company?: "<not specified>"}")
    }
}

fun main() {
    println("Enter data about yourself:")

    println("Enter your name:")
    val userName = readln()

    println("Enter your phone number:")
    var userPhoneNumber = readln().toLongOrNull()

    while (userPhoneNumber == null) {
        println("You didn't enter phone number.")

        println("Enter your phone number:")
        userPhoneNumber = readln().toLongOrNull()
    }

    println("Enter your company:")
    val userCompanyInput = readln()
    val userCompany = userCompanyInput.ifBlank { null }

    val userPhoneContact = PhoneContact4(
        userName,
        userPhoneNumber,
        userCompany
    )

    userPhoneContact.printInfo()
}