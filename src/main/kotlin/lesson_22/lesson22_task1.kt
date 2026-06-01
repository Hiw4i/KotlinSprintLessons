package org.example.lesson_22

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)

fun main() {

    val regularBook1 = RegularBook("The Witcher", "Andrzej Sapkowski")
    val regularBook2 = RegularBook("The Witcher", "Andrzej Sapkowski")

    val dataBook1 = DataBook("The Witcher", "Andrzej Sapkowski")
    val dataBook2 = DataBook("The Witcher", "Andrzej Sapkowski")

    println(regularBook1 == regularBook2) // false, т.к. сравнивает ссылки на объекты в памяти, а они разные у всех.
    println(dataBook1 == dataBook2) // true, т.к. dataBook созданы специально чтобы сравнивались именно значения,
                                    // а не их ссылки в памяти

}