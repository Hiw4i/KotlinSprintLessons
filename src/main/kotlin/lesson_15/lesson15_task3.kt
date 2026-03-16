package org.example.lesson_15

abstract class User(
    val name: String,
) {
    fun readMessage() {
        println("User $name is reading the forum.")
    }

    fun writeMessage(text: String) {
        println("$name posted a message: \"$text\"")
    }
}

class DefaultUser(name: String) : User(name)

class Administrator(name: String) : User(name) {

    fun deleteMessage(messageText: String) {
        println("Admin $name deleted the message: \"$messageText\"")
    }

    fun deleteUser(targetUserName: String) {
        println("Admin $name banned the user: $targetUserName")
    }
}

fun main() {
    val admin = Administrator("Admin_Oleg")
    val toxicUser = DefaultUser("Toxic_Bob")

    val offensiveContent = "Hey losers! You all suck!"
    toxicUser.writeMessage(offensiveContent)

    admin.readMessage()
    admin.writeMessage("Dear ${toxicUser.name}, please follow our community guidelines :)")

    toxicUser.writeMessage("I don't care! Ban me if you can!")

    admin.deleteMessage(offensiveContent)
    admin.deleteUser(toxicUser.name)

}