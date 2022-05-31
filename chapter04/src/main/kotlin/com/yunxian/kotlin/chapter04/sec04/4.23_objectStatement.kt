package com.yunxian.kotlin.chapter04.sec04.objectstatement

import java.io.File
import java.util.*
import kotlin.Comparator

object Payroll {

    val allEmployees: MutableList<String> = arrayListOf()

    fun calculateSalary() {
        for (employee in allEmployees) {
            println("employee --> $employee")
        }
    }

}

object CaseInsensitiveFileComparator : Comparator<File> {

    override fun compare(o1: File, o2: File): Int {
        return o1.absolutePath.compareTo(o2.absolutePath, true)
    }
}

fun main(args: Array<String>) {
    Payroll.allEmployees.add("111")
    Payroll.calculateSalary()

    val fileList: List<File> = listOf(File("/user"), File("/library"))
    Collections.sort(fileList, CaseInsensitiveFileComparator)
    println(fileList)
}