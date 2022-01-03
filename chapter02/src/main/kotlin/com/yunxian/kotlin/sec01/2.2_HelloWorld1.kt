package com.yunxian.kotlin.sec01

fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "bob"
    println("Hello $name")
    println("Hello ${if (args.isNotEmpty()) args[0] else "bob"}")
}