package com.back.ch23

class Person {
    var name: String = ""
    var age: Int = 0

    fun printInfo() {
        println("$name is $age years old.")
    }
}

fun main() {
    val person = Person().apply {
        name = "Alice"
        age = 30
    }

    person.printInfo()
}