package kotlin_oop.function

class FunctionOverloading {

    fun myFunction(firstName:String){
        println("Hello $firstName")
    }

    fun myFunction(firstName: String, middleName:String){
        println("Hello $firstName $middleName")
    }

    fun myFunction(firstName: String, middleName: String, lastName:String){
        println("Hello $firstName $middleName $lastName")
    }
}