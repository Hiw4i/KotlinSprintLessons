package org.example.lesson_2

fun main() {
    val permanentEmployees = 50
    val permanentSalary = 30000

    val temporaryEmployees = 30
    val temporarySalary = 20000

    val totalEmployees = permanentEmployees + temporaryEmployees


    val permanentExpenses = permanentSalary * permanentEmployees
    val temporaryExpenses = temporarySalary * temporaryEmployees

    val totalExpenses = permanentExpenses + temporaryExpenses


    val averageSalary = totalExpenses / totalEmployees

    println(permanentExpenses)
    println(totalExpenses)
    println(averageSalary)
}
