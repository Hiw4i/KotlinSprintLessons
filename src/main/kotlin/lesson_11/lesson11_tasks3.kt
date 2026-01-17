package org.example.lesson_11


private class Room (
    val coverImage: String,
    val title: String,
    val listOfUsers: MutableList<User>,
) {
    fun addUser(user: User) {
       listOfUsers.add(user)
    }

    fun updateStatus(userName: String, newStatus: String) {
        for (user in listOfUsers) {
            if (user.name == userName) {
                user.status = newStatus
            }
        }
    }

    fun printRoomInfo() {
        println("Cover: $coverImage")
        println("Title: $title")
        println()

        for (user in listOfUsers) {
            println("Avatar: ${user.avatar}")
            println("Name: ${user.name}")
            println("Status: ${user.status}")
            println()
        }
    }
}

private class User (
    val avatar: String,
    val name: String,
    var status: String,
)

fun main() {
    val user1 = User(
        avatar = "avatar1.png",
        name = "Qu",
        status = "muted",
    )
    val user2 = User(
        avatar = "avatar1.png",
        name = "Maksim",
        status = "speaking",
    )
    val user3 = User(
        avatar = "avatar1.png",
        name = "God",
        status = "mic off",
    )

    val room = Room(
        coverImage = "cover_image.png",
        title = "Search for friends",
        listOfUsers = mutableListOf(user1, user2)
    )

    room.printRoomInfo()

    room.addUser(user3)
    room.updateStatus("Qu", "mic off")

    println()
    println()

    room.printRoomInfo()
}