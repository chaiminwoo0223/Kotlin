package chap05.section4

// this와 super를 사용하는 부 생성자
open class Person {
    constructor(firstName: String) {
        println("[Person] firstName: $firstName")
    }

    constructor(firstName: String, age: Int) {
        println("[Person] firstName: $firstName, age: $age")
    }
}

class Developer : Person {
    constructor(firstName: String): this(firstName, 10) {
        println("[Developer] $firstName")
    }

    constructor(firstName: String, age: Int): super(firstName, age) {
        println("[Developer] firstName: $firstName, age: $age")
    }
}

fun main() {
    val sean = Developer("Sean")
}
