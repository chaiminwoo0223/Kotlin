package chap02.section3

// 스마트 캐스트 사용해 보기
fun main() {
    // Float형으로 스마트 캐스트
    var test: Number = 12.2
    println("$test")

    // Int형으로 스마트 개스트
    test = 12
    println("$test")

    // Long형으로 스마트 캐스트
    test = 120L
    println("$test")

    // Float형으로 스마트 캐스트
    test += 12.0f
    println("$test")
}
