package kotlin_oop.getter_setter

class GetterSetter2(val title: String) {
    val name: String
    get() = title.lowercase()
}

fun main() {
    // INSTANSIASI OBJEK
    val objek = GetterSetter2("TITLE")
    println(objek.name)
}