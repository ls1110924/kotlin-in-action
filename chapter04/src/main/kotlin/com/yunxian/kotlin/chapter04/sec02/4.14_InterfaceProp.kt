package com.yunxian.kotlin.chapter04.sec02.num14

fun getFacebookName(): String {
    return "aaa"
}

interface User {
    val nickname: String
    var color: Int
    val age: Int
        get() = nickname.hashCode()
}

class PrivateUser(override val nickname: String, override var color: Int) : User

class SubscribeUser(val email: String, _color: Int = 1) : User {

    override val nickname: String
        get() = email.substringBefore('@')

    override var color: Int = _color
        get() {
            println("get color")
            return field
        }
        set(value) {
            println("set color")
            field = value
        }

    override val age: Int
        get() = 2

}

class FacebookUser : User {

    override val nickname: String = getFacebookName()

    override var color: Int = 0

}

fun main(args: Array<String>) {
    val user = SubscribeUser("ls1110924@163.com")
    println(user.color)
    user.color = 2

}