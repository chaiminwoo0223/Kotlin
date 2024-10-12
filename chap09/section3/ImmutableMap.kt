package chap09.section3

// 불변형 Map 사용하기
fun main() {
    val langMap: Map<Int, String> = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")
    for ((key, value) in langMap) { // 키와 값의 쌍을 출력
        println("key=$key, value=$value")
    }
    println("langMap[22] = ${langMap[22]}") // 키 22에 대한 값 출력
    println("langMap.get(22) = ${langMap.get(22)}") // 위와 동일한 표현
    println("langMap.keys = ${langMap.keys}") // 맵의 모든 키 출력
}
