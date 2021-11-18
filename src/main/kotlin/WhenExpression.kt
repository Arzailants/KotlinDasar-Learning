fun main(){

    // MEMBUAT WHEN EXPRESSION / SWITCH EXPRESSION DI BAHASA PEMROGRAMAN JAVA
    var nilaiUjian = 'D'

    when(nilaiUjian){
        'A' -> println("Selamat Anda Mendapatkan Nilai = " +nilaiUjian)
        'B' -> println("Selamat Anda Mendapatkan Nilai = " +nilaiUjian)
        'C' -> println("Selamat Anda Mendapatkan Nilai = " +nilaiUjian)
        'D' -> println("Selamat Anda Mendapatkan Nilai = " +nilaiUjian)
        'E' -> println("Selamat Anda Mendapatkan Nilai = " +nilaiUjian)
        else -> println("Maaf Anda Harus Mengulang")
    }


    // WHEN EXPRESSION MULTIPLE OPINION
    when (nilaiUjian){
        'A', 'B', 'C' -> {
            println("Selamat Nilai Anda Sempurna")
        }
        else -> {
            println("Maaf Anda Gagal")
        }
    }



    // WHEN EXPRESSION IN
    val nilaiLulus: Array<Char> = arrayOf('A','B','C')
    when(nilaiUjian){
        in nilaiLulus -> println("Selamat Anda Lulus Sempurna")
        !in nilaiLulus -> println("Maaf Anda Goblok")
    }



    // WHEN EXPRESSION IS
    val data = 'A'
    when(data){
        is Char -> println("Ini adalah Tipe Data Char")
        !is Char -> println("Ini Bukan Tipe Data Char")
    }



    // WHEN TANDA VARIABLE
    val dataWhen = 'A'
    when {
        dataWhen == 'A' -> println("Selamat anda Mendapatkan Nilai A")
        dataWhen == 'B' -> println("Selamat anda Mendapatkan Nilai B")
        dataWhen == 'C' -> println("Selamat anda Mendapatkan Nilai C")
        else -> println("Maaf Salah")
    }
}