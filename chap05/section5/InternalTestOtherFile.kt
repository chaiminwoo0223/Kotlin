package chap05.section5

// internal 가시성 테스트하기 - 다른 파일
fun main() {
    val otheric = InternalClass()
    println(otheric.i)
    otheric.icFunc()
}
