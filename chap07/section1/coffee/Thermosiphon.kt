package chap07.section1.coffee

// 열사이펀 Thermosiphon 클래스
class Thermosiphon(heater: Heater) : Pump, Heater by heater {
    override fun pump() {
        if (isHot()) {
            println("[Thermosiphon] pumping...")
        }
    }
}
