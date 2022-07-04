package com.yunxian.kotlin.chapter09.sec01.invoke

fun declaration() {
    val authors = listOf<String>()
    val authors1: List<String> = listOf()
    val authors2 = listOf("123")

    println(authors)
    println(authors1)
    println(authors2)
}

fun invoke() {
    val charList: List<Char> = ('a'..'z').toList<Char>()
    val subList: List<Char> = charList.slice<Char>(1..5)
    println(subList)
}

fun invokeLambda() {
    val authors = listOf("123", "456", "", "789")
    println(authors.filter { it.isNotEmpty() })
}

val <T> List<T>.penultimate: T?
    get() = if (size >= 2) {
        get(size - 2)
    } else {
        null
    }

fun <T> List<T>.penultimateFun(): T? = if (size >= 2) get(size - 2) else null

fun main(args: Array<String>) {

    declaration()
    invoke()
    invokeLambda()

    val authors2 = listOf("123", "456", "789")
    println(authors2.penultimate)
    println(authors2.penultimateFun())

}