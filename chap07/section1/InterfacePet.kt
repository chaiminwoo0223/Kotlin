package chap07.section1

// Pet 인터페이스 만들어 보기
interface Pet {
    var category: String // abstract 키워드가 없어도 기본은 추상 프로퍼티
    var species: String // 종을 위한 프로퍼티
    fun feeding() // abstract 키워드가 없어도 기본은 추상 메소드
    fun patting() { // 일반 메소드
        println("Keep patting!") // 구현부
    }
}

class Cat(name: String, override var category: String) : Pet, Animal(name) {
    override var species: String = "cat"
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

fun main() {
    val obj = Cat("Bill", "small")
    println("Pet Category: ${obj.category}")
    obj.feeding() // 구현 메소드
    obj.patting() // 기본 메소드
}
