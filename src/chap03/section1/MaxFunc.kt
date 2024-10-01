package chap03.section1

// 함수의 호출 원리 살펴보기
fun main() {
    val num1 = 10 // 지역 변수
    val num2 = 3 // 지역 변수
    val result: Int

    result = max(num1, num2)
    println(result)
}

fun max(a: Int, b: Int) = if (a > b) a else b
