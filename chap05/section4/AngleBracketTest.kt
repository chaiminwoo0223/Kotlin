package chap05.section4

// 앵글 브래킷을 사용한 이름 중복 해결하기
open class A {
    open fun f() = println("A Class f()")
    fun a() = println("A Class a()")
}

interface B {
    fun f() = println("B Interface f()") // 인터페이스는 기본적으로 open임
    fun b() = println("B Interface b()")
}

class C : A(), B {
    override fun f() = println("C class f()") // 컴파일되려면 f()가 오버라이딩되어야 함

    fun test() {
        f() // 현재 클래스의 f()
        b() // 인터페이스 B의 b()
        super<A>.f() // A 클래스의 f()
        super<B>.f() // B 인터페이스의 f()
    }
}

fun main() {
    val c = C()
    c.test()
}
