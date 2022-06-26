package com.yunxian.kotlin.chapter08.sec03.anonymous

import com.yunxian.kotlin.chapter08.sec03.localreturn.filterByLambda
import com.yunxian.kotlin.chapter08.sec03.localreturn.filterNormal

data class Person(val name: String, val age: Int)

fun findAlice(list: List<Person>) {
    list.forEach(fun(p) {
        if (p.name == "Alice") {
            println("Found")
        } else {
            println("${p.name} is not ALice")
        }
    })
}

fun find30Age(list: List<Person>) {
    val result = list.filter(fun(p): Boolean {
        return p.age >= 30
    })
    println(result)
}

fun find30Age1(list: List<Person>) {
    val result = list.filter(fun(p) = p.age >= 30)
    println(result)
}

fun main(args: Array<String>) {
    val list = arrayListOf(
        Person("Alice", 23),
        Person("Bob", 42)
    )
    findAlice(list)
    find30Age(list)
    find30Age1(list)
}