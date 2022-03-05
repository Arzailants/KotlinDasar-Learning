package kotlin_oop.constructor

class WithoutPrimaryConstructor {

    constructor(firstName:String, middleName:String, lastName:String){
        println("First Constructor : Hello $firstName $middleName $lastName")
    }

    constructor(firstName: String, middleName: String){
        println("Second Constructor : Hello $firstName $middleName")
    }

    constructor(firstName: String){
        println("Third Constructor : Hello $firstName")
    }
}

fun main() {

    WithoutPrimaryConstructor("Andre", "Rizaldi", "Brillianto")
    WithoutPrimaryConstructor("Andre", "Rizaldi")
    WithoutPrimaryConstructor("Andre")

}