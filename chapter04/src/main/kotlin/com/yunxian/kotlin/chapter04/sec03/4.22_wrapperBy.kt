package com.yunxian.kotlin.chapter04.sec03.wrapper

class CollectionDelegate<T> : Collection<T> {

    val innerList: List<T> = arrayListOf()

    override val size: Int
        get() = innerList.size

    override fun contains(element: T) = innerList.contains(element)

    override fun containsAll(elements: Collection<T>): Boolean = innerList.containsAll(elements)

    override fun isEmpty(): Boolean = innerList.isEmpty()

    override fun iterator(): Iterator<T> = innerList.iterator()
}

class CollectionDelegate2<T>(innerList: List<T> = arrayListOf()) : Collection<T> by innerList

class CountedSet<T>(private val innerSet: MutableSet<T> = hashSetOf()) : MutableSet<T> by innerSet {

    private var counted: Int = 0

    override fun add(element: T): Boolean {
        counted++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        counted += elements.size
        return innerSet.addAll(elements)
    }

}