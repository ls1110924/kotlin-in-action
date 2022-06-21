package com.yunxian.kotlin.chapter07.sec04.deconstruction

class Point(val x: Int, val y: Int) {

    operator fun component1(): Int = x

    operator fun component2(): Int = y

}

data class FileNameComponent(val name: String, val extension: String)

fun splitFileName(fileName: String): FileNameComponent {
    val name = fileName.substringBeforeLast('.')
    val extension = fileName.substringAfterLast('.')
    return FileNameComponent(name, extension)
}

fun main(args: Array<String>) {
    val point = Point(1, 2)
    val (x, y) = point
    println("$x - $y")

    val (name, extension) = splitFileName("test.kt")
    println("$name - $extension")

    val map = mapOf("A" to 1, "B" to 2)
    for ((key, value) in map) {
        println("$key -> $value")
    }
}