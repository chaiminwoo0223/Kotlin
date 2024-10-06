package chap05.section4

// 주 생성자와 부 생성자 함께 사용하기
class Person2(firstName: String, out: Unit = println("[Primary Constructor] Parameter")) {
    val fName = println("[Property] Person fName: $firstName") // 프로퍼티 할당
    // 초기화 블록
    init {
        println("[init] Person init block")
    }

    // 부 생성자
    constructor(firstName: String, age: Int, out: Unit = println("[Secondary Constructor] Parameter")) : this(firstName) {
        println("[Secondary Constructor] Body: $firstName, $age")
    }
}

fun main() {
    val p1 = Person2("Kildong", 30)
    println()
    val p2 = Person("Dooly")
}
