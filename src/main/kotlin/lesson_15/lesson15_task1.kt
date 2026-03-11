package org.example.lesson_15

interface Flyable {
    fun fly()
}

interface Swimmable {
    fun swim()
}


class Crucian(val name: String) : Swimmable {
    override fun swim() {   // overrire - переопределяет родительскую функцию
        println("$name floats, moving its fins.")
    }
}

class Gull(val name: String) : Flyable {
    override fun fly() {
        println("$name hovers over the sea.")
    }
}

class Duck(val name: String) : Flyable, Swimmable {
    override fun swim() {
        println("$name floats gracefully on the lake.")
    }
    override fun fly() {
        println("$name flies heavily over the sea.")
    }
}


fun main() {
    val myCrucian = Crucian("My Crucian")
    val myGull = Gull("My Gull")
    val myDuck = Duck("My Duck")

    myCrucian.swim()
    myGull.fly()
    myDuck.swim()
    myDuck.fly()
}