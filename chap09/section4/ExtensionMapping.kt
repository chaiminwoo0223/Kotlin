package chap09.section4

// 컬렉션의 매핑 확장 함수 사용하기
fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listWithNull = listOf(1, null, 3, null, 5, 6)

    println(list.map { it * 2 }) // map: 컬렉션에 주어진 식을 적용해 새로운 컬렉션 반환
    println(list.mapIndexed { index, it -> index * it }) // mapIndexed: 컬렉션에 인덱스를 포함하고, 주어진 식을 적용해 새로운 컬렉션 반환
    println(listWithNull.mapNotNull { it?.times(2) }) // mapNotNull: null을 제외하고, 식을 적용해 새로운 컬렉션 반환
    println(list.flatMap { listOf(it, 'A') }) // flatMap: 각 요소에 식을 적용한 후, 다시 합쳐 새로운 컬렉션을 반환
    println(listOf("abc", "12").flatMap { it.toList() })
    println(list.groupBy { if (it % 2 == 0) "even" else "odd" }) // groupBy: 주어진 함수의 결과에 따라 그룹화하여 map으로 반환
}
