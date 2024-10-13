package chap09.section4

// 컬렉션의 요소 집계 확장 함수 사용하기
fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // 요소의 순환
    list.forEach { println("$it") } // forEach: 각 요소를 람다식으로 처리
    println()
    list.forEachIndexed { index, value -> println("index[$index]: $value") } // 인덱스 포함
    println()

    // 요소의 순환 2
    val returnedList = list.onEach { println(it) } // onEach: 각 요소를 람다식으로 처리 후 컬렉션으로 반환
    println()
    val returnedMap = map.onEach { println("key: ${it.key}, value: ${it.value}") }
    println()
    println("returnedList = $returnedList")
    println("returnedMap = $returnedMap")
    println()

    // 요소의 개수 반환하기
    println(list.count { it % 2 == 0 }) // count: 조건에 맞는 요소 개수 반환
    println()

    // 최댓값과 최솟값의 요소 반환하기
    println(list.max()) // 6
    println(list.min()) // 1
    println("maxBy: " + map.maxBy { it.key }) // 키를 기준으로 최댓값
    println("minBy: " + map.minBy { it.key }) // 키를 기준으로 최솟값
    println()

    // 각 요소에 정해진 식 적용하기
    println(list.fold(4) { total, next -> total + next })
    println(list.fold(1) { total, next -> total + next })
    println(list.foldRight(4) { total, next -> total + next })
    println(list.foldRight(1) { total, next -> total + next })
    println(list.reduce { total, next -> total + next })
    println(list.reduceRight { total, next -> total + next })
    println()

    // 모든 요소 합산하기
    println(listPair.sumOf { it.second })
}
