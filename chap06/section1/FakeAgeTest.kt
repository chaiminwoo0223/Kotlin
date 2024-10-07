package chap06.section1

// 세터를 이용한 나이 속이기
class FakeAge {
    var age = 0
        // 나이에 따라 판별하는 세터
        set(value) {
            field = when {
                value < 18 -> 18
                value in 18..30 -> value
                else -> value - 3
            }
        }
}

fun main() {
    val kim = FakeAge()
    kim.age = 15
    println("Kim's real age = 15, pretended age = ${kim.age}")

    val park = FakeAge()
    park.age = 20
    println("Park's real age = 35, pretended age = ${park.age}")

    val hong = FakeAge()
    hong.age = 35
    println("Hong's real age = 35, pretended age = ${hong.age}")
}
