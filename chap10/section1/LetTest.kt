package chap10.section1

// let() 함수 사용해 보기
fun main() {
    val score: Int? = 32

    // 일반적인 null 검사
    fun checkScore() {
        if (score != null) {
            println("Score: $score")

        }
    }

    // let 함수를 사용해 null 검사를 제거
    fun checkScoreLet() {
        score?.let { println("Score: $it") }
        val str = score.let { it.toString() }
        println(str)
    }
    checkScore()
    checkScoreLet()
}
