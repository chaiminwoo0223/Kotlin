package chap09.section4

// 분리와 병합 연산 사용하기
fun main() {
    val list1 = listOf(1, 2, 3, 4, 5, 6)
    val list2 = listOf(2, 2, 3, 4, 5, 5, 6, 7)

    println(list1.union(list2)) // union: 두 List를 합침(중복 요소 하나만)
    println(list1.plus(list2)) // plus: 두 List를 합침(중복 요소 포함), + 연산자와 같음
    println(list1.partition { it % 2 == 0 }) // partition: 주어진 식에 따라 2개의 컬렉션으로 분리해 Pair로 반환
    println(list1.zip(listOf(7, 8))) // zip: 동일 인덱스끼리 Pair를 만들어 반환
}
