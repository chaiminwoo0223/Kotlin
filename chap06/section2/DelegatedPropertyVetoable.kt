package chap06.section2

import kotlin.properties.Delegates

fun main() {
    var max: Int by Delegates.vetoable(0) { // 초깃값은 0
        property, oldValue, newValue -> newValue > oldValue // 조건에 맞지 않으면 거부권 행사
    }

    println(max) // 0
    max = 10
    println(max) // 10
    max = 5 // 기존값이 새 값보다 크므로 5를 재할당하지 않음(false)
    println(max) // 10
}
