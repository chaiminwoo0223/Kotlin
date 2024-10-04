package chap04.section3

// 0으로 나누었을 때 예외 처리하기
fun main() {
    val a = 6
    val b = 0
    val c: Int

    try {
        c = a / b // 0으로 나눔
    } catch (e: ArithmeticException) {
        println("Exception is handled. ${e.message}")
    } finally {
        println("finally 블록은 반드시 항상 실행됨")
    }
}
