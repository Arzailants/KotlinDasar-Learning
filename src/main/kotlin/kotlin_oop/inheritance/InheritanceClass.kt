package kotlin_oop.inheritance

open class InheritanceClass(val name:String) {
    // MEMBUAT FUNCTION
    open fun sayHello(name:String){
        println("Hello $name, your Manager is ${this.name}")
    }
}

// MEMBUAT CLASS FIRSTCHILD, TURUNAN / EXTEND DARI INHERITANCECLASS
class FirstChild(name: String) : InheritanceClass(name){
    override fun sayHello(name: String) {
        println("Hello $name, you are FirstChild ${this.name}")
    }
}

// MEMBUAT CLASS SECONDCHILD, TURUNAN / EXTEND DARI INHERITANCECLASS
class SecondChild(name: String):InheritanceClass(name){
    override fun sayHello(name: String) {
        println("Hello $name, you are SecondChild ${this.name}")
    }
}

// MAIN METHOD
fun main() {

    // MEMBUAT OBJEK
    val firstObjek = FirstChild("Andre")
    firstObjek.sayHello("Karyawan 1")

    var secondObjek = SecondChild("Andre")
    secondObjek.sayHello("Karyawan 2")
}
