package org.example.lesson_13

class PhoneContact3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
)

fun main() {
    val listOfContacts = listOf(
        PhoneContact3("Alex", 89112641854, "Google"),
        PhoneContact3("Maria", 89225867540, null),
        PhoneContact3("John", 89334958674, "null"),
        PhoneContact3("Kate", 89444502856, "Google"),
        PhoneContact3("Kiwi", 89551235986, null),
    )

    val listOfCompanies = listOfContacts.mapNotNull { it.company }.distinct()
    println(listOfCompanies)
}