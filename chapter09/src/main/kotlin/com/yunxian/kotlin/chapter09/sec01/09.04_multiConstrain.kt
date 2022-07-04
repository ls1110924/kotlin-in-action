package com.yunxian.kotlin.chapter09.sec01.multi

import java.lang.StringBuilder

fun <T> T.ensureTailWithPeriod(): T where T : CharSequence, T : Appendable {
    if (!endsWith('.')) {
        append('.')
    }
    return this
}

fun main(args: Array<String>) {
    val sb = StringBuilder("hello")
    println(sb.ensureTailWithPeriod().toString())
}