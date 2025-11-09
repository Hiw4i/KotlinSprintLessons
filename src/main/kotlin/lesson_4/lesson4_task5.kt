package org.example.lesson_4

fun main() {

    val minCrew = 55
    val maxCrew = 70
    val goodCrew = 70
    val minSupplies = 50

    print("Есть ли повреждения корпуса (true/false)? ")
    val hasDamage = readln().toBoolean()

    print("Состав экипажа: ")
    val crew = readln().toInt()

    print("Количество ящиков провизии: ")
    val supplies = readln().toInt()

    print("Благоприятная погода (true/false)? ")
    val goodWeather = readln().toBoolean()

    val canSwim = (!hasDamage && crew in minCrew..maxCrew && supplies > minSupplies) || (hasDamage && crew == goodCrew && supplies >= minSupplies && goodWeather)

    println("Корабль может отправится в плавание: $canSwim")

}