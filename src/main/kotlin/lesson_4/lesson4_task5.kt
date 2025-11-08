package org.example.lesson_4



fun main() {
    print("Есть ли повреждения корпуса (true/false)? ")
    val hasDamage = readln().toBoolean()

    print("Состав экипажа: ")
    val crew = readln().toInt()

    print("Количество ящиков провизии: ")
    val supplies = readln().toInt()

    print("Благоприятная погода (true/false)? ")
    val goodWeather = readln().toBoolean()

    val canSwim = (!hasDamage && crew in 55..70 && supplies > 50) || (hasDamage && crew == 70 && supplies >= 50 && goodWeather)

    println("Корабль может отправится в плавание: $canSwim")

}