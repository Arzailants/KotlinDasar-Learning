package kotlin_oop.polimorphism

open class Pholimorphism(val id: String, val name: String) {
    open fun tampil(){
        println("Hello First $id, ${name}")
    }
}

class FirstChild(id: String, name: String) : Pholimorphism(id, name){
    override fun tampil(){
        println("Hello Second $id, ${name}")
    }
}

class SecondChild(id: String, name: String) : Pholimorphism(id, name){
    override fun tampil() {
        println("Hello Third $id, ${name}")
    }
}

fun main() {
    var pholimorphism: Pholimorphism = Pholimorphism("1", "A")
    pholimorphism.tampil()

    pholimorphism = FirstChild("2", "B")
    pholimorphism.tampil()

    pholimorphism = SecondChild("3", "C")
    pholimorphism.tampil()
}