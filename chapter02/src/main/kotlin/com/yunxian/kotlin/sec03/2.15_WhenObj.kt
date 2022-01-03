package com.yunxian.kotlin.sec03

import java.lang.Exception

fun mix(c1: Color, c2: Color): String = when (setOf(c1, c2)) {
    setOf(Color.RED, Color.YELLOW) -> "ORANGE"
    setOf(Color.YELLOW, Color.BLUE) -> "GREEN"
    setOf(Color.BLUE, Color.VIOLET) -> "INDIGO"
    else -> throw Exception("Dirty color")
}

fun main(args: Array<String>) {
    println(mix(Color.RED, Color.YELLOW))
    println(mix(Color.YELLOW, Color.RED))
    println(mix(Color.BLUE, Color.RED))
}