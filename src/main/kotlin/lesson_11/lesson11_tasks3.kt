package org.example.lesson_11


class Room(
    val coverImage: String,
    val title: String,
    val participants: MutableList<User> = mutableListOf(),
) {
    fun addUser(user: User) {
        participants.add(user)
    }

    fun updateStatus(userName: String, newStatus: String) {
        participants.find { user ->
            user.nickName == userName
        }?.status = newStatus
    }

    fun printRoomInfo() {
        println("Cover: $coverImage")
        println("Title: $title")
        println()

        for (user in participants) {
            println("Avatar: ${user.avatar}")
            println("Name: ${user.nickName}")
            println("Status: ${user.status}")
            println()
        }
    }
}

class User(
    val avatar: String,
    val nickName: String,
    var status: String,
)

fun main() {
    val user1 = User(
        avatar = "avatar1.png",
        nickName = "Qu",
        status = "muted",
    )
    val user2 = User(
        avatar = "avatar1.png",
        nickName = "Maksim",
        status = "speaking",
    )
    val user3 = User(
        avatar = "avatar1.png",
        nickName = "God",
        status = "mic off",
    )

    val room = Room(
        coverImage = "cover_image.png",
        title = "Search for friends",
    )

    room.addUser(user1)
    room.addUser(user2)

    room.printRoomInfo()

    room.addUser(user3)
    room.updateStatus("Qu", "mic off")

    println()
    println()

    room.printRoomInfo()
}