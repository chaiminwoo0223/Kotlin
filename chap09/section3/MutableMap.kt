package chap09.section3

// 가변형 Map 사용하기
fun main() {
    val capitalCityMap: MutableMap<String, String> = mutableMapOf("Korea" to  "Seoul", "China" to "Beijing", "Japan" to "Tokyo")
    val addData = mutableMapOf("USA" to "Washington") // 키 to 값
    println(capitalCityMap.values) // 값만 출력
    println(capitalCityMap.keys) // 키만 출력

    // 요소의 추가와 삭제
    capitalCityMap.put("UK", "London")
    capitalCityMap.remove("China")
    println(capitalCityMap)

    // Map 객체의 통합
    capitalCityMap.putAll(addData)
    println(capitalCityMap)
}
