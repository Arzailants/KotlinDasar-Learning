package kotlin_oop

open class Item(val name: String, val price: Int)

class Noodles : Item("Noodles", 10){
    override fun toString(): String {
        return name
    }
}
class Vegetables(vararg val topping: String) : Item("Vegetables", 5){
    override fun toString(): String {
        return if (topping.isEmpty()){
            "$name Chef's choice"
        } else {
            "Order : $name ${topping.joinToString()}"
        }
    }
}

// MEMBUAT SEBUAH KELAS ORDER
class Order(val orderNumber: Int){
    // BUAT PROPERTIES, UNTUK MENYIMPAN DATA
    private val itemList = mutableListOf<Item>()

    // MEMBUAT SEBUAH FUNCTION, UNTUK MENYIMPAN DI itemList
    fun addItem(newItem: Item): Order{
        itemList.add(newItem)
        return this
    }

    fun addAll(newItems: List<Item>): Order{
        itemList.addAll(newItems)
        return this
    }

    fun print(){
        // MENAMPILKAN
        println("Order #${orderNumber}")
        var total = 0
        for(item in itemList){
            println("${item} : $${item.price}")
            total += item.price
        }
        println("Total : $${total}")

    }
}

fun main(){
    val orderList = mutableListOf<Order>()
    // INSTANSIASI OBJEK
    //val noodles = Noodles("Indomie", "Sedap", "Sarimi")
    //val vegetables = Vegetables("Nangka", "Seledri", "Kangkung")

    // INSTANSIASI OBJEK DARI CLASS ORDER
    val objek1 = Order(1)
    objek1.addItem(Noodles())
    orderList.add(objek1)

    // Add multiple items individually
    val order2 = Order(2)
    order2.addItem(Noodles())
    order2.addItem(Vegetables())
    orderList.add(order2)

    // Add a list of items at one time
    val order3 = Order(3)
    val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))
    order3.addAll(items)
    orderList.add(order3)

    val order4 = Order(4)
        .addItem(Noodles())
        .addItem(Vegetables("Cabbage", "Onion"))
    orderList.add(order4)

    orderList.add(
        Order(5)
            .addItem(Noodles())
            .addItem(Noodles())
            .addItem(Vegetables("Selada", "Kangkung"))
    )

    // MENAMPILKAN SEMUA ISI ORDER
    for (order in orderList){
        order.print()
        println()
    }
}