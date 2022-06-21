package com.yunxian.kotlin.chapter07.sec05.lazy

data class Email(val content: String)

fun loadEmails(): List<Email> {
    return arrayListOf(Email("1"), Email("2"))
}

class Person1 {

    private var _emails: List<Email>? = null

    val emails: List<Email>
        get() {
            if (_emails == null) {
                _emails = loadEmails()
            }
            return _emails!!
        }

}

class Person2 {
    val emails: List<Email> by lazy { loadEmails() }
}

fun main(args: Array<String>) {
    val person1 = Person1()
    println(person1.emails)
    println(Person2().emails)
}