package generic.type_erasur

class TypeErasur<T>(name: T) {
    // MEMBUAT PROPERTIES
    private val name: T = name
    // MEMBUAT FUNCTION
    fun getName(): T = name
}

// TYPE ERASUR
fun main() {
    val objek = TypeErasur("Andre")
    val getData = objek.getName()

    val newObjek = objek as TypeErasur<Int>

}