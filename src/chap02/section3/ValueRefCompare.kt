package chap02.section3

// 아중 등호 비교와 삼중 등호 비교 사용하기
fun main() {
    // 참조형 -> 컴파일러 -> 기본형
    val a: Int = 128
    val b = a
    println(a === b) // 값이 동일하므로 true

    // 참조형
    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    println(c == d) // 값의 내용만 비교하는 경우 동일하므로 true
    println(c === d) // 값의 내용은 같지만, 참조 주소를 비교해 다른 객체(다른 주소)이므로 false
    println(c === e) // 값의 내용도 같고, 참조된 객체도 동일하므로 true
}
