package chap04.section2

// 1부터 10까지 더하기
fun main() {
    var sum1 = 0
    var sum2 = 0

    // 상행 반복
    for (x in 1..10) sum1 += x
    println("sum1 = $sum1")

    // 하행 반복
    for (x in 10 downTo 1) sum2 += x
    println("sum2 = $sum2")
}
