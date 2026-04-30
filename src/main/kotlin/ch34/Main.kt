package com.back.ch34

open class Animal { // 이제 상속 가능
    open fun makeSound() {
        println("Some generic animal sound")
    }
}

class Dog : Animal() {
    override fun makeSound() { // 메서드 오버라이딩 가능
        println("Bark! Bark!")
    }
}

fun main() {
    val dog = Dog()
    dog.makeSound() // 출력: Bark! Bark!
}