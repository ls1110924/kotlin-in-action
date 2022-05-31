package com.yunxian.kotlin.chapter04.sec04.companion

class A {

    companion object {
        fun bar() {
            println("companion bar")
        }
    }

}

class User private constructor(val name: String) {

    companion object {
        fun generateSubscribeUser(email: String): User = User(email.substringBefore('@'))

        fun generateFacebookUser(userId: String): User {
            return User(userId + "")
        }
    }

    override fun toString(): String {
        return "user --> $name"
    }
}

fun main(args: Array<String>) {
    A.bar()

    println(User.generateSubscribeUser("ls1110924@gmail.com").name)
    println(User.generateFacebookUser("123"))
}