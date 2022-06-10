package com.yunxian.kotlin.chapter05.sec01.safeas

class Person(val name: String, val age: String) {

    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? Person ?: return false
        return otherPerson.name == name && otherPerson.age == age
    }

    override fun hashCode(): Int = name.hashCode() * 31 + age.hashCode()
}

fun main(args: Array<String>) {
    val one: Person = Person("a", "b")
    val two: Person = Person("a", "b")
    println(one == two)
    println(one === two)
}