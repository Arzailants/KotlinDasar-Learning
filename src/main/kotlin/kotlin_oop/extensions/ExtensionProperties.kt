package kotlin_oop.extensions

class ExtensionProperties(val name: String, val age: Int, val email: String){

}
//EXTENSIBLE PROPERTIES
val ExtensionProperties.nameToUppercase: String
get() = this.name.uppercase()

fun main() {
    // INSTANSIASI OBJEK
    var objek = ExtensionProperties("Andre", 26, "andrerizaldib@gmail.com")
    println(objek.nameToUppercase)

}