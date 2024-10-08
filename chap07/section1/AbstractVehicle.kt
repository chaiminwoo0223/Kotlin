package chap07.section1

// 추상 클래스 Vehicle 사용해 보기
abstract class Vehicle(val name: String, val color: String, val weight: Double) {
    abstract var maxSpeed: Double // 추상 프로퍼티(반드시 하위 클래스에서 재정의하고 초기화해야 함)
    var year = "2018" // 일반 프로퍼티(초깃값인 상태를 저장할 수 있음)
    abstract fun start() // 추상 메소드(반드시 하위 클래스에서 구현해야 함)
    abstract fun stop() // 추상 메소드(반드시 하위 클래스에서 구현해야 함)

    // 일반 메소드
    fun displaySpecs() {
        println("Name: $name, Color: $color, Weight: $weight, Year: $year, Max speed: $maxSpeed")
    }
}

class Car(name: String, color: String, weight: Double, override var maxSpeed: Double) : Vehicle(name, color, weight) {
    override fun start() {
        println("Car Started") // 코드의 구현
    }

    override fun stop() {
        println("Car Stopped") // 코드의 구현
    }
}

class MotorCycle(name: String, color: String, weight: Double, override var maxSpeed: Double) : Vehicle(name, color, weight) {
    override fun start() {
        println("Bike Started") // 코드의 구현
    }

    override fun stop() {
        println("Bike Stopped") // 코드의 구현
    }
}

fun main() {
    val car = Car("SuperMatiz", "yellow", 1110.0, 270.0)
    val motor = MotorCycle("DreamBike", "red", 173.0, 100.0)
    car.year = "2013"

    car.displaySpecs()
    car.start()
    car.stop()
    motor.displaySpecs()
    motor.start()
    motor.stop()
}
