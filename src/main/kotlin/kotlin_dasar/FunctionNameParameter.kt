package kotlin_dasar

fun main(){

    // KITA BISA MEMANGGIL METHOD DENGAN BISA MEMASUKKAN PARAMETER BEBAS
    myLove(lastName = "Brillianto", middleName = "Rizaldi", firstName = "Andre")

    mySecretLove(fourthData = "Keempat", thirdData = "Ketiga", secondData = "Kedua", firstData = "Pertama")
}

// MEMBUAT METHOD DENGAN TIGA PARAMETER
fun myLove(firstName: String, middleName: String, lastName: String){
    println("Hello $firstName $middleName $lastName")
}


fun mySecretLove(
    firstData:String,
    secondData:String,
    thirdData:String,
    fourthData:String){
    println("Hello First Data = $firstData \n" +
            "Hello Second Data = $secondData \n" +
            "Hello Third Data = $thirdData \n" +
            "Hello Fourth Data = $fourthData"  )
}