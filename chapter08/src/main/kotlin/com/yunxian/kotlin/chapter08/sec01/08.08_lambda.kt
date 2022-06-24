package com.yunxian.kotlin.chapter08.sec01.lambda

enum class OS { ANDROID, IOS, WINDOWS, MACOS, LINUX }

data class SiteVisit(val path: String, val duration: Double, val os: OS)

fun filterWindows(visitors: List<SiteVisit>) {
    val average = visitors.filter { it.os === OS.WINDOWS }
        .map { it.duration }
        .average()
    println("windows average --> $average")
}

fun filterByOs(visitors: List<SiteVisit>, os: OS) {
    val average = visitors.filter { it.os === os }
        .map { it.duration }
        .average()
    println("$os average --> $average")
}

fun filterByOss(visitors: List<SiteVisit>, oss: Set<OS>) {
    val average = visitors.filter { it.os in oss }
        .map { it.duration }
        .average()
    println("oss average --> $average")
}

fun filterByFun(visitors: List<SiteVisit>, predicate: (SiteVisit) -> Boolean) {
    val average = visitors.filter(predicate)
        .map { it.duration }
        .average()
    println("predicate fun average --> $average")
}

fun main(args: Array<String>) {
    val visitors = listOf(
        SiteVisit("/", 34.0, OS.WINDOWS),
        SiteVisit("/", 22.0, OS.MACOS),
        SiteVisit("/login", 12.0, OS.WINDOWS),
        SiteVisit("/signup", 8.0, OS.IOS),
        SiteVisit("/", 16.3, OS.ANDROID)
    )

    filterWindows(visitors)
    filterByOs(visitors, OS.IOS)
    filterByOss(visitors, setOf(OS.IOS, OS.ANDROID))
    filterByFun(visitors) { it.os === OS.WINDOWS && it.path == "/login" }
}