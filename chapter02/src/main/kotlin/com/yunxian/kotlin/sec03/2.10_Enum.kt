package com.yunxian.kotlin.sec03

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 0, 0),
    YELLOW(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(0, 0, 255),
    VIOLET(0, 0, 255);

    val color: Int
        get() = (r * 256 + g) * 256 + b

    fun getColor1() = (r * 256 + g) * 256 + b
}

fun main(args: Array<String>) {
    println(Color.RED.color)
    println(Color.RED.getColor1())
    println(Color.BLUE.color)
    println(Color.BLUE.getColor1())
}