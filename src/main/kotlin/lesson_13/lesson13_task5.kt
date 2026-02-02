package org.example.lesson_13

class PhoneContact5(
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
    println("Enter data about yourself: ")

    println("Enter your name: ")
    val userName = readln()

    println("Enter your phone number:")
    val userPhoneNumber: Long
    try {
        userPhoneNumber = readln().toLong()
    } catch (e: NumberFormatException) {
        println("Error: ${e::class.simpleName}")
        return
    }

    println("Enter your company:")
    val userCompanyInput = readln()
    val userCompany = userCompanyInput.ifBlank { null }

    val userPhoneContact = PhoneContact5(
        userName,
        userPhoneNumber,
        userCompany
    )

    userPhoneContact.printInfo()
}