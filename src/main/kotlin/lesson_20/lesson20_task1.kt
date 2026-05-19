package org.example.lesson_20

fun main() {
                // получаем sting и возращааем тоже
    val congratulation: (String) -> String = { username: String ->
        "Happy New Year, $username!"
    }
    // Или кратко    val congratulation: (String) -> String = { "Happy New Year, $it!" }

    println(congratulation("Liam"))

}