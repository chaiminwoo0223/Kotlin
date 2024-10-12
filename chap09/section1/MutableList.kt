package chap09.section1

// 코틀린의 MutableList 사용하기
fun main() {
    val mutableList: MutableList<String> = mutableListOf<String>("Kildong", "Dooly", "Chelsu")
    mutableList.add("Ben") // 추가
    mutableList.removeAt(1) // 인덱스 1번 삭제
    mutableList[0] = "Sean" // 인덱스 0번 변경
    println(mutableList)

    // 자료형의 혼합
    val mutableListMixed = mutableListOf("Android", "Apple", 5, 6, 'x')
    println(mutableListMixed)
}
