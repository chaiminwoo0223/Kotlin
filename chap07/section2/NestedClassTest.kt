package chap07.section2

// 중첩 클래스 사용하기
class Outer {
    val ov = 5
    class Nested {
        val nv = 10
        fun greeting() = "[Nested] Hello ! $nv" // 외부의 ov에는 접근 불가
    }

    fun outside() {
        val msg = Nested().greeting() // 객체 생성 없이 중첩 클래스의 메소드 접근
        println("[Outer]: $msg, ${Nested().nv}") // 중첩 클래스의 프로퍼티 접근
    }
}

fun main() {
    val output = Outer.Nested().greeting() // static처럼 객체 생성 없이 사용
    println(output)

//  Outer.outside
    val outer = Outer() // 오류: 외부 클래스는 객체를 생성해야 함
    outer.outside()
}
