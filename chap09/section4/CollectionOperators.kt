package chap09.section4

// 컬렉션으로 연산 테스트하기
fun main() {
    val list1: List<String> = listOf("one", "two", "three")
    val list2: List<Int> = listOf(1, 3, 4)
    val map1 = mapOf("Hi" to 1, "Hello" to 2, "Goodbye" to 3)

    println(list1 + "four") // + 연산자를 사용한 문자열 요소 추가
    println(list2 + 1) // + 연산자를 사용한 정수형 요소 추가
    println(list2 + listOf(5, 6, 7)) // 두 List의 병합
    println(list2 - 1) // 요소의 제거
    println(list2 - listOf(3, 4, 5)) // 일치하는 요소의 제거
    println(map1 + Pair("Bye", 4)) // Pair()를 사용한 Map의 요소 추가
    println(map1 - "Hello") // 일치하는 값의 제거
    println(map1 + mapOf("Apple" to 4, "Orange" to 5)) // 두 Map의 병합
    println(map1 - listOf("Hi", "Hello"))
}
