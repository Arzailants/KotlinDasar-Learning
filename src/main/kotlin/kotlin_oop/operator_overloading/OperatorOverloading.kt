package kotlin_oop.operator_overloading

import kotlin.math.min

data class OperatorOverloading(val total: Int) {

    // OVERLOADING OPERATOR FUNCTION PLUS
    operator fun plus(operatorOverloading: OperatorOverloading): OperatorOverloading{
        return OperatorOverloading(this.total + operatorOverloading.total)
    }

    // OVERLOADING OPERATOR FUNCTION MINUS
    operator fun minus(operatorOverloading: OperatorOverloading): OperatorOverloading{
        return OperatorOverloading(this.total - operatorOverloading.total)
    }

}

fun main() {
    val plus = OperatorOverloading(100) + OperatorOverloading(200)
    println(plus)

    val minus = OperatorOverloading(1500) - OperatorOverloading(1250)
    println(minus)

}