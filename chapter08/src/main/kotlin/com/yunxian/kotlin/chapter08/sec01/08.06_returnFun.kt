package com.yunxian.kotlin.chapter08.sec01.returnfun

enum class Delivery { STANDARD, EXPEDITED }

class Order(val itemCount: Int)

fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double {
    if (delivery == Delivery.STANDARD) {
        return { order -> 1.2 * order.itemCount }
    }
    return { order: Order -> 6 + 2.1 * order.itemCount }
}

fun main(args: Array<String>) {
    val order = Order(10)
    println(getShippingCostCalculator(Delivery.STANDARD)(order))
    println(getShippingCostCalculator(Delivery.EXPEDITED)(order))
}