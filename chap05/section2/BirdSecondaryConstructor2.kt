package chap05.section2

// 여러 개의 부 생성자를 사용하는 Bird 클래스
class Bird3 {
    // 프로퍼티
    var name: String
    var wing: Int
    var beak: String
    var color: String

    // 첫번째 부 생성자
    constructor(name: String, wing: Int, beak: String, color: String) {
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }

    // 두번째 부 생성자
    constructor(name: String, beak: String) {
        this.name = name
        this.wing = 2
        this.beak = beak
        this.color = "blue"
    }

    // 메소드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val fire_bird = Bird3("mybird", 2, "long", "red")
    val water_bird = Bird3("mybird2", "short")
    fire_bird.fly()
    fire_bird.sing(5)
    water_bird.fly()
    water_bird.sing(1)
}
