


fun main() {
    val maps: MutableMap<String, Int> = mutableMapOf()
    maps["A"] = 1
    maps.put("B", 2)
    maps.put("C", 3)


    for (data in maps){
        println(data)
    }

    for ((key, value) in maps){
        println("$key == $value")
    }

    println(maps.get("A"))
    println(maps["b".uppercase()])
    println(maps.getOrDefault("z", 0))
    println(maps.get("d"))
}