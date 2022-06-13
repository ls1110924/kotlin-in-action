package com.yunxian.kotlin.chapter06.sec02.unit

interface Processor<T> {
    fun process(): T
}

class UnitProcessor : Processor<Unit> {

    override fun process() {
        println("11")
    }
}

fun main(args: Array<String>) {
    val processor: Processor<Unit> = UnitProcessor()
    processor.process()
}


