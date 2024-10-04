package chap04.section3

class InvalidNameException(message: String): Exception(message) // 사용자 예외 클래스

// 사용자 예외 클래스 만들어 보기
fun main() {
    val name = "Kildong123" // 숫자가 포함된 이름

    try {
        validateName(name)
    } catch (e: InvalidNameException) { // 숫자가 포함된 예외 처리
        println(e.message)
    } catch (e: Exception) { // 기타 예외 처리
        println(e.message)
    }
}

fun validateName(name: String) {
    if (name.matches(Regex(".*\\d+.*")))
        throw InvalidNameException("Your name: $name : contains numerials.")
}
