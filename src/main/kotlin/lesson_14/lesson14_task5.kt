package org.example.lesson_14

open class Message(
    val id: Int,
    val author: String,
    val text: String,
)

class ChildMessage(
    id: Int,
    author: String,
    text: String,
    val parentMessageId: Int,
) : Message(id, author, text)

class Chat {
    private val messages = mutableListOf<Message>()
    private var counter = 1

    fun addMessage(
        author: String,
        text: String,
    ) {
        val newMessage = Message(
            id = counter++,
            author = author,
            text = text,
            )

        messages.add(newMessage)
    }

    fun addChildMessage(
        author: String,
        text: String,
        parentId: Int
    ) {
        val newChildMessage = ChildMessage(
            id = counter++,
            author = author,
            text = text,
            parentMessageId = parentId,
        )

        messages.add(newChildMessage)
    }

    fun printChat() {
        // создадим два ящика: parentId (где parent сообщение) и id (где child сообщения)
        val groupedMessages = messages.groupBy { message ->
            if (message is ChildMessage) message.parentMessageId else message.id
        }

        val parentMessages = messages.filter { it !is ChildMessage }

        for (parent in parentMessages) {
            println("${parent.author}: ${parent.text}")

            val children = groupedMessages[parent.id]?.filterIsInstance<ChildMessage>() // Использую filterIsInstance, чтобы достать только детей
            children?.forEach { child ->
                println("\t${child.author}: ${child.text}")
            }
        }

    }
}

fun main() {
    val myChat = Chat()
    
    myChat.addMessage("Alice", "Hi everybody!")
    myChat.addMessage("Maksim", "Kotlin is great?")
    myChat.addChildMessage("Alice", "Yes, it is!", parentId = 2)
    myChat.addChildMessage("Charlie", "I agree with Alice.", parentId = 2)

    myChat.printChat()
}
