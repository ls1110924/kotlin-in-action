package com.yunxian.kotlin.sec01

fun main(args: Array<String>) {
    println(setOf<String>().javaClass)
    println(setOf("").javaClass)
    println(setOf("", "").javaClass)
    println(hashSetOf<String>().javaClass)
    println(hashSetOf("").javaClass)
    println(linkedSetOf<String>().javaClass)
    println()
    println(mapOf(1 to "1", 2 to "two"))
    println(mapOf(1 to "1", 2 to "two").javaClass)
}