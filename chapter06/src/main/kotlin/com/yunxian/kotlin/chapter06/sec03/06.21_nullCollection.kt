package com.yunxian.kotlin.chapter06.sec03.collection

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader): List<Int?> {
    val result = arrayListOf<Int?>()
    for (str in reader.lineSequence()) {
        result.add(str.toIntOrNull())
    }
    return result
}

fun addValidNumber(list: List<Int?>) {
    var sum = 0
    var invalidNum = 0
    for (i in list) {
        if (i == null) {
            invalidNum++
        } else {
            sum += i
        }
    }
    println("sum=$sum, invalidNum=$invalidNum")
}

fun addValidNum(list: List<Int?>) {
    var validList: List<Int> = list.filterNotNull()
    val sum = validList.sum()
    val invalidNum = list.size - validList.size
    println("sum=$sum, invalidNum=$invalidNum")
}

fun main(args: Array<String>) {
    val stringReader = StringReader("123\nsd\nwerfw\n3\n4534\n2ss")
    val list = readNumber(BufferedReader(stringReader))
    println(list)
    addValidNumber(list)
    addValidNum(list)
}