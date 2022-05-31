package com.yunxian.kotlin.chapter04.sec03.data

class Client(val name: String, val email: String) {

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client) {
            return false
        }
        return name == other.name && email == other.email
    }

    override fun hashCode(): Int {
        return name.hashCode() * 31 + email.hashCode()
    }

    override fun toString(): String {
        return "Client(name = $name, email = $email)"
    }
}

data class Client2(val name: String, val email: String)

fun main(args: Array<String>) {
    val client = Client("A Shuai", "xxx")
    val clientTwo = Client("A Shuai", "xxx")
    println(client)
    println(client == clientTwo)

    val client2 = Client2("A Shuai", "xxx")
    val client2Two = Client2("A Shuai", "xxx")
    println(client2)
    println(client2 == client2Two)
}