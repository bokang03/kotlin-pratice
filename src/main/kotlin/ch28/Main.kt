package com.back.ch28
// with는 객체를 컨텍스트로 가져와 여러 작업을 수행한 후 결과를 반환합니다.
//코틀린에서는 with(객체) { } 형식으로 사용되며, 객체를 수정하는 것이 아니라 작업만 수행하는 점이 apply와 다릅니다.

class Person(
    var name: String,
    var age: Int,
    var weight: Double,
    var salary: Int
) {

    fun increaseAge(years: Int) {
        age += years
    }

    fun increaseWeight(kg: Double) {
        weight += kg
    }

    fun increaseSalary(amount: Int) {
        salary += amount
    }

    fun getInfo() {
        println("이름: $name, 나이: $age, 몸무게: $weight, 연봉: $salary")
    }
}

fun main() {

    val p1 = Person("Alice", 25, 55.5, 3000)

    with(p1) {
        increaseAge(5)
        increaseWeight(3.5)
        increaseSalary(10000)
    }

    p1.getInfo()

}