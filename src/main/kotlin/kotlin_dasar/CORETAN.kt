package kotlin_dasar

fun pertambahan(value: Int, value2: Int): Int{
    var result = value + value2
    return result
}

fun main(){
    println(pertambahan(100, 100))
    println(pertambahan(200, 200))

    var data1 = pertambahan(2000, 2000)
    println(data1)

    var data2 = pertambahan(3000, 3000)
    println(data2)
}