package chap05.section2

// 프로퍼티의 기본값 지정
class Bird6(var name: String = "noname", var wing: Int = 2, var beak: String, var color: String) {
    // 초기화 블록
    init {
        println("---------- 초기화 블록 시작 ----------")
        println("이름은  $name, 부리는 $beak")
        this.sing(3)
        println("---------- 초기화 블록 끝 -----------")
    }

    // 메소드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird6(beak = "short", color = "blue")
    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
}
