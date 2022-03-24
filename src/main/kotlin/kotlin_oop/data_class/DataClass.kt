package kotlin_oop.data_class

// UNTUK MEJADIKAN KELAS MENJADI KELAS DATA, MAKA KITA TAMBAHKAN data DI DEPAN NAMA KELAS
data class DataClass(val name: String, val age: Int, val email: String)

fun main() {
    val objek = DataClass("Andre Rizaldi Brillianto", 26, "andrerizaldib@gmail.com")
    // KETIKA KITA MEMANGGIL OBJEK, OTOMATIS MEMANGGIL toString
    println(objek)

    // DI DATA CLASS, TERDAPAT FUNCTION YANG OTOMATIS DITAMBAHKAN DIANTARANYA = toString, equal, hashcode, copy
    // CONTOH PENGGUNAAN COPY
    val objek2 = objek.copy(name = "Alice", age = 22)
    println(objek2)
}