package com.back.ch9

fun main() {
    val ages = mutableMapOf("Peter" to 24, "Clark" to 31, "Bruce" to 32)

    ages.put("Barry", 25)

    for ((key, value) in ages) {
        println("$key is $value years old.")
    }

}