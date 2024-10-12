package chap09.section2

// 가변형 Set 초기화
fun main() {
    val animals = mutableSetOf("Lion", "Dog", "Cat", "Python", "Hippo")
    println(animals)

    // 요소의 추가
    animals.add("Dog") // 요소 중 "Dog"가 이미 존재하므로 변화 없음
    println(animals)

    // 요소의 삭제
    animals.remove("Python")
    println(animals)
}
