package com.yunxian.kotlin.chapter07.sec05.delegatemap

class Person1 {

    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    val name: String
        get() = _attributes["name"]!!

}

class Person2 {
    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    val name: String by _attributes
}

fun main(args: Array<String>) {
    val attributes = hashMapOf("name" to "A", "test" to "2")
    val person1 = Person1()
    val person2 = Person2()

    for ((key, value) in attributes) {
        person1.setAttribute(key, value)
        person2.setAttribute(key, value)
    }

    println(person1.name)
    println(person2.name)
}