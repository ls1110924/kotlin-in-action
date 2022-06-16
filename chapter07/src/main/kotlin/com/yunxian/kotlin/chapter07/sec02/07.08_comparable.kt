package com.yunxian.kotlin.chapter07.sec02.comparable

data class Person(val firstName: String, val secondName: String) : Comparable<Person> {

    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::firstName, Person::secondName)
    }
}

fun main(args: Array<String>) {
    val tom = Person("tom", "green")
    val jim = Person("jim", "red")
    println(tom > jim)
    println(tom >= jim)
    println(tom < jim)
    println(tom <= jim)
}