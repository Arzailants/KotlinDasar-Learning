package kotlin_oop.`interface`

interface Interface {
    // MEMBUAT PROPERTIES TIDAK LANGSUNG DI INISIALISASI
    val name: String
    fun myFunction(name: String): Unit
}

class myMain(override var name: String): Interface{
    override fun myFunction(name: String) {
        println(name)
    }
}

fun main() {
    // INSTANSIASI OBJEK myMain Class
    val myMain = myMain("Andre Rizaldi Brillianto")
    myMain.myFunction(myMain.name)
    myMain.name = "AliceMyLove"
    myMain.myFunction(myMain.name)
}