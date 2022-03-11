package kotlin_oop.`this`

class ThisKeyword {
    var firstName:String = ""
    var middleName:String = ""
    var lastName:String = ""

    fun sayHello(firstName:String, middleName:String, lastName:String){
        println("Hello $firstName $middleName $lastName, My Name is ${this.firstName} ${this.middleName} ${this.lastName}")
    }
}