package chap02.section4

// 증가, 감소 연산자 사용하기
fun main() {
    var num1 = 10
    var num2 = 10
    var num3 = 10
    var num4 = 10
    val result1 = ++num1 // num 값 증가 후 대입
    val result2 = num2++ // num 값 대입 후 증가
    val result3 = --num3 // num 값 감소 후 대입
    val result4 = num4-- // num 값 대입 후 감소

    println("result1: $result1 num1: $num1")
    println("result2: $result2 num2: $num2")
    println("result3: $result3 num3: $num3")
    println("result4: $result4 num4: $num4")
}
