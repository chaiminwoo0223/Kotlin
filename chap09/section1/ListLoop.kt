package chap09.section1

// 각 요소 순환하기
fun main() {
    val fruits = listOf("apple", "banana", "kiwi")
    for (fruit in fruits) {
        println(fruits)
    }
    println()

    for (index in fruits.indices) { // 인덱스 지정
        println("fruits[$index] = ${fruits[index]}")
    }
    println()

    for (index in fruits.indices) { // 인덱스 지정
        if (index % 2 == 0) println("fruits[$index] = ${fruits[index]}") // 짝수만 고르기
    }
    println()

    var index = 0
    while (index < fruits.size) {
        println("fruits[$index] = ${fruits[index]}")
        index++
    }
}
