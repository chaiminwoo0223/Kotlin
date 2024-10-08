package chap06.section3

// 컴패니언 객체 사용해 보기
class Person {
    var id = 0
    var name = "Youngdeok"
    companion object {
        var language = "Korean"
        fun work() {
            println("working...")
        }
    }
}

fun main() {
    println(Person.language) // 인스턴스를 생성하지 않고 기본값 사용
    Person.language = "English" // 기본값 변결 가능
    println(Person.language) // 변경된 내용 출력
    Person.work() // 메소드 실행
//  println(Person.name) // name은 컴패니언 객체가 아니므로 오류
}
