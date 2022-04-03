package kotlin_oop

class sketchApp {
}

fun main() {
    val triple: (Int) -> Int = { a: Int -> a * 3 }
    println(triple(5))

    val data: (Int) -> Int = {Int -> 10 + Int}
    println(data(100))
}