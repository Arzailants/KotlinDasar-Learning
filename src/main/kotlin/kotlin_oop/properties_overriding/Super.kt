package kotlin_oop.properties_overriding

open class Super {
    open val data: Int = 100
}

class FirstData: Super(){
    override val data: Int
        get() = super.data
}

class SecondData: Super(){
    override val data: Int = 33
}


fun main() {
    val superData = Super()
    val firstData = FirstData()
    val secondData = SecondData()


    println(superData.data)
    println(firstData.data) // ini memanggil super
    println(secondData.data) // override, dengan merubah valuenya
}