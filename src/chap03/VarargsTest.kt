package chap03

// 다양한 인자의 개수를 전달받는 함수
fun main() {
    normalVarargs(1, 2, 3, 4)
    normalVarargs(4, 5, 6)
}

fun normalVarargs(vararg counts: Int) {
    for (count in counts) {
        print("$count ")
    }
    print("\n")
}
