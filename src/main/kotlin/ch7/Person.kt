package com.back.ch7

class Person(val name: String) {
    fun greet() {
        println("Hello, my name is $name")
    }
}

fun main() {
    val person = Person("Alice")
    person.greet()
}