package org.example.lesson_19

enum class Category {
    CLOTHING,
    STATIONERY,
    SUNDRY;

    fun getDisplayName(): String {
        return when (this) {
            CLOTHING -> "Clothes"
            STATIONERY -> "Stationer"
            SUNDRY -> "Sundry"
        }
    }
}

class Product(
    val name: String,
    val id: Int,
    val category: Category,
) {
    fun printInfo() {
        println("""
            Name: $name,
            ID: $id,
            Category: ${category.getDisplayName()}.
        """.trimIndent())
        println()
    }
}

fun main() {
    val shirt = Product("White T-shirt", 1001, Category.CLOTHING)
    val notebook = Product("Checkered notebook", 2005, Category.STATIONERY)
    val mysteryBox = Product("Box with surprise", 9999, Category.SUNDRY)

    shirt.printInfo()
    notebook.printInfo()
    mysteryBox.printInfo()
}