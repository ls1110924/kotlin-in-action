package com.yunxian.kotlin.chapter04.sec02.test

open class User constructor(name: String) {

    val name: String

    init {
        this.name = name
    }

}

class User1(_name: String) {
    val name = _name
}

class User2(val name: String)

class TwitterUser(name: String, val phone: String) : User(name)

open class View {
    val ctx: String
    val attr: String?
    val style: String?

    constructor(ctx: String) {
        this.ctx = ctx
        this.attr = null
        this.style = null
    }

    constructor(ctx: String, attr: String) {
        this.ctx = ctx
        this.attr = attr
        this.style = null
    }

    constructor(ctx: String, attr: String, style: String) {
        this.ctx = ctx
        this.attr = attr
        this.style = style
    }
}

class Button : View {
    constructor(ctx: String) : super(ctx) {
    }

    constructor(ctx: String, attr: String) : this(ctx) {
        println("")
    }

    constructor(ctx: String, attr: String, style: String) : super(ctx, attr, style) {

    }
}

fun main(args: Array<String>) {
    println(User("111").name)
    println(User1("222").name)
    println(User2("333").name)
}