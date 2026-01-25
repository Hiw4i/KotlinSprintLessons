package org.example.lesson_13

class PhoneContact2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInfo() {
        println(
            "Name: $name\n" +
            "Number: $phoneNumber\n" +
            "Company: ${company ?: "<not specified>"}"
        )
    }
}

fun main() {
    val human = PhoneContact2("Rostislav", 89123456789, "Reddit")

    human.printInfo()
}