package com.yunxian.kotlin.chapter08.sec03.localreturn

data class Person(val name: String, val age: Int)

fun filterNormal(list: List<Person>) {
    for (p in list) {
        if (p.name == "Alice") {
            println("Found")
            return
        }
    }
    println("Not Found")
}

fun filterByLambda(list: List<Person>) {
    list.forEach() {
        if (it.name == "Alice") {
            println("Found")
            return
        }
    }
    println("Not Found")
}

fun main(args: Array<String>) {
    val list = arrayListOf(Person("Alice", 23), Person("Bob", 42))
    filterNormal(list)
    filterByLambda(list)
}