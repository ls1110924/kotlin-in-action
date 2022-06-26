package com.yunxian.kotlin.chapter08.sec03.tagreturn

data class Person(val name: String, val age: Int)

fun filterByNameTag(list: List<Person>) {
    list.forEach tag@{
        if (it.name == "Alice") {
            println("found")
            return@tag
        } else {
            println("${it.name} is not Alice")
        }
    }
}

fun filterByAnonymousTag(list: List<Person>) {
    list.forEach {
        if (it.name == "Alice") {
            println("found")
            return@forEach
        } else {
            println("${it.name} is not Alice")
        }
    }
}

fun main(args: Array<String>) {
    val list = arrayListOf(
        Person("Alice", 23),
        Person("Bob", 42)
    )
    filterByNameTag(list)
    filterByAnonymousTag(list)
}