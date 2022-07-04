package com.yunxian.kotlin.chapter09.sec01.constraint

fun <T : Number> T.getHalf(): Double = toDouble() / 2

fun <T : Comparable<T>> max(first: T, second: T): T = if (first >= second) first else second

fun main(args: Array<String>) {

    val num = 1.2
    println(num.getHalf())

    println(max("Hello", "Ok"))

}