package kotlin_dasar

fun main(){

    // KONVERSI
    var master: Int = 100

    var nilaiByte: Byte = master.toByte();
    var nilaiShort: Short = master.toShort();
    var nilaiLong: Long = master.toLong();
    var nilaiFloat: Float = master.toFloat();
    var nilaiDouble: Double = master.toDouble();

    // MENAMPILKAN DATA
    println(nilaiByte);
    println(nilaiShort)
    println(nilaiLong)
    println(nilaiFloat)
    println(nilaiDouble)
}