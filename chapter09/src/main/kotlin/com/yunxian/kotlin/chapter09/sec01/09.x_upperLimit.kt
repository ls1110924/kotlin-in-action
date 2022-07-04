package com.yunxian.kotlin.chapter09.sec01.upper

class Processor<T> {
    fun process(value: T): Int? {
        return value?.hashCode()
    }
}

class Processor1<T : Any> {
    fun process(value: T): Int {
        return value.hashCode()
    }
}

fun main(args: Array<String>) {
    val processor = Processor<String?>()
    println(processor.process(null))

    val processor1: Processor1<String> = Processor1()
    println(processor1.process("null"))
}