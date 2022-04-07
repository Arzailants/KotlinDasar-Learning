package generic.generic_constraint

interface CanSayHello{
    fun sayHello(name: String){
        println("Hello $name")
    }
}

open class Employee

class Manager: Employee()

class VicePresident: Employee(), CanSayHello{
    override fun sayHello(name: String) {
        super.sayHello(name)
    }


}

class Masters<T>(val names: T) where T: Employee, T: CanSayHello{
    fun data(jumlah: Int){
        println("Jumlah : $jumlah")
    }
}


fun main() {
    val dats = Masters(VicePresident())
    println(dats.names)

}