package org.example.lesson_18

class Order(val orderNumber: Int) {

    fun printOrderInfo(item: String) {
        println("The order №$orderNumber")
        println("The $item has been ordered")
        println()
    }

    fun printOrderInfo(items: List<String>) {
        println("The order №$orderNumber")
        println("The following items have been ordered: $items")
        println()
    }

}

fun main() {
    val order1 = Order(190783)

    order1.printOrderInfo("cat bowl")
    order1.printOrderInfo("coffin, 2 flowers, the meaning of life")
}