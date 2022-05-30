open class RichButton : Clickable {

    fun disable() {
        println("disable")
    }

    open fun animate() {
        println("animate")
    }

    override fun onClick() {
        println("onCLick")
    }
}

open class VeryRichButton : RichButton() {
    final override fun animate() {
        super.animate()
        println("very rich animate")
    }

    override fun onClick() {
        super.onClick()
        println("very rich onClick")
    }
}

open class VeryVeryRichButton : VeryRichButton() {

    override fun onClick() {
        super.onClick()
        println("very very rich onClick")
    }
}