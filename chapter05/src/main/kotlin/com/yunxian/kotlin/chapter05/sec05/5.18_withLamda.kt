fun alphabet(): String {
    val sb = StringBuilder()
    return with(sb) {
        for (x in 'A'..'Z') {
            append(x)
        }
        append("\nNow, I know the alphabet")
        toString()
    }
}

fun alphabet1(): String = with(StringBuilder()) {
    for (x in 'A'..'Z') {
        append(x)
    }
    append("\nNow, I know the alphabet")
    toString()
}

fun main(args: Array<String>) {
    println(alphabet())
    println(alphabet1())
}