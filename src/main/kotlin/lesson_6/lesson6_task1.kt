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

    println("Вы успешно вошли")
}
