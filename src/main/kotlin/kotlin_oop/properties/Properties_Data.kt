package kotlin_oop.properties

class Properties_Data {

    // MEMBUAT PROPERTIES
    var dataString: String = ""
    var dataInt: Int = 0
    var dataStringNull: String? = null

}


fun main() {

    // MEMBUAT OBJEK
    val objek1 = Properties_Data()
    objek1.dataString = "Objek 1"

    val objek2 = Properties_Data()
    objek2.dataString = "Objek 2"

    val objek3 = Properties_Data()
    objek3.dataString = "Objek 3"

    println(objek1.dataString)
    println(objek2.dataString)
    println(objek3.dataString)
}