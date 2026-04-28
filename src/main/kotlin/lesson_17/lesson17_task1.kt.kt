package org.example.lesson_17

class QuizElement(
    question: String,
    answer: String,
) {
    val question: String = question
        get() = field

    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}

fun main() {

    val quizItem = QuizElement(
        question = "What is the capital of France?",
        answer = "Berlin"
    )

    println("Question: ${quizItem.question}")

    println("Answer: ${quizItem.answer}.")

    println("Change the answer...")
    quizItem.answer = "Paris"

    println("Repeat the answer: ${quizItem.answer}.")

}