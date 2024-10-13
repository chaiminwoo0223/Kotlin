package chap10.section1

// let() 함수와 also() 함수 비교해 보기
fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("Kildong", "Kotlin")

    val a = person.let {
        it.skills = "Android"
        "success" // 마지막 문장을 결과로 반환
    }
    println(person)
    println("a: $a")

    val b = person.also {
        it.skills = "Java"
        "success" // 마지막 문장을 결과로 반환
    }
    println(person)
    println("b: $b")
}
