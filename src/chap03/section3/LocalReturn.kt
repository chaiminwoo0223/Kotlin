package chap03.section3

// return으로 람다식 빠져나오기
fun main() {
    shortFunc(3) {
        println("First call: $it")
        return
    }
}
