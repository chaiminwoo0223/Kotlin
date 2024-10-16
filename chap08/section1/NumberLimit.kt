package chap08.section1

// 자료형을 숫자형으로 제한하기
class Calc<T: Number> { // 클래스의 형식 매개변수 제한
    fun plus(arg1: T, arg2: T): Double {
        return arg1.toDouble() + arg2.toDouble()
    }
}

fun main() {
    val calc = Calc<Int>()
    val calc2 = Calc<Double>()
    val calc3 = Calc<Long>()
//  val calc4 = Calc<String>()
    println(calc.plus(10, 20))
    println(calc2.plus(2.5, 3.5))
    println(calc3.plus(5L, 10L))
}
