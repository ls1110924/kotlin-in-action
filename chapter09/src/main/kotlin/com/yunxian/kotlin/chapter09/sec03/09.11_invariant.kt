package com.yunxian.kotlin.chapter09.sec03.invariant

open class Animal {

    fun feed() {
        println("feed")
    }

}

class Cat : Animal() {
    fun cleanLitter() {
        println("clean")
    }
}

class Herd<out T : Animal>(val animals: List<T>) {

    val size: Int
        get() = animals.size

    operator fun get(i: Int): T = animals[i]

}

fun feedAll(herd: Herd<Animal>) {
    for (i in 0 until herd.size) {
        herd[i].feed()
    }
}

fun takeCareOfCats(herd: Herd<Cat>) {
    for (i in 0 until herd.size) {
        herd[i].cleanLitter()
    }
    feedAll(herd)
}


fun main(args: Array<String>) {
    val animals = listOf(Animal(), Animal())
    val herd = Herd(animals)
    feedAll(herd)

    val cats = listOf(Cat(), Cat())
    val catHerd = Herd(cats)
    takeCareOfCats(catHerd)
}