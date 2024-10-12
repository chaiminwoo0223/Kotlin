package chap09.section1

// 불변형 List 사용하기
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val names = listOf("one", "two", "three")
    val mixedTypes = listOf("Hello", 1, 2.445, 's')
    for (number in numbers) println(number)
    println()
    for (name in names) println(name)
    println()
    for (mixedType in mixedTypes) println(mixedType)
}
