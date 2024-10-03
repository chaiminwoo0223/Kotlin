package chap03.section3

// 꼬리 재귀를 사용해 팩토리얼 만들어 보기
fun main() {
    val number = 5
    println("Factorial: $number -> ${factorial2(number)}")
}

// 꼬리 재귀 함수
tailrec fun factorial2(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial2(n-1, run*n)
}
