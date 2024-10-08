package chap04.section1

// when문을 이용해 점수 등급 구하기
fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade = 'F'

    when(score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
        !in 70.0..100.0 -> grade = 'F'
    }

    println("score: $score, grade: $grade")
}
