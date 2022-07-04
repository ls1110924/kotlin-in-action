package com.yunxian.kotlin.chapter09.sec02.reifiled

inline fun <reified T> isT(value: Any) = value is T

fun filterByInstance() {
    val list = listOf("123", 12, "465", 'a')
    println(list.filterIsInstance<String>())
    println(list.filterIsInstance(String::class.java))
}

fun main(args: Array<String>) {
    println(isT<String>(""))
    println(isT<String>(123))

    filterByInstance()
}