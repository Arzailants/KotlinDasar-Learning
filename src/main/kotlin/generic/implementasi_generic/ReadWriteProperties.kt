package generic.implementasi_generic

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class ReadWriteProperties(var data: String): ReadWriteProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        print("get value, from properties ${property.name} ")
        return data
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        print("set value, from properties ${property.name} from $data to $value ")
        data = value
    }
}

// MEMBUAT KELAS, DAN MEMBUAT PROPERTIES UNTUK MENDELEGATE KELAS READWRITEPROPERTY
class ReadWriteLog(param: String){
    var names: String by ReadWriteProperties(param)
}

fun main() {
    var objek = ReadWriteLog("Andre\n")

    print("==========\n")

    println(objek.names)

    print("==========\n")

    objek.names = "Alice\n"

    print("==========\n")

    println(objek.names)
}