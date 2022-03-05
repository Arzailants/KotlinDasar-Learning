package kotlin_dasar

fun myFunctions(nameMatkul: String, vararg values: Int): Int{

    var total = 0
    for (data in values){
        total += data
    }
    return total
}


fun main(){
    val myFunctions = myFunctions("Matematika", 90, 90, 90, 90)
    println(myFunctions)

}

