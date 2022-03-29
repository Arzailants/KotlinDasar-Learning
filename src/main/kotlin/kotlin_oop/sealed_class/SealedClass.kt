package kotlin_oop.sealed_class

sealed class SealedClass(val name: String)

// MEMBUAT KELAS TURUNAN DARI CLASS SEALED
class Plus : SealedClass("Plus")
class Minus : SealedClass("Minus")
class Modulo : SealedClass("Modulo")
class Divide : SealedClass("Divide")


// MEMBUAT FUNCTION
fun operation(value1: Int, value2: Int, operations:SealedClass): Int{
    return when(operations){
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
        is Divide -> value1 / value2
    }
}

fun main() {
    println(operation(10, 10, Plus()))
    println(operation(30, 20, Minus()))
    println(operation(10, 3, Modulo()))
    println(operation(30, 10, Divide()))
}