package kotlin_oop.modifier

class Private(val names: String ) {
    private val name: String = names

    private fun myFunction(){
        println("Hello World $name")
    }

    val getMyFunction get() = myFunction()
}

fun main() {
    val objek = Private("Andre Rizaldi Brillianto")
    objek.getMyFunction

}