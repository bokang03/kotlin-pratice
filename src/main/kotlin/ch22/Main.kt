package com.back.ch22

fun main() {

    val obj: Any = "Hello"

    if(obj is String) {
        println(obj.length)
    }

}