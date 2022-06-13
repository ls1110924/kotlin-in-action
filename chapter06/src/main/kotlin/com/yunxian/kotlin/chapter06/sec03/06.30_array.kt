package com.yunxian.kotlin.chapter06.sec03.array

fun main(args: Array<String>) {

    val charArray = Array<Char>(26) { index -> 'a' + index }
    println(charArray.joinToString())

    val strings = arrayListOf("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray()))

    val one = IntArray(5)
    val two = intArrayOf(0, 0, 0, 0, 0)
    val three = IntArray(5) { 0 }
    println(one.joinToString())
    println(two.joinToString())
    println(three.joinToString())

}