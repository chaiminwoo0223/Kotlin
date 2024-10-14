package chap11.section2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

// 코루틴의 순차적 실행
suspend fun doWork1(): String {
    delay(1000)
    return "Work1"
}

suspend fun doWork2(): String {
    delay(3000)
    return "Work2"
}

private fun worksInSerial() {
    // 순차적 실행
    GlobalScope.launch {
        val one = doWork1()
        val two = doWork2()
        println("Kotlin One: $one")
        println("Kotlin Two: $two")
    }
}

fun main() {
    worksInSerial()
    readLine() // main이 먼저 종료되는 것을 방지하기 위해 콘솔에서 [Enter]키 입력 대기
}
