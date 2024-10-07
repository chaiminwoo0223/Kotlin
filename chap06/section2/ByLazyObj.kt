package chap06.section2

// by lazy로 선언된 객체 지연 초기화하기
class Person2(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated= false // 초기화 확인 용도
    val person : Person2 by lazy { // lazy를 사용한 Person 객체의 지연 초기화
        isPersonInstantiated = true
        Person2("Kim", 23) // 이 부분이 Lazy 객체로 반환됨
    }
    val personDelegate = lazy { Person2("Hong", 40) } // 위임 변수를 사용한 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}") // 이 시점에서 초기화
    println("personDelegate.value.name = ${personDelegate.value.name}") // 이 시점에서 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
}
