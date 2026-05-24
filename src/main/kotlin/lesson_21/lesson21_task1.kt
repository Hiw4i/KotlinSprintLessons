package org.example.lesson_21

// возвращает Int (количество гласных)
fun String.vowelCount(): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я')

    return this.lowercase().count { it in vowels }
}

fun main() {

    val hello = "HEllo"
    println(hello.vowelCount())

}