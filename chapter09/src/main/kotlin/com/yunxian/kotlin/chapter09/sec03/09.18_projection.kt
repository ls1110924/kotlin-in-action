package com.yunxian.kotlin.chapter09.sec03.projection

import kotlin.reflect.KClass

interface FieldValidator<in T> {
    fun validate(input: T): Boolean
}

object DefaultStringValidator : FieldValidator<String> {

    override fun validate(input: String): Boolean = input.isNotEmpty()
}

object DefaultIntValidator : FieldValidator<Int> {
    override fun validate(input: Int): Boolean = input >= 0
}

object Validators {

    private val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()

    fun <T : Any> register(clz: KClass<T>, validator: FieldValidator<T>) {
        validators[clz] = validator
    }

    operator fun <T : Any> get(clz: KClass<T>): FieldValidator<T> {
        return validators[clz] as? FieldValidator<T> ?: throw IllegalArgumentException()
    }

}

fun main(args: Array<String>) {


    Validators.register(String::class, DefaultStringValidator)
    Validators.register(Int::class, DefaultIntValidator)

    println(Validators[String::class].validate(""))
    println(Validators[String::class].validate("1"))
    println(Validators[Int::class].validate(-1))
    println(Validators[Int::class].validate(0))
    println(Validators[Int::class].validate(1))

}
