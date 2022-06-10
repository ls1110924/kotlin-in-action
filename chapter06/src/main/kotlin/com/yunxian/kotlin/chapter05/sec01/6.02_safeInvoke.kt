package com.yunxian.kotlin.chapter05.sec01.safe

fun printAllCaps(str: String?) {
    val result = str?.toUpperCase()
    println(result)
}

fun testNullFun() {
    printAllCaps("aaa")
    println(null)
}

data class Employee(val name: String, val boss: Employee? = null)

fun testNullProp() {
    val boss = Employee("Boss")
    val developer = Employee("Developer", boss)
    println(boss.boss?.name)
    println(developer.boss?.name)
}

data class Address(val streetAddress: String, val zipCode: String, val city: String, val country: String)
data class Company(val name: String, val address: Address?)
data class Person(val name: String, val company: Company?)

fun Person.countryName(): String {
    val country: String? = this.company?.address?.country
    return if (country == null) "Unknown" else country
}

fun testSequenceNull() {
    val person = Person("AAa", null)
    println(person.countryName())
}

fun main(args: Array<String>) {
    testNullFun()
    testNullProp()
    testSequenceNull()
}