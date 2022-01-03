package com.yunxian.kotlin.sec03

import java.lang.Exception

fun mix1(c1: Color, c2: Color) = when {
    (c1 == Color.RED && c2 == Color.YELLOW) || (c1 == Color.YELLOW && c2 == Color.RED) -> "Orange"
    (c1 == Color.BLUE && c2 == Color.YELLOW) || (c1 == Color.YELLOW && c2 == Color.BLUE) -> "Green"
    (c1 == Color.BLUE && c2 == Color.VIOLET) || (c1 == Color.VIOLET && c2 == Color.BLUE) -> "Indigo"
    else -> throw Exception("Dirty color")
}

fun main(args: Array<String>) {
    println(mix1(Color.RED, Color.YELLOW))
    println(mix1(Color.YELLOW, Color.RED))
    println(mix1(Color.BLUE, Color.RED))
}