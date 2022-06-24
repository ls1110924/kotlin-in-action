package com.yunxian.kotlin.chapter08.sec01.returnfunui

data class Person(val firstName: String, val lastName: String, val phone: String?)

class ContractListFilter {
    var prefix: String = ""
    var onlyWithPhone: Boolean = false

    fun getPredicate(): (Person) -> Boolean {
        val startsWithPrefix = { p: Person -> p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix) }
        if (!onlyWithPhone) {
            return startsWithPrefix
        }
        return { startsWithPrefix(it) && it.phone != null }
    }
}

fun main(args: Array<String>) {
    val persons = arrayListOf(Person("aaa", "bbb", "10"), Person("abb", "ccc", "20"))
    val contractListFilter = ContractListFilter()
    contractListFilter.prefix = "c"
    println(persons.filter(contractListFilter.getPredicate()))
}