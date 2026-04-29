package com.back.ch21

fun main() {
    val name: String? = null
    val displayName: String = name ?: "Guest"

    println(displayName)
}