package chap09.section1

// 가변형 List 사용하기
fun main() {
    val stringList: ArrayList<String> = arrayListOf<String>("Hello", "Kotlin", "Wow")
    stringList.add("Java") // 추가
    stringList.remove("Hello") // 삭제
    println(stringList)
}
