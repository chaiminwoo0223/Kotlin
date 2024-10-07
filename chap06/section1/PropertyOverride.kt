package chap06.section1

// 프로퍼티의 오버라이딩 사용하기
open class First {
    open val x = 0 // 오버라이딩 가능
        get() {
            println("First x")
            return field
        }
    val y = 0 // open 키워드가 없으면 final 프로퍼티
}

class Second : First() {
    override var x = 10 // 상위 클래스와 구현부가 다르게 오버라이딩
        get() {
            println("Second x")
            return field + 3
        }
//  override val y = 0 // 오류: 오버라이딩 불가
}

fun main() {
    val second = Second()
    println(second.x) // 오버라이딩된 두번째 클래스 객체의 x
    println(second.y)
}
