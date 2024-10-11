package chap08.section1

// 간단한 제네릭 예
class Box<T>(t: T) { // 형식 매개변수로 받은 인자를 name에 저장
    var name = t
}

fun main() {
    val box1: Box<Int> = Box<Int>(1)
    val box2: Box<String> = Box<String>("Hello")
    val box3 = Box<Int>(2)
    val box4 = Box<String>("World")
    val box5 = Box(3)
    val box6 = Box("Hello World")
    println(box1.name)
    println(box2.name)
    println(box3.name)
    println(box4.name)
    println(box5.name)
    println(box6.name)
}
