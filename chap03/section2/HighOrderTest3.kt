package chap03.section2

// 인자와 반환값이 없는 람다식 함수
fun main() {
    val out: () -> Unit = { println("Hello World!") } // 인자와 반환값이 없는 람다식의 선언
    out() // 함수처럼 사용 가능

    val new = out // 람다식에 들어있는 변수를 다른 변수에 할당
    new() // 함수처럼 사용 가능
}
