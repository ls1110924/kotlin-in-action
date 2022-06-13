fun verifyUserInput(input: String?) {
    if (input.isNullOrEmpty()) {
        println("the input is empty")
    } else {
        println("the input is legal")
    }
}

fun main(args: Array<String>) {
    verifyUserInput(null)
    verifyUserInput("")
    verifyUserInput("222")
}