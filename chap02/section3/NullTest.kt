package chap02.section3

// null 처리하기
fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null

    println("str1: $str1 length: ${str1?.length}") // 세이프콜로 안전하게 호출
}
