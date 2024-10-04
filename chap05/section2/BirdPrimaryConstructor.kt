package chap05.section2

// 주 생성자를 사용하는 Bird 클래스 선언
class Bird4(var name: String, var wing: Int, var beak: String, var color: String) {
    // 메소드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird4("mybird", 2, "short", "blue")
    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}
