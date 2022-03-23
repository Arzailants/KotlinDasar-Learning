package kotlin_oop.`interface`

interface SecondInterface {
    //
    val name: String
    fun sayHello(name: String): Unit{
        println("Hello $name, my name is ${this.name}")
    }
}

interface Goo{
    fun goodJob(){
        println("goodJob!")
    }
}

// MEMBUAT CLASS UNTUK IMPLEMENTASI INTERFACE
class myMains(override var name: String): SecondInterface, Goo{

}