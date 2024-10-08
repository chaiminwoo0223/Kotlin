package chap06.section1

// 커스텀 게터와 세터 사용하기
class User3(_id: Int, _name: String, _age: Int) {
    val id = _id
    var name = _name
        set(value) {
            println("The name was changed.")
            field = value.uppercase()
        }
    var age = _age
}

fun main() {
    val user = User3(1, "Kildong", 35)
    user.name = "coco"
    println("user.name = ${user.name}")
}
