package kotlin_dasar

fun main(){

    // BREAK & CONTINUE
    // BREAK & CONTINUE ADALAH KATA KUNCI YANG BISA DIGUNAKAN DALAM SEMUA PERULANGAN DI KOTLIN
    // BREAK DIGUNAKAN UNTUK MENGHENTIKAN SELURUH PERULANGAN
    // CONTINUE DIGUNAKAN UNTUK MENGHENTIKAN PERULANGAN YANG BERJALAN, DAN LANGSUNG MELANJUTKAN KE PERULANGAN KE PERULANGAN SELANJUTNYA

    println("BREAK")
    // BREAK
    var data = 0
    while (true){
        println("Perulangan ke $data")
        data++
        if (data == 30){
            break
        }
    }

    println("=======================================")

    println("CONTINUE, PERULANGAN")
    // CONTINUE
    for (i in 1..50){
        if (i > 25){
            continue
        }
        println("Perulangan ke $i")
    }


    println("CONTINUE, BILANGAN GANJIL")
    // CONTINUE 2
    for (i in 0..30){
        if (i % 2 == 0){
            continue
        }
        println("Bilangan Ganjil = $i")
    }
}