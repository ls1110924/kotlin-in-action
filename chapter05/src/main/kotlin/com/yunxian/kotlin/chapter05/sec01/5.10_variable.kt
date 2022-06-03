package com.yunxian.kotlin.chapter05.sec01.variable

fun printMsgWithPrefix(prefix: String, msgList: List<String>) {
    msgList.forEach { println("$prefix $it") }
}


data class Person(val name: String, val age: Int) {
    fun getRealAge(): Int = age
}

fun getAgeFirst(person: Person) = person.age

fun main(args: Array<String>) {
    val msgList = listOf("403", "404")
    printMsgWithPrefix("error", msgList)

    // 成员引用
    val getAge = Person::age
    val getAge1 = { person: Person -> person.age }
    val getAge2 = Person::getRealAge

    // 顶层函数引用
    val getAge3 = ::getAgeFirst

    // 构造函数引用
    val createPerson = ::Person

    val person = Person("A", 10)
    println(getAge(person))
    println(getAge1(person))
    println(getAge2(person))
    println(getAge3(person))

    val person1 = createPerson("B", 15)
    println(getAge3(person1))


}