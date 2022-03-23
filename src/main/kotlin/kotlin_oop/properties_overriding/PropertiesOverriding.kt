package kotlin_oop.properties_overriding

open class PropertiesOverriding {
    open val myProperties = 100
}

class FirstChild : PropertiesOverriding(){
    override val myProperties: Int = 10
}

class SecondChild : PropertiesOverriding(){
    override val myProperties: Int = 20
}


fun main() {
    val objekFirst = PropertiesOverriding()
    val f = FirstChild()
    val s = SecondChild()

    println(objekFirst.myProperties)
    println(f.myProperties)
    println(s.myProperties)

}