package generic.star_projection

class StarProjection {
    fun displayLength(array: Array<*>){
        println("array length : ${array.size}")
    }
}

fun main() {
    // MEMBUAT ARRAY
    val listArray1 = listOf(1,2,3,4,5,6,7)
    val listArray2 = arrayListOf(1,2,3,4,5,6,7)
    val listArray3 = arrayOf(1,2,3,4,5,6,7)

    val listArray4 = listOf("A","B","C")
    val listArray5 = arrayListOf("A","B","C")
    val listArray6 = arrayOf("A","B","C")

    val objek = StarProjection()
//    objek.displayLength(listArray1)
//    objek.displayLength(listArray2)
    objek.displayLength(listArray3)
//    objek.displayLength(listArray4)
//    objek.displayLength(listArray5)
    objek.displayLength(listArray6)
}