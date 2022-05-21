fun <E : Comparable<E>> Collection<E>.max(): E? {
    var max: E? = null
    println("111")
    for ((index, value) in this.withIndex()) {
        if (index == 0) {
            max = value
        } else if (max != null && max < value) {
            max = value
        }
    }
    return max
}

fun <E> customList(vararg value: E): List<E> {
    val list = arrayListOf<E>()
    for (ele in value) {
        list.add(ele)
    }
    return list
}

infix fun <K, V> K.toC(value: V): Pair<K, V> = Pair(this, value)

fun main(args: Array<String>) {
    val list = listOf(1, 2, 99, 24, 12)
    println(list.max())
    println(customList("12", "34", "56"))
    val pair = "1" to "A"
    println(pair)
    val (key, value) = pair
    println(key)
    println(value)
}