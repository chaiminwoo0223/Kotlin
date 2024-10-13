package chap09.section5

// 단순 메소드 체이닝 및 asSequence() 사용하기
fun main() {
    val list1 = listOf(1, 2, 3, 4, 5)
    val listDefault = list1.map { println("map($it) "); it * it }
                           .filter { println("filter($it) "); it % 2 == 0 }
    println(listDefault)
    println()

    val list2 = list1.asSequence()
                     .map { print("map($it) "); it * it }
                     .filter { println("filter($it) "); it % 2 == 0 }
                     .toList()
    println(list2)
}
