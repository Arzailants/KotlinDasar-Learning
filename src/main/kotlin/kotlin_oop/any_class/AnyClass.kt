package kotlin_oop.any_class

class Laptop(val nama: String) {

}

class PC(val brand: String){

}

open class AnyClass(val name: String) {
    override fun toString(): String {
        return "AnyClass(name='$name')"
    }
}


fun printObject(any: Any) {
    if (any is Laptop) {
        println("Laptop anda adalah : ${any.nama}")
    } else {
        println(any)
    }
}

// CONVERSI TIPE DATA MENGGUNAKAN WHEN
fun whenObjectConvert(any: Any){
    when(any){
        is Laptop -> println("Laptop anda adalah : ${any.nama}")
        is PC -> println("PC anda adalah : ${any.brand}")
        else -> println(any)
    }
}

fun main() {
    val anyClass = AnyClass("Andre Rizaldi Brillianto")
    val anyClass1 = AnyClass("Alice")

    printObject("Macbook Air M1")
    whenObjectConvert(Laptop("Acer ROG"))
    whenObjectConvert(PC("Lenovo"))
}