package chap08.section2

// Comparator를 사용해 제품 비교하기
data class Product2(val name: String, val price: Double)

fun main() {
    val products = arrayOf(
        Product2("Snow Ball", 870.00),
        Product2("Smart Phone", 999.00),
        Product2("Drone", 240.00),
        Product2("Mouse", 333.35),
        Product2("Keyboard", 125.99),
        Product2("Smart Phone", 1500.99),
        Product2("Mouse", 512.99))
    products.sortWith(compareBy({it.name}, {it.price}))
    products.forEach { println(it) }
}
