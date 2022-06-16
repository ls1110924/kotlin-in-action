package com.yunxian.kotlin.chapter07.sec03.subscript

data class Point(val x: Int, val y: Int)

operator fun Point.get(index: Int): Int = when (index) {
    0 -> x
    1 -> y
    else -> throw IllegalArgumentException()
}

class MutablePoint(var x: Int, var y: Int) {

    override fun toString(): String {
        return "[x = $x, y = $y]"
    }
}

operator fun MutablePoint.set(index: Int, value: Int) {
    when (index) {
        0 -> x = value
        1 -> y = value
        else -> throw IllegalArgumentException()
    }
}

fun main(args: Array<String>) {
    val point = Point(3, 4)
    println(point[0])
    println(point[1])

    val mutablePoint = MutablePoint(1, 1)
    println(mutablePoint)
    mutablePoint[0] = 3
    mutablePoint[1] = 3
    println(mutablePoint)
}