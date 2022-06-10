package com.yunxian.kotlin.chapter05.sec01.elvis

import com.yunxian.kotlin.chapter05.sec01.safe.countryName

fun strLen(str: String?) = str?.length ?: 0

fun testElvis() {
    println(strLen(null))
    println(strLen(""))
    println(strLen("aaa"))
}

data class Address(val streetAddress: String, val zipCode: String, val city: String, val country: String)
data class Company(val name: String, val address: Address?)
data class Person(val name: String, val company: Company?)

fun Person.countryName(): String = this.company?.address?.country ?: "Unknown"

fun testSequenceNull() {
    val person = Person("AAa", null)
    println(person.countryName())
}

fun printShippingLabel(person: Person?) {
    val address: Address = person?.company?.address ?: throw IllegalArgumentException("No Address")
    with(address) {
        println(streetAddress)
        println("$zipCode $city $country")
    }
    address.apply {
        println(streetAddress)
        println("$zipCode $city $country")
    }
}

fun testElvisThrow() {
    val address = Address("1", "2", "3", "4")
    val company = Company("A", address)
    val person = Person("Test", company)
    printShippingLabel(person)
}

fun main(args: Array<String>) {
    testElvis()
    testSequenceNull()
    testElvisThrow()
}