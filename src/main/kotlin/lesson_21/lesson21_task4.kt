package org.example.lesson_21

import java.io.File

fun File.writeWordToBeginning(word: String): Unit {
    val lowerCaseWord = word.lowercase()

    // exists проверяет создан ли файл физически
    val allText = if (this.exists()) this.readText() else ""
    this.writeText("$lowerCaseWord\n$allText")
}

fun main() {

    val file = File("file.txt")// файла ещё нет на диске

    file.writeText("Banana.")
    file.writeWordToBeginning("I will be the exception.")

    println(file.readText())

}