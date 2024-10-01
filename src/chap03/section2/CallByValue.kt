package chap03.section2

// 값에 의한 호출로 람다식 사용하기
fun main() {
    val result = callByValue(lambda()) // 람다식 함수를 호출
    println(result)
}

fun callByValue(b: Boolean): Boolean { // 일반 변수 자료형으로 선언된 매개변수
    println("callByValue function")
    return b
}

val lambda: () -> Boolean = {
    println("lambda function")
    true
}
