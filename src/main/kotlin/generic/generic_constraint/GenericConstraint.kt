package generic.generic_constraint

open class GenericConstraint(val name: String)

class Car(name: String): GenericConstraint(name)

class Plane(name: String): GenericConstraint(name)

class Master<T: GenericConstraint>(val name: VicePresident)

class NumberMaster<T: Number>(val count: T)

fun main() {
//    val toyota = Master(Car("Toyota Fortuner"))
//    val boeing = Master(Plane("Boeing 747"))
//    val mitsubishi = Master(Car("Mitsubishi Pajero"))
//    val sukhoi = Master(Car("Sukhoi"))

//    val nums = NumberMaster(100)
//    val nums2 = NumberMaster(200)
//    val nums3 = NumberMaster(300)
}