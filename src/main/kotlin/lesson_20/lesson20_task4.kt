package org.example.lesson_20



fun main() {
    val listOfElements = listOf<String>(
        "Button1", "Button2", "Button3",
        "Button4", "Button5", "Button6"
    )

    // Это просто переменная с типом "List", которая хранит список функций,
    // ничего не принимающие и не возвращающие.
    val lambdaList: List<() -> Unit> = listOfElements.map { element -> {
        // Внешние скобки — это map.
        // А внутренние скобки создают и возвращают саму лямбду, типа упаковывают в скобочки.
        println("Element clicked '$element'")
    }}

    lambdaList.forEachIndexed { index, lambdaElement ->
        if (index % 2 != 0) {
            lambdaElement()
        }
    }
}