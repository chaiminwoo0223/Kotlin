package chap09.section4

// 컬렉션의 필터와 추출 확장 함수 사용하기
fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listMixed = listOf(1, "Hello", 3, "World", 5, 'A')
    val listWithNull = listOf(1, null, 3, null, 5, 6)
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // 특정 요소를 골라내기
    println(list.filter { it % 2 == 0 }) // 짝수만 골라내기
    println(list.filterNot { it % 2 == 0 }) // 식 이외에 요소 골라내기
    println(listWithNull.filterNotNull()) // null을 제외
    println("filterIndexed: " + list.filterIndexed { idx, value -> idx != 1 && value % 2 == 0 }) // 인덱스와 함께 추출
    val mutList = list.filterIndexedTo(mutableListOf()) { idx, value -> idx != 1 && value % 2 == 0 } // 추출 후 가변형 컬렉션으로 변환
    println("filterIndexedTo: $mutList")
    println("filterKeys: " + map.filterKeys { it != 11 }) // 키 11을 제외한 요소
    println("filterValues: " + map.filterValues { it == "Java" }) // 값이 "Java"인 요소
    println("filterISInstance: " + listMixed.filterIsInstance<String>()) // listMixed에서 String형만 골라냄
    println()

    // 특정 범위를 잘라내기
    println("slice: " + list.slice(listOf(0, 1, 2)))
    println(list.take(2)) // 앞 두 요소 반환
    println(list.takeLast(2)) // 마지막 두 요소 반환
    println(list.takeWhile { it < 3 }) // 조건식에 따른 반환
    println()

    // 특정 범위를 반환하기
    println(list.drop(3)) // 앞의 요소 3개 제외하고 반환
    println(list.dropWhile { it < 3 }) // 3 미만을 제외하고 반환
    println(list.dropLastWhile { it > 3 }) // 3 초과를 제외하고 반환
    println()

    // 각 요소의 반환
    println("component1(): " + list.component1()) // 첫번째 요소인 1을 반환
    println()

    // 합집합과 교집합
    println("distinct: " + listRepeated.distinct()) // 중복 요소는 하나로 취급(합집합)
    println("intersect: " + list.intersect(listOf(5, 6, 7, 8))) // 교집합
}
