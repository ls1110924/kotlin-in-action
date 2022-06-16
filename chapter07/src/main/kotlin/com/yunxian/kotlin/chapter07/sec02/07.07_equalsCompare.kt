package com.yunxian.kotlin.chapter07.sec02.equals

class Point(val x: Int, val y: Int) {

    override fun hashCode(): Int {
        return x * 31 + y
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        val otherPoint = other as? Point ?: return false
        return otherPoint.x == x && otherPoint.y == y
    }

}

fun main(args: Array<String>) {
    val first = Point(1, 2)
    val second = Point(1, 2)
    println(first == second)
    println(first != second)
    println(first == null)
}