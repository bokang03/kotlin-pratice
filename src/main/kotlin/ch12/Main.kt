package com.back.ch12

data class Person(
    val name: String,
    val age: Int
) {}

fun main() {
    val p1 = Person("Alice", 29)
    val p2 = Person("Alice", 29)

    println(p1)  // 자동 생성된 toString() 메서드 사용
    println(p1 == p2) // 자동 생성된 equals() 메서드 사용. ==로 사용해도 된다.
}