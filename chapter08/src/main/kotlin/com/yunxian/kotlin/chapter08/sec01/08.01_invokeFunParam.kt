package com.yunxian.kotlin.chapter08.sec01.invoke

fun twoNumOperation(num1: Int, num2: Int, operation: (Int, Int) -> Int) {
    val result = operation(num1, num2)
    println(result)
}

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (i in 0 until length) {
        val c = get(i)
        if (predicate(c)) {
            sb.append(c)
        }
    }
    return sb.toString()
}


fun processNum(operation: (Int) -> Int) {
    println(operation(1))
}

fun processNumUnit(operation: (Int) -> Unit) {
    operation(1)
}

fun main(args: Array<String>) {
    twoNumOperation(1, 2) { i, j -> i + j }
    twoNumOperation(1, 2) { i, j -> i - j }

    val text = "Hello World"
    println(text.filter { it in 'a'..'z' })
}