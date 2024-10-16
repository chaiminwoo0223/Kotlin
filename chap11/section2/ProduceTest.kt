package chap11.section2

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking

// 생산자 소비자 형태의 구성
fun CoroutineScope.producer(): ReceiveChannel<Int> = produce {
    var total: Int = 0
    for (x in 1..5) {
        total += x
        send(total)
    }
}

fun main() = runBlocking {
    val result = producer() // 값의 생산
    result.consumeEach { print("$it ") } // 소비자 루틴 구성
}
