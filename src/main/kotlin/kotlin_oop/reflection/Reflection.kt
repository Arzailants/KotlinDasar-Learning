package kotlin_oop.reflection

import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

class Reflection(
    @NotBlank val id: String,
    @NotBlank val nama: String,
    val price: Long
)

fun main() {

    val request = Reflection("1", "Indomie", 0)
    validateRequest(request)
}


fun validateRequest(request: Any){
    val clazz = request::class
    // MENGAMBIL DATA PROPERTIES
    val properties = clazz.memberProperties

    // iterate satu satu, lalu cek kalo ada annotation @NotBlank
    for (property in properties){
        if (property.findAnnotation<NotBlank>() != null){
            // MENDAPATKAN PROPERTIES DARI REQUEST
            val value = property.call(request)
            when(value){
                is String -> {
                    if (value == ""){
                        throw ClassNotFoundException("${property.name} is blank")
                    }
                }
            }
        }
    }
}