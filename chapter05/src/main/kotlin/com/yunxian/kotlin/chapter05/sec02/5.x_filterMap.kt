package com.yunxian.kotlin.chapter05.sec02.filter

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val numList = listOf(1, 5, -3)
    val tmpNumList = numList.filter { it >= 0 }.map { it * it }
    println(tmpNumList)

    val personList = listOf(Person("A", 25), Person("B", 30), Person("C", 27), Person("D", 30))
    val nameList = personList.filter { it.age >= 0 }.map { Person::name }
    println(nameList)

    val belong27 = { person: Person -> person.age >= 27 }
    println(personList.all(belong27))
    println(personList.any(belong27))
    println(personList.find(belong27))
    println(personList.count(belong27))

    val personGroupList: Map<Int, List<Person>> = personList.groupBy { it.age }
    println(personGroupList)
}