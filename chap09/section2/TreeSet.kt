package chap09.section2

import java.util.TreeSet

// TreeSet의 초기화
fun main() {
    val intsSortedSet: TreeSet<Int> = sortedSetOf(4, 1, 7, 2)
    intsSortedSet.add(6)
    intsSortedSet.remove(1)
    println("intsSortedSet = ${intsSortedSet}")
    intsSortedSet.clear() // 모든 요소 삭제
    println("intsSortedSet = ${intsSortedSet}")
}
