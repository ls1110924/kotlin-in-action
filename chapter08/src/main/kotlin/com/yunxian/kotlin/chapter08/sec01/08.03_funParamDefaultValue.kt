package com.yunxian.kotlin.chapter08.sec01.defaultV

fun <E> Collection<E>.joinToString1(
    prefix: String,
    postfix: String,
    separator: String,
    transform: (E) -> String = { it.toString() }
): String {
    val sb = StringBuilder(prefix)
    for ((index, element) in withIndex()) {
        if (index > 0) sb.append(separator)
        sb.append(transform(element))
    }
    return sb.append(postfix).toString()
}

fun <E> Collection<E>.joinToString2(
    prefix: String,
    postfix: String,
    separator: String,
    transform: ((E) -> String)? = null
): String {
    val sb = StringBuilder(prefix)
    for ((index, element) in withIndex()) {
        if (index > 0) sb.append(separator)
        sb.append(transform?.invoke(element) ?: element.toString())
    }
    return sb.append(postfix).toString()
}

fun main(args: Array<String>) {
    val list = arrayListOf("aaA", "bBb")
    println(list.joinToString1("[", "]", ","))
    println(list.joinToString1("[", "]", ",") { it.uppercase() })
    println(list.joinToString1("[", "]", ",", { it.lowercase() }))

    println(list.joinToString2("[", "]", ","))
    println(list.joinToString2("[", "]", ",") { it.uppercase() })
    println(list.joinToString2("[", "]", ",", { it.lowercase() }))
}