package chap04.section2

// 홀수의 합과 짝수의 합 구하기
fun main() {
    var total = 0

    // 홀수의 합
    for (num in 1..100 step 2) total += num
    println("Odd total: $total")

    // 짝수의 합
    for (num in 0..100 step 2) total += num
    println("Even total: $total")
}
