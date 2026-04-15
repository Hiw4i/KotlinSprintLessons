package org.example.lesson_16

class Order(
    private val id: Int,
    private var status: Boolean,
) {
    private fun updateStatus(newStatus: Boolean) {
        this.status = newStatus
        println("Hello, your status has been changed to $newStatus successfully.")
    }

    fun requestStatusChange(newStatus: Boolean) {
        println("Sending request to the manager to change status for Order #$id to \"$newStatus\"...")

        val isApproved = true
        if (isApproved) {
            println("Manager approved the request.")
            updateStatus(newStatus)
        } else {
            println("Manager rejected the request.")
        }

    }

    fun printInfo() {
        println("ID: $id")
        println("Status: $status")
    }
}

fun main() {
    val order1 = Order(1, false)
    order1.printInfo()

    order1.requestStatusChange(true)
    order1.printInfo()
}