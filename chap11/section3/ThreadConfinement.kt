package chap11.section3

import kotlinx.coroutines.*
import java.util.concurrent.Executors
import kotlin.coroutines.CoroutineContext
import kotlin.system.measureTimeMillis

// 스레드에 가두기
val counterDispatcher = Executors.newSingleThreadExecutor().asCoroutineDispatcher()
var counter3 = 0

suspend fun massiveRun3(context: CoroutineContext, action: suspend () -> Unit) {
    val n = 1000
    val k = 1000
    val time = measureTimeMillis {
        coroutineScope { // 구조적 동시성 사용
            val jobs = List(n) {
                launch(context) { // 이 범위 내에서 코루틴 실행
                    repeat(k) { action() }
                }
            }
            jobs.forEach { it.join() }
        }
    }
    println("Completed ${n * k} actions in $time ms")
}

fun main() = runBlocking {
    massiveRun3(counterDispatcher) {
        withContext(counterDispatcher) { // 단일 스레드 디스패처에서 안전하게 실행
            counter3++
        }
    }
    println("Counter = $counter3")
    counterDispatcher.close() // 스레드 종료 및 자원 해제
}
