package kotlin_oop.function

open class FunctionOverriding(val name:String) {
    open fun firstFunction(name:String){
        println("Hello $name, your Boss is ${this.name}")
    }
}

class FirstChild(name: String):FunctionOverriding(name){
    override fun firstFunction(name: String) {
        println("Hello $name, your Boss is ${this.name}")
    }
}

class SecondChild(name: String):FunctionOverriding(name){
    override fun firstFunction(name: String) {
        println("Hello $name, your Boss is ${this.name}")
    }
}


fun main() {
    // MEMBUAT OBJEK
    val objek1 = FirstChild("Andre")
    objek1.firstFunction("Karyawan1")

    val objek2 = SecondChild("Andre")
    objek2.firstFunction("Karyawan2")
}