package chap07.section1

// 추상 클래스의 객체 인스턴스
abstract class Printer {
    abstract fun print() // 추상 메소드
}

val myPrinter = object: Printer() { // 객체 인스턴스
    override fun print() {
        println("출력합니다.") // 추상 메소드의 구현
    }
}

fun main() {
    myPrinter.print()
}
