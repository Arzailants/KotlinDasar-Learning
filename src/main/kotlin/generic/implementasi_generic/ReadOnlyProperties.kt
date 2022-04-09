package generic.implementasi_generic

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class ReadOnlyProperties(val data: String): ReadOnlyProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Access ${property.name} with the value $data")
        return data.uppercase()
    }
}

class NameWithLog(param: String){
    // MEMBUAT
    val names: String by ReadOnlyProperties(param)
}

fun main() {
    val dataObjek = NameWithLog("Andre Rizaldi Brillianto")
    println(dataObjek.names)
}