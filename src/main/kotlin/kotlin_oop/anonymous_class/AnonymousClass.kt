package kotlin_oop.anonymous_class

import javax.swing.Action

interface AnonymousClass {
    fun action(): Unit
}

fun fireAction(action: AnonymousClass){
    action.action()
}

class Implemented: AnonymousClass{
    override fun action() {
        println("This is without Anonymous Class")
    }
}


fun main() {

    // WITHOUT ANONYMOUS CLASS
    fireAction(Implemented())

    // ANONYMOUS CLASS = CLASS TANPA NAMA
    fireAction(object : AnonymousClass{
        override fun action() {
            println("first Anonymous Class")
        }
    })

    fireAction(object : AnonymousClass{
        override fun action() {
            println("second Anonymous Class")
        }
    })

    fireAction(object : AnonymousClass{
        override fun action() {
            println("third Anonymous Class")
        }
    })
}