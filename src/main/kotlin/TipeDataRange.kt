fun main(){

    // MEMBUAT TIPE DATA RANGE
    // TIPE DATA RANGE ADALAH TIPE DATA JARAK

    val range = 1..1000

    println("== RANGE ==")
    println(range)

    // COUNT() = MENDAPATKAN TOTAL DATA DI RANGE
    println("== TOTAL RANGE ==")
    println(range.count())

    // CONTAINS(VALUE) = MENGECEK APAKAH TERDAPAT VALUE TERSEBUT
    println("== APAKAH MENGANDUNG VALUE INI")
    println(range.contains(999))

    // FIRST = MENDAPATKAN NILAI PERTAMA
    println("== FIRST VALUE ==")
    println(range.first)

    // LAST = MENDAPATKAN NILAI TERAKHIR
    println("== LAST VALUE ==")
    println(range.last)

    // STEP = MENDAPATKAN NILAI TIAP KENAIKAN
    println(range.step)



    println("=======================")

    println("RANGE DOWN")

    // RANGE DOWN DENGAN STEP
    val rangeDown = 1000 downTo 1 step 2

    println(rangeDown)

    println("NILAI AWAL")
    println(rangeDown.first)

    println("NILAI AKHIR")
    println(rangeDown.last)
}


