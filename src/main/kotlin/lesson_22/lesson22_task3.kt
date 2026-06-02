package org.example.lesson_22

data class Skill(
    val name: String,
    val description: String,
    val lvl: Int,
)

fun main() {

    val socialAnxiety = Skill("Anxiety", "Social Anxiety", 42)
    val (skillName, skillDescription, skillLvl) = socialAnxiety

    println("Skill name: $skillName")
    println("Skill description: $skillDescription")
    println("Skill lvl: $skillLvl")

}