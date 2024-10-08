package chap06.section1

// 기본 게터와 세터 지정하기
class User2(_id: Int, _name: String, _age: Int) {
    // 프로퍼티
    val id = _id
        get() = field

    var name = _name
        get() = field
        set(value) {
            field = value
        }

    var age = _age
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val user = User2(1, "Kildong", 30)
//  user.id = 2 // val 프로퍼티는 값 변경 불가
    user.age = 35 // 세터
    println("user.age = ${user.age}") // 게터
}
