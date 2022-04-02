package kotlin_oop


fun main() {

    val data = listOf("Z", "A", "A", "D", "E", "H", "I", "J", "J")
    println("list = ${data}")
    println("list sorted = ${data.sorted()}")

    // MERUBAH ARRAY MENJADI SET
    val dataSet = data.toSet()
    println("set = ${dataSet}")

    var dataSet2 = setOf<String>("A", "C", "D", "B", "E", "E")
    val dataSetMutable = mutableSetOf<String>("A", "B", "C", "D", "E", "F")

    // MENGECEK CONTAINS
    println("apakah mengandung huruf C di collection = ${dataSetMutable.contains("C")}")
    println("apakah mengandung huruf C di collection = ${dataSetMutable.contains("c")}")
    println("apakah mengandung huruf C di collection = ${dataSetMutable.contains("Z")}")

    // MAP
    val dataMap = mutableMapOf<Int, String>(
        1 to "One",
        2 to "Two",
        3 to "Three",
        4 to "Four",
        5 to "Five",
        6 to "Six",
        7 to "Seven"
    )

    println("Data Map = ${dataMap}")

}