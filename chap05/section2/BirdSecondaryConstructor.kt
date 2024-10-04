package chap05.section2

// 부 생성자를 사용하는 Bird 클래스
class Bird2 {
    // 프로퍼티 - 선언만 함
    var name: String
    var wing: Int
    var beak: String
    var color: String

    // 부 생성자 - 매개변수를 통해 초기화할 프로퍼티에 지정
    constructor(name: String, wing: Int, beak: String, color: String) {
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }

    // 메소드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird2("mybird", 2, "short", "blue") // 생성자의 인자로 객체 생성과 동시에 초기화
    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}
