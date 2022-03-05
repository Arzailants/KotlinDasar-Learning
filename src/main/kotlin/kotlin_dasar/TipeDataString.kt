package kotlin_dasar

fun main(){

    // MEMBUAT TIPE DATA STRING
    var nama: String = "Andre Rizaldi Brillianto";
    var alamat: String = "Kecila RT 3, RW 1 Kemranjen Banyumas Jawa Tengah";
    var deskripsi: String = """
        Saya adalah Andre Rizaldi Brillianto
        dan saya kuliah di Universitas Amikom Purwokerto
        dan saya menyukai programming
    """.trimIndent();

    println(nama)
    println(alamat)
    println(deskripsi)



    var fname: String = "Andre Rizaldi "
    var lname: String = "Brillianto"
    var fulName: String = fname + lname

    println(fulName)


    println("=========================================")

    var firstName: String = "Andre Rizaldi"
    var lastName: String = "Brillianto"
    var fullName: String = "$firstName $lastName"
    var desc: String = "Huruf $fullName terdiri = ${fullName.length}"

    println(desc)
}