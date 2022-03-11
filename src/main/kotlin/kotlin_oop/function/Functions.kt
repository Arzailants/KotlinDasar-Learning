package kotlin_oop.function

import kotlin.properties.Delegates

var ages: Int = 0

class Functions {
    var firstName: String = ""
    var lastName: String = ""

    fun myFullName() {
        ages = 25
        println("Hello $firstName $lastName, your age is $ages")
    }

    fun running(){
        println("C'mon running from ghost")
    }
}


fun main() {

    val objek = Functions()
    objek.firstName = "Andre"
    objek.lastName = "Brillianto"
    objek.myFullName()

    objek.running()
}