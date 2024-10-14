package chap11.section1

// 기본 스레드 생성해 보기
class SimpleThread : Thread() {
    override fun run() {
        println("Current Threads: ${Thread.currentThread()}")
    }
}

class SimpleRunnable : Runnable {
    override fun run() {
        println("Current Threads: ${Thread.currentThread()}")
    }
}

fun main() {
    val thread1 = SimpleThread()
    thread1.start()

    val runnable = SimpleRunnable()
    val thread2 = Thread(runnable)
    thread2.start()
}
