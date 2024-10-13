package chap09.section4

// 순서와 정렬 연산 사용하기
fun main() {
    val unsortedList = listOf(3, 2, 7, 5)

    println(unsortedList.reversed()) // reversed: 뒤집힌 순서로 컬렉션 반환
    println(unsortedList.sorted()) // sorted: 요소를 정렬한 후, 정렬된 컬렉션 반환
    println(unsortedList.sortedDescending()) // sortedDescending: 내림차순 정렬
    println(unsortedList.sortedBy { it % 3 }) // sortedBy: 특정 비교식에 의해 정렬된 컬렉션 반환(오름차순)
    println(unsortedList.sortedByDescending { it % 3 }) // sortedByDescending: 특정 비교식에 의해 정렬된 컬렉션 반환(내림차순)
}
