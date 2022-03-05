package kotlin_oop.initializer_block

class InitializerBlock(firstName:String, middleName:String, lastName:String) {
    var firstName:String = firstName
    var middleName:String = middleName
    var lastName:String = lastName

    init {
        println("Initializer Block")
        println("Initializer Block dipanggil ketika membuat objek")
        println("Nama Pemain Pertama : $firstName $middleName $lastName")
    }

}

fun main() {

    val objek1 = InitializerBlock("Andre", "Rizaldi", "Brillianto")
    val objek2 = InitializerBlock("Alice", "Sintesis", "Thirty")
}