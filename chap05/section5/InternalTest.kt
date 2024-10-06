package chap05.section5

// internal 가시성 테스트하기
internal class InternalClass {
    internal var i = 1
    internal fun icFunc() {
        i += 1 // 접근 허용
    }

    fun access() {
        icFunc() // 접근 허용
    }
}

class Other {
    internal val ic = InternalClass() // 프로퍼티를 지정할 때, internal로 맞춰야 함
    fun test() {
        ic.i // 접근 허용
        ic.icFunc() // 접근 허용
    }
}

fun main() {
    val mic = InternalClass() // 생성 가능
    mic.i // 접근 허용
    mic.icFunc() // 접근 허용
}
