package org.example.lesson_22

class RegularBookTwo(
    val name: String,
    val author: String,
)

data class DataBookTwo(
    val name: String,
    val author: String,
)

fun main() {

    val regularBook1 = RegularBookTwo("The Witcher", "Andrzej Sapkowski")
    val dataBook1 = DataBookTwo("The Witcher", "Andrzej Sapkowski")

    println(regularBook1) // org.example.lesson_22.RegularBook@5c647e05, т.к.
    // Обычный класс не знает,
    // как красиво перевести себя в текст, поэтому выдает адрес
    // своего расположения в памяти и техническое имя. Чтобы это исправить, нам пришлось бы
    // вручную переопределять метод toString() внутри класса.
    println(dataBook1) // DataBook(name=The Witcher, author=Andrzej Sapkowski), т.к.
    // dataClass специально сделан для этого и автоматически красиво генерирует метод toString()

}