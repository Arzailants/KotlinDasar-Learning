package kotlin_dasar

fun main() {

    // MEMBUAT LAMBDA 1
    val lambdaName: (String) -> String = {value: String ->
        value.uppercase()
    }

    val lambdaNameShow = lambdaName("Andre Rizaldi Brillianto")
    println(lambdaNameShow)

    // MEMBUAT LAMBDA 2
    val addLambda: (Int, Int) -> Int = {a, b ->
        a + b
    }

    val addLambda1 = addLambda(10, 10)
    println(addLambda1)


    // MEMBUAT LAMBDA 3
    val addingLambda: (String) -> String = {
        it.lowercase()
    }

    val showLambda = addingLambda("Andre Rizaldi Brillianto")
    println(showLambda)


    // MEMBUAT LAMBDA METHOD REFERENCE
    val methodReference: (String) -> String = ::myFunction

    println(methodReference("ALICEMYLOVE"))

}


fun myFunction(param: String): String = param.uppercase()

