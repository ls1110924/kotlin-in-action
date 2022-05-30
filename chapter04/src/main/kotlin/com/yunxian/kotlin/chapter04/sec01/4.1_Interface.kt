interface Clickable {
    fun onClick()

    fun showOff() = println("I'm clickable")
}

interface Focusable {
    fun setFocus(focus: Boolean) = println("I ${if (focus) "got" else "lost"} focus")

    fun showOff() = println("I'm focusable")
}

class Button : Clickable, Focusable {
    override fun onClick() = println("the button click")

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main(args: Array<String>) {
    val btn = Button()
    btn.onClick()
    btn.showOff()
    btn.setFocus(true)
    btn.setFocus(false)
}