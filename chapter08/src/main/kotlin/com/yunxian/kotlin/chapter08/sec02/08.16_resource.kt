package com.yunxian.kotlin.chapter08.sec02.resource

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

fun withLock() {
    val lock = ReentrantLock()
    val result = lock.withLock { "HelloWorld" }
    println(result)
}

fun withLock1(): String {
    val lock = ReentrantLock()
    lock.withLock {
        return "HelloWorld"
    }
}

fun use(path: String) {
    val result = BufferedReader(FileReader(path)).use { it.readLine() }
    println(result)
}

fun use1(path: String): String {
    BufferedReader(FileReader(path)).use {
        return it.readLine()
    }
}

fun main(args: Array<String>) {
    println(withLock())
    println(withLock1())

    use("1.txt")
    use1("1.txt")
    println(use1("1.txt"))
}