package org.example.lesson_11


private class MemberOfForum(
    val memberId: Int,
    val memberName: String,
)

private class MessageOfForum(
    val memberId: Int,
    val message: String,
)

private class Forum {
    // Database of members and messages
    private val listOfMembers = mutableListOf<MemberOfForum>()
    private val listOfMessages = mutableListOf<MessageOfForum>()
    var lastFreeMemberId = 0

    fun createNewMember(memberName: String): MemberOfForum {
        lastFreeMemberId++

        val newMember = MemberOfForum(memberId = lastFreeMemberId, memberName = memberName)
        listOfMembers.add(newMember)

        return newMember
    }

    fun createNewMessage(memberId: Int, message: String) {
        // Looking for a member in our list by ID
        val foundMember = listOfMembers.find { memberOfForum ->
            memberOfForum.memberId == memberId
        }

        if (foundMember != null) {
            val newMessage = MessageOfForum(memberId = memberId, message = message)
            listOfMessages.add(newMessage)
        } else {
            println("Member with ID $memberId not found!")
        }
    }

    fun printThread() {
        listOfMessages.forEach { messageOfForum ->

            // 1. Find the member who wrote this specific message
            val memberName = listOfMembers.find { memberOfForum ->
                memberOfForum.memberId == messageOfForum.memberId
            // 2. ?.memberName -> if member was found, get their name
            // 3. ?: "Unknown" -> if NOT found (null), use "Unknown" as a default name
            }?.memberName ?: "Unknown"

            println("$memberName: $messageOfForum.message")
        }
    }
}


fun main() {
    val forum = Forum()
    val member1 = forum.createNewMember("member123")
    val member2 = forum.createNewMember("Coffin")

    forum.createNewMessage(memberId = member1.memberId, message = "Hi, I bought some coffins, do you want one?")
    forum.createNewMessage(memberId = member1.memberId, message = "They are very comfortable!")
    forum.createNewMessage(memberId = member2.memberId, message = "Oh, yes, with pleasure!")
    forum.createNewMessage(memberId = member2.memberId, message = "Do you have any in black?")

    forum.printThread()
}