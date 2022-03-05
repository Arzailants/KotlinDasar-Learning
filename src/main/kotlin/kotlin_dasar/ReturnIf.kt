package kotlin_dasar

fun main() {

    fun sayHello(name: String = ""): String{
        return if (name == ""){
            "Hello Bro"
        } else {
            "Hello $name"
        }
    }

    val sayHello = sayHello("Andre")
    println(sayHello)
}