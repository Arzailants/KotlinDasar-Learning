package kotlin_dasar

fun main(){
    myMethod("Andre Rizaldi Brillianto", "Banyumas", 858880646940)
}

// MEMBUAT METHOD, DENGAN MEMBERIKAN DEFAULT ARGUMENT / PARAMETER
fun myMethod(name:String, alamat:String, handphone:Long, deskripsi:String = "Aku adalah Keluarga Codelamps"){
    println("Halo $name, alamat = $alamat, nohp = $handphone, $deskripsi")
}