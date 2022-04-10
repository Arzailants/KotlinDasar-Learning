package collection.map

class MapCollection {

    val map: Map<Int, String> = mapOf(
        Pair(1, "Andre"),
        2 to "Rizaldi",
        3 to "Brillianto"
    )

}

fun main() {
    val objek = MapCollection()
    val maps = objek.map
    println(maps)

    for (data in objek.map){
        println(data)
    }

    for ((key, value) in objek.map){
        println("$key - $value")
    }
}