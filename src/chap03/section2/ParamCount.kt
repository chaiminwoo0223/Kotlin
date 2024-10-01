package chap03.section2

// 람다식의 매개변수 테스트하기
fun main() {
    // 매개변수 없는 람다식
    noParam({ "Hello World!" })
    noParam({ "Hello World!" })
}

// 매개변수가 없는 람다식이 noParam 함수의 매개변수 out으로 지정됨
fun noParam(out: () -> String) = println(out())
