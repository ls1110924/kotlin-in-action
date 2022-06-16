package com.yunxian.kotlin.chapter07.sec01.unitary

data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus(): Point = Point(-x, -y)

operator fun  Point.inc():Point = Point(x + 1, y + 1)

fun main(args: Array<String>) {
    var point = Point(1, 2)
    println(-point)
    println(point++)
    println(++point)
}