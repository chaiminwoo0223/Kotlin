package chap06.section1

// 게터와 세터 동작 확인하기
class User(_id: Int, _name: String, _age: Int) {
    // 프로퍼티
    val id = _id // 불변 읽기 전용
    var name = _name // 변경 가능
    var age = _age // 변경 가능
}

// class User(val id: Int, var name: String, var age: Int) // 간소화

fun main() {
    val user = User(1, "Sean", 30)
    val name = user.name // 게터에 의한 값 획득
    user.age = 41 // 세터에 의한 값 지정
    println("name: $name, age: ${user.age}")
}
