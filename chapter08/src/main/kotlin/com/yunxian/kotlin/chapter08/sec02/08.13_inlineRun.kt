package com.yunxian.kotlin.chapter08.sec02.inlinerun

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    try {
        // error
//        val t = action
        lock.lock()
        return action()
    } finally {
        lock.unlock()
    }
}

fun main(args: Array<String>) {
    val lock = ReentrantLock()
    val text = synchronized(lock) { "hello" }
    println(text)

    val testLambda: () -> String = { "error" }
    val text1 = synchronized(lock, testLambda)
    val text2 = testLambda()
    println(text1)
    println(text2)
}