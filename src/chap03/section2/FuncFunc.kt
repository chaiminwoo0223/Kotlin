package chap03.section2

// 반환값에 일반 함수 사용해 보기
fun main() {
    println("funcFunc: ${funcFunc()}")
}

fun funcFunc(): Int {
    return sum(2, 2)
}
