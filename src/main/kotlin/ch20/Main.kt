package com.back.ch20

fun main() {
    val names = listOf("Alice", "Bob", "Charlie")

    names.map {
        "Hello, $it"
    }
        .forEach(::println)

}