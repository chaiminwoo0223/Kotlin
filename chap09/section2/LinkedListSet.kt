package chap09.section2

// LinkedHashSet의 초기화
fun main() {
    val intsLinkedHashSet: java.util.LinkedHashSet<Int> = linkedSetOf(35, 21, 76, 26, 75)
    intsLinkedHashSet.add(4)
    intsLinkedHashSet.remove(21)
    println(intsLinkedHashSet)
    intsLinkedHashSet.clear()
    println(intsLinkedHashSet)
}
