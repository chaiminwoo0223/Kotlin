package chap03.section3

// noinline으로 람다식의 인라인 막기
fun main() {
    shortFunc2(3) { println("First call: $it") }
}


inline fun shortFunc2(a: Int, noinline out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}
