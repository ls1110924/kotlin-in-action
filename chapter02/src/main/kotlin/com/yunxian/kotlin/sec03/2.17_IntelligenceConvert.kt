package com.yunxian.kotlin.sec03

import java.lang.Exception

interface Expr
class Num(val num: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        return e.num
    } else if (e is Sum) {
        return eval(e.left) + eval(e.right)
    } else {
        throw Exception("")
    }
}

fun eval1(e: Expr): Int =
    if (e is Num) {
        e.num
    } else if (e is Sum) {
        eval(e.left) + eval(e.right)
    } else {
        throw Exception("")
    }

fun eval2(e: Expr): Int = when (e) {
    is Num -> e.num
    is Sum -> eval2(e.left) + eval2(e.right)
    else -> throw Exception("")
}

fun evalWithLogging(e: Expr): Int =
    when (e) {
        is Num -> {
            println("num: ${e.num}")
            e.num
        }
        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum: $left + $right")
            left + right
        }
        else -> throw Exception("")
    }

fun main(args: Array<String>) {
    println(eval(Sum(Num(1), Sum(Num(2), Num(3)))))
    println(eval1(Sum(Num(1), Sum(Num(2), Num(3)))))
    println(eval2(Sum(Num(1), Sum(Num(2), Num(3)))))
    println(evalWithLogging(Sum(Num(1), Sum(Num(2), Num(3)))))
}