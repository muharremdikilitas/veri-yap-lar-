import kotlinx.browser.document
import react.create
import react.dom.client.createRoot

fun main() {
    val x
    var editableVar = "Java"
    editableVar = "Kotlin"
    var name : String
    name = "ali"

    val firstname = "Kerem"
    val lastName = "Aktürk"
    val email = "Aktürk"


    //operator overloading

    val fullName = firstname + lastName
    println(fullName)
}