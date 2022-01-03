package com.yunxian.kotlin.sec05

import java.io.BufferedReader

fun readNumber(reader: BufferedReader): Int? {
    try {
        val str = reader.readLine()
        return Integer.parseInt(str)
    } catch (e: Exception) {
        return null
    } finally {
        reader.close()
    }
}

fun readNumber1(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: java.lang.Exception) {
        return
    }
    println(number)
}