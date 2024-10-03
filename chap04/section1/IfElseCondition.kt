package chap04.section1

// else if문을 사용한 등급 판별하기
fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble() // 콘솔로부터 입력받음
    var grade = 'F'

    if (score >= 90.0) {
        grade = 'A'
    } else if (score >= 80.0 && score <= 89.9) {
        grade = 'B'
    } else if (score >= 70.0 && score <= 79.9) {
        grade = 'C'
    } else {
        grade = 'F'
    }

    println("score: $score, grade: $grade")
}
