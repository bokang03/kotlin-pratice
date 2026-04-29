package com.back.ch7

class Person {

    var name: String = ""

    constructor(name: String) {
        this.name = name
    }

    fun greet() {
        println("Hello, my name is $name")
    }
}

fun main() {
    val person = Person("Alice")
    person.greet()
}