package org.example.lesson_21


fun Map<String, Int>.maxCategory(): String? {
    val maxValue = this.maxByOrNull { it.value }
    return maxValue?.key // Возращаю ключ (название скилла) или null.
}

fun main() {
    val oldPlayerSkills = mapOf<String, Int>()
    val newPlayerSkills = mapOf(
        "Sword Fighting" to 150,
        "Archery" to 420,
        "Magic" to 300,
        "Alchemy" to 420
    )


    println(oldPlayerSkills.maxCategory())
    println(newPlayerSkills.maxCategory())

}