package kotlin_oop.abstract

import kotlin_oop.properties_overriding.Super

abstract class Abstract {
    abstract val name:String
    abstract fun behaviour(name:String)
}

class Kucing: Abstract() {
    override var name: String = ""

    override fun behaviour(name: String) {
        println("$name Nakal banget")
    }
}

class Anjing: Abstract(){
    override val name: String = ""

    override fun behaviour(name: String) {
        println("$name Nakal Banget")
    }

}


fun main() {
    val kucing1 = Kucing()
    kucing1.name = "Bejo"
    println(kucing1.name)
    kucing1.behaviour(kucing1.name)

    val kucing2 = Kucing()
    kucing2.name = "Sican"
    println(kucing2.name)
    kucing2.behaviour(kucing2.name)
}