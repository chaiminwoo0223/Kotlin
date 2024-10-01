package chap03.section4

var global = 10 // 전역 변수

// 전역 변수와 지역 변수의 범위
fun main() {
    val local1 = 20 // 지역 변수
    val local2 = 21 // 지역 변수

    fun nestedFunc() {
        global += 1
        val local1 = 30 // nestedFunc() 함수 안에서만 유지(기존 local1이 가려짐)
        println("nestedFunc local1: $local1")
        println("nestedFunc local2: $local2")
        println("nestedFunc global: $global")
    }

    nestedFunc()
    outsideFunc()

    println("main global: $global")
    println("main local1: $local1")
    println("main local2: $local2")
}

fun outsideFunc() {
    global += 1
    val outVal = "outside"
    println("outsideFunc global: $global")
    println("outsideFunc outVal: $outVal")
}
