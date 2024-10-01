package chap03.section2

// 2개의 람다식을 매개변수로 가진 함수의 사용
fun main() {
    twoLambda({ a, b -> "First $a $b" }, { "Second $it" })
    twoLambda({ a, b -> "First $a $b" }) { "Second $it" }
}

fun twoLambda(first: (String, String) -> String, second: (String) -> String) {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}
