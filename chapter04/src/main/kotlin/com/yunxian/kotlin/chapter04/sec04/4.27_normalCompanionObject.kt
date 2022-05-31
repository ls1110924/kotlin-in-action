package com.yunxian.kotlin.chapter04.sec04.normalcompanion

interface JSONFactory<T> {

    fun fromJSON(json: String): T

    fun toJSOn(t: T): String

}

class Person(val name: String) {

    companion object Loader : JSONFactory<Person> {

        override fun fromJSON(json: String): Person {
            return Person(json)
        }

        override fun toJSOn(t: Person): String {
            return t.name
        }
    }

}

fun loadFromJSON(factory: JSONFactory<Person>, json: String): Person = factory.fromJSON(json)

fun main(args: Array<String>) {
    val person: Person = loadFromJSON(Person, "111")
    println(person.name)
}