package kotlin_dasar

infix fun String.too(type: String): String{
    if (type == "UP"){
        return this.uppercase()
    } else {
        return this.lowercase()
    }
}

fun main() {
    val nama = "Andre Rizaldi Brillianto" too "UP"
    println(nama)
}