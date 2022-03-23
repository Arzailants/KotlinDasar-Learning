package kotlin_oop.late_initialized

class Lateinit {
    // MEMBUAT PROPERTIES LATEINIT
    lateinit var brand: String

    // MEMBUAT FUNCTION
    fun firstCar(brand: String){
        this.brand = brand
        println(brand)
    }

    // MEMBUAT FUNCTION
    fun secondCar(brand: String){
        this.brand = brand
        println(brand)
    }
}

// MAIN
fun main() {
    // INSTANSIASI OBJEK / INSTANCE OBJECT
    val objek = Lateinit()

    objek.firstCar("Toyota")
    println(objek.brand)
    objek.secondCar("Suzuki")
    println(objek.brand)
}