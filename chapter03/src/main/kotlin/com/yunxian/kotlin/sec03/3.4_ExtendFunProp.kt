package com.yunxian.kotlin.sec03

fun String.lastChar(): Char = if (this.isEmpty()) ' ' else this[this.length - 1]
val String.lastChar: Char
    get() = if (this.isEmpty()) ' ' else this[this.length - 1]

var StringBuilder.lastChar: Char
    get() = if (this.isEmpty()) ' ' else this[this.length - 1]
    set(value: Char) = this.setCharAt(if (this.isEmpty()) 0 else this.length - 1, value)

fun <T> Collection<T>.joinString(separator: String, prefix: String = "", suffix: String = ""): String {
    val sb = StringBuilder(prefix)
    for ((index, ele) in withIndex()) {
        if (index > 0) sb.append(separator)
        sb.append(ele)
    }
    return sb.append(suffix).toString()
}

open class View {
    open fun onClick() = println("the view click")
}

class Button : View() {
    override fun onClick() = println("the button click")
}

fun View.showOff() = println("this is a view")

fun Button.showOff() = println("this is a button")

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
    println("Kotlin".lastChar)
    println(listOf("1", "2").joinString(",", "[", "]"))

    println()
    val view: View = Button()
    // 覆写
    view.onClick()
    // 没有被覆写
    view.showOff()

    val sb = StringBuilder("Kotlin")
    sb.lastChar = 'K'
    println(sb.toString())
    sb.append("ABC")
    println(sb.lastChar)
    println(sb)
}