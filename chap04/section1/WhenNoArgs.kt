package chap04.section1

// 인자가 없는 when문 사용하기
fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade = 'F'

    when {
        score >= 90.0 -> grade = 'A' // 인자가 들어있는 when문과 다르게 조건식을 구성할 수 있음
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        score < 70.0 -> grade = 'F'
    }

    println("score: $score, grade: $grade")
}
