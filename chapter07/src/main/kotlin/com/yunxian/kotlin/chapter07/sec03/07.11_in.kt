package com.yunxian.kotlin.chapter07.sec03.inOpe

data class Point(val x: Int, val y: Int)

data class Rectangle(val leftTop: Point, val rightBottom: Point)

operator fun Rectangle.contains(point: Point): Boolean =
    point.x in leftTop.x until rightBottom.x && point.y in leftTop.y until rightBottom.y

fun main(args: Array<String>) {
    val first = Point(1, 1)
    val second = Point(4, 6)
    val rectangle = Rectangle(first, second)

    println(Point(2, 2) in rectangle)
    println(Point(1, 1) in rectangle)
    println(Point(4, 6) in rectangle)
    println(Point(4, 5) in rectangle)
    println(Point(3, 6) in rectangle)
}