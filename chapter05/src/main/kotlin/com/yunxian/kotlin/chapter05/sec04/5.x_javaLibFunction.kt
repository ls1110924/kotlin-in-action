package com.yunxian.kotlin.chapter05.sec04

import com.yunxian.kotlin.chapter05.*

fun main(args: Array<String>) {

    val btn = Button()
    btn.setOnClickListener { println("onClick") }
    btn.performClick()

}