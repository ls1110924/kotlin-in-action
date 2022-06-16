package com.yunxian.kotlin.chapter07.sec03.forIn

import java.time.LocalDate

operator fun ClosedRange<LocalDate>.iterator() = object : Iterator<LocalDate> {
    var now = start

    override fun hasNext(): Boolean = now <= endInclusive

    override fun next(): LocalDate {
        now = now.plusDays(1)
        return now
    }
}

fun main(args: Array<String>) {
    val now = LocalDate.now()
    val vocation = now..now.plusDays(10)
    for (value in vocation) {
        println(value)
    }
}