abstract class Animated {

    abstract fun animate()

    open fun stopAnimating() {
        println("stopAnimating")
    }

    fun animateTwice() = println("animateTwice")

}

class AnimatedImpl : Animated() {

    override fun animate() {
        println("sub class animate")
    }

    override fun stopAnimating() {
        super.stopAnimating()
        println("sub class stopAnimating")
    }
}

fun main(args: Array<String>) {
    val animated = AnimatedImpl()
    animated.animate()
    animated.stopAnimating()
    animated.animateTwice()
}