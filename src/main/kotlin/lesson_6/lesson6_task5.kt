package org.example.lesson_6

fun main() {
    println("РЕГИСТРАЦИЯ")
    print("Введите логин: ")
    val login = readln()

    print("Введите пароль: ")
    val password = readln()

    println("Вы зарегистрированы\n")

    var checkLogin: String
    var checkPassword: String
    var isCorrect: Boolean

    do {
        print("Введите логин для входа: ")
        checkLogin = readln()

        print("Введите пароль для входа: ")
        checkPassword = readln()

        isCorrect = checkLogin == login && checkPassword == password
        if (!isCorrect) {
            println("Логин или пароль неверны. Попробуйте снова.\n")
        }
    } while (!isCorrect)

    println("Пройдите тест на бота.")
    var trying = 3
    var passed = false

    while (trying > 0) {
        val number1 = (1..9).random()
        val number2 = (1..9).random()
        val correctAnswer = number1 + number2

        print("Сколько будет $number1 + $number2? ")
        val userAnswer = readln().toInt()

        if (userAnswer == correctAnswer) {
            println("Добро пожаловать!")
            passed = true
            break
        } else {
            trying--
            println("Неверно. Осталось попыток: $trying")
        }
    }

    if (!passed) {
        println("Доступ запрещён")
    }
}
