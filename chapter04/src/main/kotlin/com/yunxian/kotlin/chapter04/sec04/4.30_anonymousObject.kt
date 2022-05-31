interface MouseListener {

    fun onLeftClick()

    fun onRightClick()

}

interface KeyboardListener {

    fun onEnterClick()

}

class ListenerManager {

    fun addListener(listener: MouseListener) {
        listener.onLeftClick()
        listener.onRightClick()
    }

}

fun main(args: Array<String>) {
    val manager = ListenerManager()
    manager.addListener(object : MouseListener {
        override fun onLeftClick() {
            println("onLeftClick")
        }

        override fun onRightClick() {
            println("onRightClick")
        }
    })
}