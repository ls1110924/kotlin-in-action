package com.yunxian.kotlin.chapter07.sec01.binary

data class Point(val x: Int, val y: Int) {

    operator fun plus(other: Point): Point = Point(x + other.x, y + other.y)

}

operator fun Point.minus(other: Point): Point = Point(x - other.x, y - other.y)

operator fun Point.times(time: Double): Point = Point((x * time).toInt(), (y * time).toInt())

operator fun Char.times(num: Int): String = this.toString().repeat(num)

fun main(args: Array<String>) {
    val first = Point(1, 2)
    val second = Point(3, 4)
    println(first + second)
    println(first - second)
    println(first * 4.0)
    println('a' * 10)

    var third = Point(3, 3)
    third += Point(1, 1)
    println(third)

    val firstList = arrayListOf(1, 2)
    println(firstList)
    firstList += 3
    println(firstList)
    val secondList = arrayListOf(4)
    println(firstList + secondList)
}