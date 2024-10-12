package chap09.section2

// HashSet의 초기화
fun main() {
    val intsHashSet: HashSet<Int> = hashSetOf(6, 3, 4, 7)
    intsHashSet.add(5) // 추가
    intsHashSet.remove(6) // 삭제
    println(intsHashSet)
}
