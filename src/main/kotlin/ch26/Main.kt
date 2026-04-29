package com.back.ch26

fun main() {
    val length = "Hello".also {
        println("Before: $it")
    }.uppercase().also {
        println("After: $it")
    }.length

    println("Length: $length")

    // apply => this를 받고 객체를 반환
    // let => it을 받고 람다의 결과값 반환
    // also => it을 받고 객체를 반환
}