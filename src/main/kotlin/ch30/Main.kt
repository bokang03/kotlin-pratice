package com.back.ch30

class Example {
    lateinit var value: String// 나중에 초기화 할 수 있기 때문에 not null 유지
}

fun main() {

    val example = Example()

    example.value = "hi"

    println(example.value.length) // 만약 초기화 되지 않았다면, UninitializedPropertyAccessException 발생

}