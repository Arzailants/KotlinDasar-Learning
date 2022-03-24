package kotlin_oop.extensions

class ExtensionFunction(val name: String, val age: Int){

    // MEMBUAT METHOD
    fun myFunction(data:String){
        println("Selamat datang di aplikasi $data")
    }
}
    // MEMBUAT EXTENSION FUNCTION
    fun ExtensionFunction.sayHelloFunction(name: String){
        println("Hello $name, my name is ${this.name}, and my age is ${this.age}")
    }


fun main() {
    // INSTANSIASI OBJEK
    val objek = ExtensionFunction("Andre Rizaldi Brillianto", 22)
    objek.sayHelloFunction("Alice")
    objek.myFunction("Kontol")
}