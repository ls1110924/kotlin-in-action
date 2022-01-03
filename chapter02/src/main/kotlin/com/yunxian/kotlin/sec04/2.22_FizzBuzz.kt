package com.yunxian.kotlin.sec04

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> println("FizzBuzz")
    i % 3 == 0 -> println("Fizz")
    i % 5 == 0 -> println("Buzz")
    else -> println(i)
}

fun main(args: Array<String>) {
    for (i in 1..100) {
        fizzBuzz(i)
    }
    println()
    for (i in 100 downTo 1 step 2) {
        fizzBuzz(i)
    }
}