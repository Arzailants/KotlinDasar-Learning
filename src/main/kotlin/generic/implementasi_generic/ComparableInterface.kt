package generic.implementasi_generic

class ComparableInterface(val name: String, val quantity: Int): Comparable<ComparableInterface> {
    override fun compareTo(other: ComparableInterface): Int {
        return quantity.compareTo(other.quantity)
    }
}

fun main() {
    val compare1 = ComparableInterface("Andre", 100)
    val compare2 = ComparableInterface("Alice", 99)

    println(compare1 > compare2)
    println(compare2 > compare1)
}