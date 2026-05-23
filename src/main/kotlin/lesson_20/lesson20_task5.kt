package org.example.lesson_20

class Robot {

    val phrases: MutableList<String> = mutableListOf(
        "Greetings, Earthling.",
        "My batteries are charged to 100 percent.",
        "I am ready to obey your commands.",
        "A critical system update has been detected.",
        "May the binary code be with you.",
    )
    // Переменная, которая хранит в себе текущий модификатор речи.
    // По умолчанию она просто возвращает строку обратно без изменений { it }
    var speechModifier: (String) -> String = { it }

    // Функция принимает на вход функцию (модификатор) и сохраняет её в переменную sheechModifier
    //      ": (String) -> String" — это тип этой переменной (т.е. setModifier принимает функцию)
    fun setModifier(modifier: (String) -> String) {
        speechModifier = modifier
    }

    fun say() {
        val randomPhrase = phrases.random()

        // Применяем модификатор, если он есть конечно, иначе просто то же самое возращаем
        val modifiedRandomPhrase = speechModifier(randomPhrase)

        println(modifiedRandomPhrase)
    }
}

fun main() {
    val robot = Robot()
    robot.say()
    robot.setModifier { originalText ->
        originalText
            .split(" ")   // Разбиваем строку на список слов по пробелам
            .reversed()
            .joinToString(" ")
    }
    robot.say()
}