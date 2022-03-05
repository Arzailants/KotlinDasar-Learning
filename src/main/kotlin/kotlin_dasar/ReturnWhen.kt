package kotlin_dasar

fun main() {

    fun sayHello(name: String = ""): String{
        return when(name){
            "" -> "Hello Bro"
            else -> "Hello $name"
        }
    }

    val sayHello = sayHello("Andre RB")
    println(sayHello)
}