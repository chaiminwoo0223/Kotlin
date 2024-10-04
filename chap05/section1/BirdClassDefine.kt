package chap05.section1

// Bird 클래스 만들어 보기
class Bird {
    // 프로퍼티(속성)
    var name: String = "mybird"
    var wing: Int = 2
    var beakL: String = "short"
    var color: String = "blue"

    // 메소드(힘수)
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird() // 클래스의 생성자를 통한 객체의 생성
    coco.color = "blue" // 객체의 프로퍼티에 값 할당

    println("coco.color: ${coco.color}") // 객체의 멤버 프로퍼티 읽기
    coco.fly() // 객체의 멤버 메소드 사용
    coco.sing(3) // 객체의 멤버 메소드 사용
}
