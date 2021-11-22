fun main(){

    // MEMANGGIL FUNCTION myFunction
    myFunction("Andre Rizaldi","Brillianto")

    // MEMANGGIL FUNCTION myMethod
    myMethod("Andre Rizaldi", null)
}

// MEMBUAT FUNCTION DENGAN PARAMETER
fun myFunction(fname:String, lname:String){
    println("Hello $fname $lname")
}


// MEMBUAT FUNCTION DENGAN PARAMETER YANG BISA NULL
fun myMethod(firstName:String, lastName:String?){
    if (lastName == null){
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}