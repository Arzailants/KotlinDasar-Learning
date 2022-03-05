package kotlin_dasar

fun main() {

    // MEMBUAT FUNCTION, DENGAN HIGH ORDER FUNCTION
    fun hello(name: String, transform: (String) -> String): String{
        val nameTransform = transform(name)
        return "Hello $nameTransform"
    }

    val upper = fun(value: String): String{
        return if (value == ""){
            "ups"
        } else {
            value.uppercase()
        }

    }

    println(hello("Andre", upper))
    println(hello("Arzailants", upper))
    println(hello("", upper))
}