package kotlin_dasar

fun main(){

    // MEMBUAT ARRAY, DENGAN KOTLIN GENERIC
    val arrayString: Array<String> = arrayOf("Andre", "Rizaldi", "Brillianto")
    val arrayInteger: Array<Int> = arrayOf(1,2,3,4,5,6,7,8)
    val arrayChar: Array<Char> = arrayOf('A','B','C','D','E')

    val arrayString2: Array<String> = arrayOf("Alice","Reveth")
    val arrayInteger2: Array<Int> = arrayOf(10,20,30,40,50)
    val arrayChar2: Array<Char> = arrayOf('Z','X','Y')

    // MEMANGGIL ARRAY SATUAN
    println(arrayString.get(0))
    println(arrayString[0])

    // MENAMPILKAN ISI DATA ARRAY
    println(arrayString.size)

    // MENGUBAH DATA DI ARRAY DENGAN SET
    arrayString.set(0,"ARZAILANTS")
    println(arrayString[0])

    // MENGUBAH DATA DI ARRAY DENGAN BIASA
    arrayString[0] = "Arzailants"
    println(arrayString.get(0))

}