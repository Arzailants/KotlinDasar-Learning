package generic.invariant

class Invariant<T>(val name: T){
    fun sayHello(){
        println("Hello $name")
    }
}

fun main() {
    val objek: Invariant<String> = Invariant("Andre Rizaldi Brillianto")
    // val objek2: Invariant<Any> = objek  // ERROR, KARENA KETIKA INVARIANT, TIDAK BOLEH DIRUBAH
    objek.sayHello()
    // objek2.sayHello()
}
