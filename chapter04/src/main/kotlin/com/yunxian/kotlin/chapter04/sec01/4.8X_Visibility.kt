internal open class TalkativeButton : Focusable {

    private fun yell() = println("hello")

    protected fun whisper() = println("Let's talk")

}

internal fun TalkativeButton.giveSpeech() {
//    yell()
//    whisper()
}
