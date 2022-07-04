package com.yunxian.kotlin.chapter09.sec02.asType

fun printSum(c: Collection<*>) {
    val list = c as? List<Int> ?: throw IllegalArgumentException("list is expected")
    println(list.sum())
}

fun printSum1(c: Collection<Int>) {
    if (c is List<Int>) {
        println(c.sum())
    }
}

fun main(args: Array<String>) {
    val list: Collection<Int> = listOf(1, 2)
    printSum(list)
    printSum1(list)

    try {
        printSum(listOf("123", "456"))
    } catch (e: Exception) {
        e.printStackTrace()
    }
}