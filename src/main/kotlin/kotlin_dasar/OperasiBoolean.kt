package kotlin_dasar

fun main(){

    // MEMBUAT OPERASI BOOLEAN
    // &&
    // |
    // !=

    // && = DAN
    val nilaiMatematika = 80
    val nilaiFisika = 69

    val lulusMatematika = nilaiMatematika > 75
    val lulusFisika = nilaiFisika > 75

    val lulusDAN = lulusMatematika && lulusFisika
    println(lulusDAN)

    // | = ATAU
    val lulusATAU = lulusMatematika || lulusFisika
    println(lulusATAU)
}