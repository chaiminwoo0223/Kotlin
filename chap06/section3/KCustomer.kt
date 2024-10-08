package chap06.section3

// 컴패니언 객체를 가진 코틀린의 클래스
class KCustomer {
    companion object {
        const val LEVEL = "INTERMEDIATE"
        @JvmStatic fun login() = println("Login...") // 어노테이션 표기 사용
        @JvmField val JOB = KJob() // 특정 자료형을 사용하기 위한 어노테이션
    }
}

class KJob {
    var title = "Programmer"
}
