package chap04.section3

// 라벨을 사용한 람다식의 반환
fun main() {
    retFunc2()
}

fun noInlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc2() {
    println("start of retFunc")
    noInlineLambda(13, 3) lit@{ a, b -> // 람다식 블록 시작 부분에 라벨을 지정
        val result = a + b
        if (result > 10) return@lit // 라벨을 사용한 블록의 끝부분으로 반환
        println("result: $result")
    } // 이 부분으로 빠져나감
    println("end of retFunc") // 이 부분이 실행
}
