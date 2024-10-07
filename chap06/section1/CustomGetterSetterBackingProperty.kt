package chap06.section1

// 임시적인 보조 프로퍼티 사용하기
class User4(_id: Int, _name: String, _age: Int) {
    val id = _id
    private var tempName: String? = null
    var name = _name
        get() {
            if (tempName == null) tempName = "NONAME"
            return tempName ?: throw AssertionError("Asserted by others")
        }
    var age = _age
}

fun main() {
    val user = User4(1, "Kildong", 35)
    user.name = "coco"
    println("user.name = ${user.name}")
}
