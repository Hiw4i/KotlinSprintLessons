package org.example.lesson_17

class Package(
    val number: Int,
    cutterLocation: String,
) {
    var moveCount: Int = 0
        private set  // Типа чтобы можно было посмотреть эту переменную, но изменять снаружи нельзя

    var location = cutterLocation
        set(value) {
            field = value
            moveCount++
        }
}

fun main() {
    val myPackage = Package(444, "Paris")
    println(myPackage.moveCount)
    myPackage.location = "Moscow"
    println(myPackage.moveCount)

}