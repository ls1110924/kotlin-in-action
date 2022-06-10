package com.yunxian.kotlin.chapter05.sec01.lazyinit

class MyService {
    fun performAction(): String = "hello"
}

class MyTest {

    private lateinit var myService: MyService

    fun setUp() {
        myService = MyService()
    }

    fun testKey() {
        println(myService.performAction())
    }

}

fun main(args: Array<String>) {
    val test: MyTest = MyTest()
    test.setUp()
    test.testKey()
}
