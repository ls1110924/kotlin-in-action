package com.yunxian.kotlin.chapter04.sec01.inner

import java.io.Serializable

interface State : Serializable

interface View {
    fun getCurrentState(): State

    fun restoreState(state: State): Void
}

class Button : View {

    override fun getCurrentState(): State {
        return ButtonState()
    }

    override fun restoreState(state: State): Void {
        TODO("Not yet implemented")
    }

    class ButtonState : State {

    }

}

class Outer {

    fun getInner(): Inner {
        return Inner()
    }

    fun getInner2() = Inner()

    inner class Inner {

        fun getOuterReference(): Outer = this@Outer

        override fun toString(): String {
            return "Inner"
        }
    }

    override fun toString(): String {
        return "Outer"
    }
}

fun main(args: Array<String>) {
    val outer = Outer()
    val inner = outer.getInner()
    println(outer)
    println(inner)
    println(inner.getOuterReference())
}