package kotlin_oop.`interface`

interface ManyInterface {
    val name: String
    fun myFunction(name: String): Unit {

    }
}

interface MoveA {
    fun move() = println("Move A")

}


interface MoveB {
    fun move() = println("Move B")
}

class mainClass(override val name: String) : ManyInterface, MoveA, MoveB {
    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
        println("Moving $name")
    }
}

fun main() {
    // INSTANSIASI OBJEK
    val objek = mainClass("Andre Rizaldi Brillianto")
    objek.move()

}