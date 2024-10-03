package chap03.section1

// sum 함수 선언하고 호출하기
fun main() {
    val result1 = sum(3, 2)
    val result2 = sum(6, 7)
    println(result1)
    println(result2)
}

// 덧셈 함수 정의하기
fun sum(a: Int, b: Int): Int {
    var sum = a + b
    return sum
}

// 덧셈 함수 간략하게 만들기 1
fun sum1(a: Int, b: Int): Int {
    return a + b
}

// 덧셈 함수 간략하게 만들기 2
fun sum2(a: Int, b: Int): Int {
    return a + b
}

// 덧셈 함수 간략하게 만들기 3
fun sum3(a: Int, b: Int): Int = a + b

// 덧셈 함수 간략하게 만들기 4
fun sum4(a: Int, b: Int) = a + b
