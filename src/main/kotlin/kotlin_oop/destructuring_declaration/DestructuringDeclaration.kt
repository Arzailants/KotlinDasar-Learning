package kotlin_oop.destructuring_declaration

data class DestructuringDeclaration(val name: String, val age: Int) {

}

fun main() {
    val destructuringDeclaration = DestructuringDeclaration("Andre", 25)

    var (a, b) = destructuringDeclaration
    println(a)
    println(b)
}