fun createRunnable(): Runnable {
    return Runnable { println("runable") }
}

fun main(args: Array<String>) {
    val runnable = createRunnable()
    runnable.run()
}