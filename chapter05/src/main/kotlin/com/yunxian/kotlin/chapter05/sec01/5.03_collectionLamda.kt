package com.yunxian.kotlin.chapter05.sec01.collection

data class User(val name: String, val age: Int)

fun main(args: Array<String>) {

    val strList = arrayListOf(User("A", 10), User("B", 15))

    println(strList.maxBy({ user: User -> user.age }))
    println(strList.maxBy { user: User -> user.age })

    println(strList.maxBy { it.age })
//    println(strList.maxBy { User::age })

    println({ x: Int, y: Int -> x + y }(3, 4))

    val result = strList.joinToString { user: User -> user.name }
    println(result)

}