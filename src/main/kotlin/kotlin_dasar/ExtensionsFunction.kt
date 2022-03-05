package kotlin_dasar

fun main() {

    var name: String = "Andre Rizaldi Brillianto"
    var result: String = name.master()
    println(result)
}

fun String.master(): String = "Hello $this"
