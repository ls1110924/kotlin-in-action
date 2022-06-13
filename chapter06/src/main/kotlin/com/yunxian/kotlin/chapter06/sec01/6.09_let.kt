package com.yunxian.kotlin.chapter06.sec01.let

fun sendEmail(email: String) {
    println(email)
}

fun main(args: Array<String>) {
    var email:String? = "hello"
    email?.also { it -> sendEmail(it) }
    email?.let { sendEmail(it) }
    email = null
    email?.let { sendEmail(it) }
}