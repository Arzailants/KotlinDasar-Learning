package generic.generic_class

class GenericClass<T>(val id: T, val name: T) {
    fun sayHello(){
        println("Hello $id, $name")
    }
}

fun main() {
    val objek: GenericClass<String> = GenericClass("1", "Andre Rizaldi Brillianto")
    objek.sayHello()

    val objek2 : GenericClass<Int> = GenericClass(1, 144244)
    objek2.sayHello()
}