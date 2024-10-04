package chap04.section3

// 조건에 따른 break 사용하기
fun main() {
    for (i in 1..5) {
//        if (i == 3) break
        if (i == 3) continue
        print(i)
    }
    println() // 개행 문자
    println("outside")
}
