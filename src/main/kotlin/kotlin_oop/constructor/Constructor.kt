package kotlin_oop.constructor

class Constructor(fname:String, mname:String, lname:String) {

    var firstName:String = fname
    var middleName:String = mname
    var lastName:String = lname


}

fun main() {

    val objek1 = Constructor("Andre", "Rizaldi", "Brillianto")
    val objek2 = Constructor("Alice", "Shintesis", "Thirty")

    println(objek1.firstName)
    println(objek1.middleName)
    println(objek1.lastName)

    println(objek2.firstName)
    println(objek2.middleName)
    println(objek2.lastName)

}