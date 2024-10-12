package chap09.section1

// 불변형 List를 가변형으로 변환하기
fun main() {
    val names: List<String> = listOf("one", "two", "three") // 불변형 List 초기화
    val mutableNames = names.toMutableList() // 새로운 가변형 List가 만들어짐
    mutableNames.add("four")
    println(mutableNames)
}
