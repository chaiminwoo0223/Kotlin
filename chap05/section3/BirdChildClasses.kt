package chap05.section3

// 파생 클래스 만들어 보기
open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {
    // 메소드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

// 주 생성자를 사용하는 상속
class Lark(name: String, wing: Int, beak: String, color: String) : Bird(name, wing, beak, color) {
    fun singHitone() = println("Happy Song!") // 새로 추가한 메소드
}

// 부 생성자를 사용하는 상속
class Parrot : Bird {
    val language: String

    constructor(name: String, wing: Int, beak: String, color: String, language: String) : super(name, wing, beak, color) {
        this.language = language // 새로 추가한 프로퍼티
    }

    fun speak() = println("Speak! $language")
}

fun main() {
    val coco = Bird("myBird", 2, "short", "blue")
    val lark = Lark("myLark", 2, "long", "brwon")
    val parrot = Parrot("myParrot", 2, "short", "multiple", "korean") // 프로퍼티 추가

    println("Coco: ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("Lark: ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}")
    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")

    coco.fly()
    coco.sing(3)
    lark.singHitone()
    lark.fly()
    parrot.speak()
    parrot.sing(5)
}
