package com.yunxian.kotlin.chapter05.sec02.sequence

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val list: List<Person> = listOf(Person("Aaa", 26), Person("Bob", 29), Person("Cilly", 24), Person("A Shuai", 32))

    val tmp = list.filter {
        println("filter-->$it")
        it.age >= 25
    }.map {
        println("map-->$it")
        it.name
    }
    println("sequence")
    println(tmp)
    val tmp1 = list.asSequence()
        .filter {
            println("filter-->$it")
            it.age >= 25
        }
        .map {
            println("map-->$it")
            it.name
        }
        .toList()
    println(tmp1)

    val sum = generateSequence(0) { it + 1 }
        .takeWhile { it <= 100 }
        .map { it * it }
        .sum()
    println(sum)
}