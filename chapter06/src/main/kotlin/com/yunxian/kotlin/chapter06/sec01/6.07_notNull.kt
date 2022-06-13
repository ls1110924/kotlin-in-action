fun printStr(str: String?) {
    val copyStr: String = str!!
    println(copyStr)
}

fun main(args: Array<String>) {
    printStr("111")
    printStr("2")
    printStr(null)
}