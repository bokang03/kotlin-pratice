package com.back.ch31

val lazyValue: String by lazy {
    println("initializing")
    "Hello"
}

fun main() {
    println(lazyValue)
    println(lazyValue)
}