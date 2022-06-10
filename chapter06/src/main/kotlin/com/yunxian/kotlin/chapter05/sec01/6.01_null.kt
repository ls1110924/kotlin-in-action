fun strLen(str: String?): Int = if (str === null) 0 else str.length


fun main(args: Array<String>) {
    var test: String? = null
    println(strLen(test))
    test = "111"
    println(strLen(test))
}