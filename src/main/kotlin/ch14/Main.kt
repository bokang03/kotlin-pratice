package com.back.ch14

fun sayHello(name: String = "Guest") {
    println("Hello, $name")
}

fun main() {
    sayHello() // 기본값 사용
    sayHello("Alice")
}