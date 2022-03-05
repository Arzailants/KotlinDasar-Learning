package kotlin_dasar

fun main(){

    // PERULANGAN FOR
    val arrayValue = arrayOf("Andre Rizaldi Brillianto", "AliceMyLove", "RevethVeins", "BlackSpring", "BlackWinter")

    // FOR ARRAY
    var total = 0
    for (arrayLooping in arrayValue){
        println(arrayLooping)
        total++
    }
    println("Jumlah Perulangan = $total")



    // FOR RANGE UP
    var ranges = 1..20
    for (i in ranges){
        println(i)
    }

    // FOR RANGE UP WITH STEP
    for(j in 1..10 step 2){
        println(j)
    }

    // FOR RANGE DOWN
    for (k in 10 downTo 1){
        println(k)
    }

    // FOR RANGE DOWN WITH STEP
    for(l in 10 downTo 1 step 2){
        println(l)
    }

    // FOR
    val ukuranarray = arrayValue.size - 1
    for(o in 0..ukuranarray){
        println("Index ke $o = ${arrayValue.get(o)}")
    }
}