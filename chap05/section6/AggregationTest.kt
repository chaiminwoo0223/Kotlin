package chap05.section6

// 집합 관계 나타내기
class Pond(_name: String, _members: MutableList<Duck>) {
    val name = _name
    val members = _members
    constructor(_name: String): this(_name, mutableListOf<Duck>())
}

class Duck(val name: String)

fun main() {
    // 두 개체는 서로 생명주기에 영향을 주지 않음
    val pond = Pond("myFavorite")
    val duck1 = Duck("duck1")
    val duck2 = Duck("duck2")

    // 연못에 오리를 추가 - 연못에 오리가 집합
    pond.members.add(duck1)
    pond.members.add(duck2)

    // 연못에 있는 오리들
    for (duck in pond.members) {
        println(duck.name)
    }
}
