fun main(){

    var tampil1 = myMultipleMethod(10,10)
    println(tampil1)

    var tampil2 = myStringMethod("Andre")
    println(tampil2)
}


// INI ADALAH SINGLE EXPRESSION INT, TANPA TANDA KURUNG
fun myMultipleMethod(a:Int, b:Int):Int = a * b

// INI ADALAH SINGLE EXPRESSION STRING, TANPA TANDA KURUNG
fun myStringMethod(data:String):String = "Hello $data"