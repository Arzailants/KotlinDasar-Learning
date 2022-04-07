package generic.type_projection

class TypeProjection<T>(var name: T)

// MEMBUAT METHOD UNTUK COPY
fun copyObject(from: TypeProjection<out Any>, to: TypeProjection<Any>){
    to.name = from.name
}

fun main() {
    val objek = TypeProjection("Andre")
    val objek2: TypeProjection<Any> = TypeProjection("Alice")

    // MENJALANKAN FUNCTION COPY OBJECT
    copyObject(objek, objek2)

    println(objek)
    println(objek2)
}