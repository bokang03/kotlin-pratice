package com.back.ch5

fun main(args: Array<String>) {
    for(i in 0 until  5) {
        println("Count: ${i}")
    }

    for(i in 0 ..  4) {
        println("Count: ${i}")
    }

    for(i in 4 downTo 0) {
        println("Count: ${i}")
    }

    for(i in 0 until 5 step 2) {
        println("Count step2: ${i}")
    }


    val numbers = listOf(1, 2, 3, 4, 5)

    for(i in numbers) {
        println("Number: ${i}")
    }
}