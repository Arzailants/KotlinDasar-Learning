package kotlin_oop.casts

import java.util.Date

class FirstObjek(){
    fun myFunction(any: Any){
        val value : String? = any as String
        println(value)
    }

}

class NullableCasts {
}

fun main() {
    val firstObjek = FirstObjek()
    firstObjek.myFunction(1)
}