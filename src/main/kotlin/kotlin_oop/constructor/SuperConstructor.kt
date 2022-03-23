package kotlin_oop.constructor

import kotlin_oop.properties_overriding.Super

open class SuperConstructor(val firstName:String, val middleName:String, val lastName:String) {

    // MEMBUAT CONSTRUCTOR
    constructor(firstName: String, middleName: String):this(firstName, middleName, "")
    constructor(firstName: String):this(firstName,"Z")
}

class SuperChild : SuperConstructor{
    constructor() : super("Andre")
    constructor(lastName: String): super("Andre", "Rizaldi",  "")
}

fun main() {
    // MEMBUAT OBJEK DARI CLASS SUPERCHILD
    val superChild = SuperChild()
    println(superChild.firstName)

    val objek = SuperChild("Brilliants")
}