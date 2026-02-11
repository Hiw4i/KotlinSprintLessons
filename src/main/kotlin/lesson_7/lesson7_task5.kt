package org.example.lesson_7

fun main() {
    val passwordLength = 6

    println("Какую длину пароля ты хочешь? (но не меньше 6 символов)")

    var userPasswordLength = readln().toInt()

    while (userPasswordLength < passwordLength) {
        println("Тупик. Я сказал не меньше 6 символов.")
        println("Попробуй ещё раз!")
        userPasswordLength = readln().toInt()
    }

    val smallLetter = 'a'..'z'
    val bigLetter = 'A'..'Z'
    val number = '0'..'9'

    val password = mutableListOf<Char>()

    password.add(smallLetter.random())
    password.add(bigLetter.random())
    password.add(number.random())

    for (i in 1..(userPasswordLength - 3)) {
        when ((1..3).random()) {
            1 -> password.add(smallLetter.random())
            2 -> password.add(bigLetter.random())
            3 -> password.add(number.random())
        }
    }

    password.shuffle()

    val generatedPassword = password.joinToString("")

    println("Пароль из $userPasswordLength символов сгенерирован: $generatedPassword")
}

