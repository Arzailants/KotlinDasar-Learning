package kotlin_oop.secondary_constructor

class SecondaryConstructor(firstName:String, middleName:String?, lastName:String) {

    init {
        println("Primary Constructor : Hello $firstName $middleName $lastName")
    }

    constructor(firstName: String, lastName: String):
            this(firstName,null,lastName){
                println("Secondary Constructor Pertama : Hello $firstName $lastName")
            }

    constructor(firstName: String):
            this(firstName,""){
                println("Secondary Constructor Kedua : Hello $firstName")
            }
}

fun main() {
    SecondaryConstructor("Andre", "Rizaldi", "Brillianto")
    println("=====")
    SecondaryConstructor("Andre",null, "Brillianto")
    println("=====")
    SecondaryConstructor("Alice")
}