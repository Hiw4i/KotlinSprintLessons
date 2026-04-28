package org.example.lesson_17

class CloudFolder(
    private val realName: String,
    private val realNumberOfFiles: Int,
    val isSecret: Boolean,
) {
    val name: String
        get() = if (isSecret) {
            "Secret folder. You can't see the name."
        } else {
            realName
        }

    val numberOfFiles: Int
        get() = if (isSecret) {
            0
        } else {
            realNumberOfFiles
        }
}

fun main() {
    val secretFolder = CloudFolder(
        realName = "Me",
        realNumberOfFiles = 41,
        isSecret = true,
    )
    val publicFolder = CloudFolder(
        realName = "Holiday Photos",
        realNumberOfFiles = 15,
        isSecret = false
    )

    println(secretFolder.name)
    println(secretFolder.numberOfFiles)

    println(publicFolder.name)
    println(publicFolder.numberOfFiles)

}