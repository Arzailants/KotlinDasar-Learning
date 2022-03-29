package kotlin_oop.enum_class

enum class EnumClassGender {
    MALE,
    FEMALE
}

class MyMain{
    val man = EnumClassGender.MALE
    val woman = EnumClassGender.FEMALE
    val allGender: Array<EnumClassGender> = EnumClassGender.values()

    val manFromString = EnumClassGender.valueOf("MALE")
    val womanFromString = EnumClassGender.valueOf("FEMALE")

}

fun main() {
    val main = MyMain()
    println(main.man)
    println(main.woman)
    println(main.allGender.toList())
}