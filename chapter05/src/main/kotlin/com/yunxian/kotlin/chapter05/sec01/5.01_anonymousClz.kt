package com.yunxian.kotlin.chapter05.sec01.anonymous

interface OnClickListener {

    fun onCLick(v: View): Unit

}

open class View {}

class Button : View() {

    var onClickListener: OnClickListener? = null

    fun setClickListener(listener: OnClickListener) {
        this.onClickListener = listener
    }

    fun performClick() {
        onClickListener?.onCLick(this)
    }

}

fun main(args: Array<String>) {
    val btn: Button = Button()
    btn.setClickListener(object : OnClickListener {
        override fun onCLick(v: View) {
            println("anonymous class click listener click")
        }
    })
    btn.performClick()
//    btn.setClickListener({ it:View -> println("lamda click listener click") })
    btn.performClick()
}