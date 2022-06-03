fun alphabet3(): String = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet")
}.toString()

fun main(args: Array<String>) {
    println(alphabet3())
}