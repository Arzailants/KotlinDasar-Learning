package generic.generic_function

import generic.generic_class.GenericClass

class GenericFunction(val name: String) {
    fun<T> sayHello(name: T){
        println("Hello $name, my name is ${this.name}")
    }
}

fun main() {
    val objek: GenericFunction = GenericFunction("Andre Rizaldi Brillianto")
    objek.sayHello<Int>(100)

}