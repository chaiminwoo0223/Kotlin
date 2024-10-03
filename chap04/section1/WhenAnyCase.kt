package chap04.section1

class MyClass

// 다양한 자료형의 인자 받기
fun main() {
    cases("Hello")
    cases(1)
    cases(System.currentTimeMillis()) // 현재 시간(밀리초 단위)을 Long형 값으로 반환
    cases(MyClass())
    cases("I love you")
}

fun cases(obj: Any) {
    when(obj) {
        1 -> println("Int: $obj")
        "Hello" -> println("String: $obj")
        is Long -> println("Long: $obj")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}
