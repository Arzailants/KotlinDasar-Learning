package kotlin_dasar

fun main(){
    contoh()

    var value = contoh2()
    println(value)

    var valueInt = returnInt()
    println(valueInt)

    var sum = returnInt2(100, 200)
    println(sum)

    println(divideByZero(100,0))
}

// METHOD TANPA KEMBALIAN / MENGGUNAKAN UNIT
fun contoh():Unit{
    println("Hello World")
}

// METHOD DENGAN KEMBALIAN / MENGGUNAKAN STRING
fun contoh2():String{
    var dataString = "Hello Data"
    return dataString

}

fun returnInt():Int{
    var dataInt = 100
    return dataInt
}

fun returnInt2(param:Int, param2:Int):Int{
     return param + param2
}

// DIVIDE BY ZERO
fun divideByZero(divide1:Int, divide2:Int):Int{
    if (divide2 == 0){
        return 0
    } else {
        var divi = divide1 / divide2
        return divi
    }
}