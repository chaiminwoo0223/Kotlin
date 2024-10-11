package chap08.section2

// 필요한 정보만 골라내어 변경하기
fun main() {
    val fruits = arrayOf("banana", "avocado", "apple", "kiwi")
    fruits.filter { it.startsWith("a") }
          .sortedBy { it }
          .map { it.uppercase() }
          .forEach { println(it) }
}
