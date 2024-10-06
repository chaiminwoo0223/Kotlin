package chap05.section3

// 메소드 오버라이딩하기
open class Bird2(var name: String, var wing: Int, var beak: String, var color: String) {
    // 메소드
    fun fly() = println("Fly wing: $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol") // 오버라이딩이 가능한 메소드
}

class Parrot2(name: String, wing: Int = 2, beak: String, color: String, var language: String = "natural") : Bird2(name, wing, beak, color) {
    fun speak() = println("Speak! $language") // Parrot2에 추가된 메소드
    // 오버라이딩된 메소드
    override fun sing(vol: Int) {
        println("I'm a parrot! The volume level is $vol")
        speak()
    }
}

fun main() {
    val parrot = Parrot2(name = "myParrot", beak = "short", color = "multiple")
    parrot.language = "English"
    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
    parrot.sing(5)
}
