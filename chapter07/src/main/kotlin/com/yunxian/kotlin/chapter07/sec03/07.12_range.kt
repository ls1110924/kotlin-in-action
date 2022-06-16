package com.yunxian.kotlin.chapter07.sec03.range

import java.time.LocalDate

fun main(args: Array<String>) {
    val date = LocalDate.now()
    val vocation = date..date.plusDays(10)
    println(date.plusWeeks(1) in vocation)
}