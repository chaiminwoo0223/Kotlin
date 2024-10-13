package chap10.section1

// With() 함수 사용해 보기
fun main() {
    data class User(val name: String, var skills: String, var email: String? = null)
    val user = User("Kildong", "default")

    val result = with(user) {
        skills = "Kotlin"
        email = "kildong@example.com"
    }
    println(user)
    println("result: $result")
}
