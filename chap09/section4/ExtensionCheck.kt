package chap09.section4

// 컬렉션의 검사 확장 함수 사용하기
fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // 요소의 일치 여부 검사하기
    println(list.all { it < 10 })
    println(list.all { it % 2 == 0 })
    println(list.any { it % 2 == 0 })
    println(list.any { it > 10 })
    println()

    // 특정 요소의 포함 여부 검사하기
    println("contains: " + list.contains(2))
    println(2 in list)
    println(map.contains(11))
    println(11 in map)
    println("containsAll: " + list.containsAll(listOf(1, 2, 3)))
    println()

    // 특정 요소의 존재 여부 검사하기
    println("none: " + list.none())
    println("none: " + list.none { it > 6 }) // 6이상은 없으므로 true를 반환
    println(list.isEmpty())
    println(list.isNotEmpty())
}
