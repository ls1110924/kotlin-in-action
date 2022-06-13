fun <T> printHash(t: T) {
    println(t?.hashCode())
}

fun <T : Any> printHash1(t: T) {
    println(t.hashCode())
}

fun main(args: Array<String>) {
    printHash(null)
    printHash("")
//    printHash1(null)
    printHash1("")
}