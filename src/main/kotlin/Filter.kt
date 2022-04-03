class Filter {

}

fun main() {
    val dataList = listOf<String>("Andre", "Lia", "Codelamps", "BlackSpring", "BlackWinter", "Brother", "Bandots", "BigMom")
    val filterWord = dataList.filter { it.startsWith("b", ignoreCase = true) }
        .take(3)
        .sorted()
    println(filterWord)
}