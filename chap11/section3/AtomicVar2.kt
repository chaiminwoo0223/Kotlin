package chap11.section3

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

// 원자 변수 적용해 보기
var counter2 = AtomicInteger(0) // 원자 변수로 초기화

suspend fun massiveRun2(action: suspend () -> Unit) {
    val n = 1000 // 실행할 코루틴의 수
    val k = 1000 // 각 루틴을 반복할 횟수
    val time = measureTimeMillis {
        val jobs = List(n) {
            GlobalScope.launch {
                repeat(k) { action() }
            }
        }
        jobs.forEach { it.join() }
    }
    println("Completed ${ n * k } actions in $time ms")
}

fun main() = runBlocking {
    massiveRun2 {
        counter2.incrementAndGet() // 원자 변수의 멤버 메소드를 사용해 증가
    }
    println("Counter = ${counter2.get()}") // 값 읽기
}
