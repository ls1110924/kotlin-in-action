package com.yunxian.kotlin.chapter04.sec04.companion.extension

class User(val name: String) {

    companion object {}

}

fun User.Companion.test() {
    println("test")
}

fun main(args: Array<String>) {
    User.test()
}