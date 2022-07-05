package com.yunxian.kotlin.chapter09.sec03.contravariant

fun <T : R, R> copyData(source: List<T>, destination: MutableList<R>) {
    for (e in source) {
        destination.add(e)
    }
}

fun <T> copyData1(source: MutableList<out T>, destination: MutableList<T>) {
    for (e in source) {
        destination.add(e)
    }
}

fun <T> copyData2(source: MutableList<T>, destination: MutableList<in T>) {
    for (e in source) {
        destination.add(e)
    }
}

fun main(args: Array<String>) {

    val sourceList = mutableListOf(1, 2, 3)
    val destinationList = mutableListOf<Any>()
    copyData(sourceList, destinationList)
    println(destinationList)

    val destinationList1 = mutableListOf<Any>()
    copyData1(sourceList, destinationList1)
    println(destinationList1)
    destinationList1.clear()
    copyData2(sourceList, destinationList1)
    println(destinationList1)

}