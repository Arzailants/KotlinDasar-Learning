package kotlin_oop.getter_setter

class GetterSetter(name: String) {
    var title: String = name
    // MEMBUAT GETTER
    get() = field
    // MEMBUAT SETTER
    set(value) {
        if (value.isNotBlank()){
            field = value
        }
    }
}


fun main() {
    val objek1 = GetterSetter("Andre Rizaldi Brillianto")
    println(objek1.title)

    // SET NAMA VARIABLE
    objek1.title = "BlackSpring"
    println(objek1.title)

    // GET NAMA VARIABLE
    val title = objek1.title
    println(title)
}