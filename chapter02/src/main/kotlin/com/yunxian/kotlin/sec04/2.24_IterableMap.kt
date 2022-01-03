package com.yunxian.kotlin.sec04

import java.util.*

val binaryMap = TreeMap<Char, String>()

fun initMap() {
    for (i in 'a'..'f') {
        binaryMap[i] = Integer.toBinaryString(i.toInt())
    }
}

fun main(args: Array<String>) {
    initMap()

    for ((letter, binary) in binaryMap) {
        println("$letter = $binary")
    }

    println()

    val list = listOf("10", "11", "1001")
    for ((index, ele) in list.withIndex()) {
        println("$index = $ele")
    }
}