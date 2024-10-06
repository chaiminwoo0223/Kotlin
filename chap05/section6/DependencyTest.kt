package chap05.section6

// 의존 관계 나타내기
class Patient2(val name: String, val id: Int) {
    fun doctorList(d: Doctor2) {
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor2(val name: String, val p: Patient2) {
    val customerId = p.id

    fun patientList() {
        println("Doctor: %name, Patient: ${p.name}")
        println("Patient Id: $customerId")
    }
}

fun main() {
    val patient2 = Patient2("Kildong", 1234)
    val doc2 = Doctor2("KimSabu", patient2)
    doc2.patientList()
}
