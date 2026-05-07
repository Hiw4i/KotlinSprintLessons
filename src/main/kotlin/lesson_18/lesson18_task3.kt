package org.example.lesson_18

open class Animals(val name: String) {
    open fun eating() {
        println("[$name] -> [eating]")
    }
    fun sleeping() {
        println("[$name] -> [sleeping]")
    }
}
class Fox : Animals("Fox") {
    override fun eating() {
        println("[$name] -> [eating berries]")
    }
}
class Dog : Animals("Dog") {
    override fun eating() {
        println("[$name] -> [eating bones]")
    }
}
class Cat : Animals("Cat") {
    override fun eating() {
        println("[$name] -> [eating fish]")
    }
}

fun main() {
    val dog = Dog()
    val cat = Cat()
    val fox = Fox()

    val animals = listOf<Animals>(dog, cat, fox)

    animals.forEach { animals ->
        animals.eating()
    }
}