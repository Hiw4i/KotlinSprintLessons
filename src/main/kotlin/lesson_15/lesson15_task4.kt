package org.example.lesson_15

interface Searchable {
    fun findComponents()
}

abstract class Product(
    val name: String,
    val quantity: Int,
)

class Instrument(
    name: String,
    quantity: Int,
) : Product(name, quantity), Searchable {

    override fun findComponents() {
        println("Searching for components compatible with: $name...")
    }
}

class Component(
    name: String,
    quantity: Int,
) : Product(name, quantity)

fun main() {
    val guitar = Instrument("Electric Guitar", 5)
    val strings = Component("Steel Strings", 50)

    println("Product: ${guitar.name}, Stock: ${guitar.quantity}")
    println("Product: ${strings.name}, Stock: ${strings.quantity}")

    println("\"Action: find components of guitar:\"")
    guitar.findComponents()
}