package generic.covariant

import kotlin_dasar.returnInt

class Covariant<out T>(val id: T, val name: T) {
    fun sayFunction(): T {
        return name
    }
}

fun main() {
    val objek: Covariant<String> = Covariant("1", "Andre Rizaldi Brillianto")
    println(objek.sayFunction())

    val objek2: Covariant<Any> = objek
    objek.sayFunction()
}