package chap09.section4

// 요소 처리와 검색 사용하기
fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)

    println("elementAt: " + list.elementAt(1)) // elementAt: 인덱스에 해당하는 요소 반환
    println("elementAtOrElse: " + list.elementAtOrElse(10) { 2 * it }) // elementAtOrElse: 인덱스를 벗어나는 경우 식에 따라 결과 반환
    println("elementAtOrNull: " + list.elementAtOrNull(10)) // elementAtOrNull: 인덱스를 벗어나는 경우 null 반환
    println("first: " + listPair.first { it.second == 200 }) // first: 식에 일치하는 첫 요소 반환
    println("last: " + listPair.last { it.second == 200 }) // last: 식에 일치하는 마지막 요소 반환
    println("firstOrNull: " + listPair.firstOrNull { it.first == "E" }) // firstOrNull: 식에 일치하지 않는 경우 null 반환
    println("lastOrNull: " + listPair.lastOrNull { it.first == "E" }) // lastOrNull: 식에 일치하지 않는 경우 null 반환
    println("indexOf: " + list.indexOf(4)) // indexOf: 주어진 요소에 일치하는 첫 인덱스 반환
    println("indexOfFirst: " + list.indexOfFirst { it % 2 == 0 }) // indexOfFirst: 람다식에 일치하는 첫 요소에 인덱스 반환, 없으면 -1
    println("lastIndexOf: " + listRepeated.lastIndexOf(5)) // lastIndexOf: 주어진 요소에 일치하는 가장 마지막 인덱스 반환
    println("indexOfLast: " + list.indexOfLast { it % 2 == 0 }) // indexOfLast: 람다식에 일치하는 마지막 요소의 인덱스 반환, 없으면 -1
    println("single: " + listPair.single { it.second == 100 }) // single: 람다식에 일치하는 요소 하나 반환
    println("singleOrNull: " + listPair.singleOrNull { it.second == 500 }) // singleOrNull: 식에 일치하지 않거나 일치하는 요소가 2개 이상이면 null 반환
    println("binarySearch: " + list.binarySearch(3)) // binarySearch: 요소에 대해 이진 탐색 후 인덱스 반환
    println("find: " + list.find { it > 3 }) // find: 식을 만족하는 첫번째 검색된 요소 반환, 없으면 null
}
