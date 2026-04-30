package com.back.ch35

open class Animal {
    open fun eat() {

    }
}

interface Pet {
    fun play()
}

class Dog : Animal(), Pet {
    override fun eat() {
        println("eat")
    }

    override fun play() {
        println("play")
    }

}

fun main() {
    val dog = Dog()

    dog.eat()
    dog.play()

}