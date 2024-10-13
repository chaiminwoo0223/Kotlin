package chap10.section1

// apply() 함수와 run() 함수 비교해 보기
fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("Kildong", "Kotlin")

    val returnObj = person.apply {
        this.name = "Sean"
        this.skills = "Java"
        "success" // 사용되지 않음
    }
    println(person)
    println("returnObj: $returnObj")

    val returnObj2 = person.run {
        this.name = "Dooly"
        this.skills = "C#"
        "success"
    }
    println(person)
    println("returnObj2: $returnObj2")
}
