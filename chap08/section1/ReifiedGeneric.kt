package chap08.section1

// reified를 이용한 결정되지 않은 제네릭 자료형의 처리
inline fun <reified T> getType(value: Int): T {
    println(T::class)
    println(T::class.java)
    return when (T::class) { // 받아들인 제네릭 자료형에 따라 반환
        Float::class -> value.toFloat() as T
        Int::class -> value as T
        else -> throw IllegalStateException("${T::class} is not supported!")
    }
}

fun main() {
    val result = getType<Float>(10)
    println("result = $result")
}
