fun main(){

    // KITA BISA MEMANGGIL METHOD DENGAN BISA MEMASUKKAN PARAMETER BEBAS
    myLove(lastName = "Brillianto", middleName = "Rizaldi", firstName = "Andre")
}

// MEMBUAT METHOD DENGAN TIGA PARAMETER
fun myLove(firstName: String, middleName: String, lastName: String){
    println("Hello $firstName $middleName $lastName")
}