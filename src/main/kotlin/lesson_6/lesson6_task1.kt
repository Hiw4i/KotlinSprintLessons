package org.example.lesson_6

fun main() {
    println("РЕГИСТРАЦИЯ")
    print("Введите логин: ")
    val login = readLine()!!

    print("Введите пароль: ")
    val password = readLine()!!

    println("Вы зарегистрированы\n")

    var check_login: String
    var check_password: String

    do {
        print("Введите логин для входа: ")
        check_login = readLine()!!

        print("Введите пароль для входа: ")
        check_password = readLine()!!

        if (check_login != login || check_password != password) {
            println("Логин или пароль неверны. Попробуйте снова.\n")
        }
    } while (check_login != login || check_password != password)

    println("Вы успешно вошли")
}
