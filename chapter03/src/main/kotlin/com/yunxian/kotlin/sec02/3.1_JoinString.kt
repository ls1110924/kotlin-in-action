package com.yunxian.kotlin.sec02

var counter: Int = 0
const val counter1: Int = 0
var name: Int = 0

fun <T> joinString(collection: Collection<T>, separator: String, prefix: String, suffix: String): String {
    counter++
    val sb: StringBuilder = StringBuilder(prefix);
    for ((index, str) in collection.withIndex()) {
        if (index > 0) sb.append(separator)
        sb.append(str)
    }
    return sb.append(suffix).toString()
}

fun <T> joinString1(
    collection: Collection<T>,
    separator: String = ",",
    prefix: String = "",
    suffix: String = ""
): String {
    val sb: StringBuilder = StringBuilder(prefix);
    for ((index, str) in collection.withIndex()) {
        if (index > 0) sb.append(separator)
        sb.append(str)
    }
    return sb.append(suffix).toString()
}

fun main(args: Array<String>) {
    val set = setOf(1, 2, 3)
    println(joinString(set, ",", "[", "]"))
    println(joinString(set, prefix = "[", suffix = "]", separator = ","))
    println()
    println(joinString1(set, ",", "[", "]"))
    println(joinString1(set))
    println(joinString1(set, separator = ";"))
    println(joinString1(set, ";"))
    println(joinString1(set, prefix = "*"))
}