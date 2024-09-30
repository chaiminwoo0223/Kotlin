package chap02.section3

// 자료형 검사하기
fun main() {
    val num = 256

    if (num is Int) {
        print(num)
    } else if (num !is Int) {
        print("Not a Int")
    }
}
