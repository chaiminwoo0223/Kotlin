package chap07.section2

// 인터페이스를 통한 열거형 클래스 구현하기
interface Score {
    fun getScore(): Int
}

enum class MemberType(var prio: String) : Score { // Score를 구현한 열거형 클래스
    NORMAL("THIRD") {
        override fun getScore() = 100
    },
    SILVER("SECOND") {
        override fun getScore() = 500
    },
    GOLD("FIRST") {
        override fun getScore() = 1500
    }
}

fun main() {
    println(MemberType.NORMAL.getScore())
    println(MemberType.GOLD)
    println(MemberType.valueOf("SILVER"))
    println(MemberType.SILVER.prio)

    for (grade in MemberType.values()) { // 모든 값을 가져오는 반복문
        println("grade.name = ${grade.name}, prio = ${grade.prio}")
    }
}
