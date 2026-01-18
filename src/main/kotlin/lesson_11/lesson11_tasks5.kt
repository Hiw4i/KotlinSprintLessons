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
    val listOfMembers = mutableListOf<MemberOfForum>()
    val listOfMessages = mutableListOf<MessageOfForum>()
    var lastFreeMemberId = 0

    fun createNewMember(memberName: String): MemberOfForum {
        lastFreeMemberId++

        val newMember = MemberOfForum(memberId = lastFreeMemberId, memberName = memberName)

        listOfMembers.add(newMember)
        return newMember
    }

    fun createNewMessage(memberId: Int, message: String) {
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

            val memberName = listOfMembers.find { memberOfForum ->
                memberOfForum.memberId == messageOfForum.memberId
            }?.memberName
            val message = messageOfForum.message

            println("$memberName: $message")
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