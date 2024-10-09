package chap07.section2

// 익명 객체를 위한 인터페이스 추가하기
interface Switcher {
    fun on(): String
}

// 이너 클래스의 바깥 클래스의 멤버 접근
class Smartphone(val model: String) {
    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}Gb" // 바깥 클래스의 프로퍼티 접근
    }

    fun powerOn(): String {
        class Led(val color: String) { // 지역 클래스 선언
            fun blink() = "Blinking $color on $model" // 외부의 프로퍼티는 접근 가능
        }
        val powerStatus = Led("Red") // 여기에서 지역 클래스가 사용됨
        val powerSwitch = object : Switcher { // 익명 객체를 사용해 Switcher의 on()을 구현
            override fun on(): String {
                return powerStatus.blink()
            }
        }
        return powerSwitch.on() // 익명 객체의 메소드 사용
    }
}

fun main() {
    val mySdcard = Smartphone("S7").ExternalStorage(32)
    println(mySdcard.getInfo())
    val myphone = Smartphone("Note9")
    myphone.ExternalStorage(128)
    println(myphone.powerOn())
}
