package com.yunxian.kotlin.chapter06.sec02.basic

data class Person(val name: String, val age: Int? = null) {

    fun isOlderThan(that: Person): Boolean? {
        if (age == null || that.age == null) {
            return null
        }
        return age > that.age
    }

}

fun main(args: Array<String>) {
    val one = Person("A", 20)
    val two = Person("B", 19)
    val three = Person("C")

    println(one.isOlderThan(two))
    println(one.isOlderThan(three))
}