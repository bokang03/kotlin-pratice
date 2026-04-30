package com.back.ch39

class Person(val name: String, val age: Int) {
    init {
        println("Person 객체가 생성되었습니다: $name, $age")
    }
}

fun main() {
    val person = Person("Alice", 25)
}