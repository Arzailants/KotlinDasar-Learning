package kotlin_oop.inner_class

class OuterClass(val names: String) {

    inner class InnerClass(val name: String){
        fun hi(){
            println("Hello $name, my name is ${this@OuterClass.names}")
        }

    }
}

fun main() {
    // INSTANSIASI OBJEK
    val objek = OuterClass("Andre")

    val innerClass = objek.InnerClass("Alice")
    val innerClass2 = objek.InnerClass("Liana")
    innerClass.hi()
    innerClass2.hi()
}