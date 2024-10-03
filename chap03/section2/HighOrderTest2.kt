package chap03.section2

// 매개변수에 람다식 함수를 이용한 고차 함수
fun main() {
    var result: Int
    result = highOrder({ x, y -> x + y }, 10, 20) // 람다식을 인자로 사용
    println(result)
}

fun highOrder(sum: (Int, Int) -> Int, a: Int, b: Int): Int { // 함수의 매개변수에서 선언한 람다식 자료형
    return sum(a, b)
}
