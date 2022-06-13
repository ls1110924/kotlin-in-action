package com.yunxian.kotlin.chapter06.sec01

fun sayHello(person: Person) {
    println("hello ${person.name ?: "anyone"}")
}

fun main(args: Array<String>) {
    sayHello(Person("A Shuai"))
    sayHello(Person(null))
}