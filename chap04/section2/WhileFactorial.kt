package chap04.section2

// while문으로 팩토리얼 계산하기
fun main() {
    print("Enter the number: ")
    var number = readLine()!!.toInt()
    var factorial = 1

    while (number > 0) {
        factorial *= number
        -- number
    }

    println("Factorial: $factorial")
}
