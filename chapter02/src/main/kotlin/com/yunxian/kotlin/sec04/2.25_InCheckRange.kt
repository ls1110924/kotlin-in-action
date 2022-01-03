package com.yunxian.kotlin.sec04

import java.lang.Exception

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun inRangeCheck() {
    println(isLetter('q'))
    println(isLetter('1'))
    println(isNotDigit('q'))
    println(isNotDigit('1'))
}

fun inWhenCheck(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter"
    else -> throw Exception("")
}

fun main(args: Array<String>) {
    inRangeCheck()

    println(inWhenCheck('a'))
    println(inWhenCheck('8'))
    println(inWhenCheck('-'))
}