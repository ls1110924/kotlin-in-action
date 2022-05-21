fun splitFilePath(filepath: String) {
    val path = filepath.substringBeforeLast('/')
    val allName = filepath.substringAfterLast('/')

    val name = allName.substringBeforeLast('.')
    val ext = allName.substringAfterLast('.')
    println(path)
    println(name)
    println(ext)
}

fun splitFilePathByReg(filePath: String) {
    val reg: Regex = """^(.+)/(.+)\.(.+)$""".toRegex()
    val regResult = reg.matchEntire(filePath)
    if (regResult != null) {
        val (path, name, ext) = regResult.destructured
        println(path)
        println(name)
        println(ext)
    }
}

fun main(args: Array<String>) {
    println("Kotlin-Java.Groovy".split("-", "."))
    splitFilePath("/Users/ashuai/WorkSpace/Kotlin/Study/kotlin-in-action/doc.txt")
    splitFilePathByReg("/Users/ashuai/WorkSpace/Kotlin/Study/kotlin-in-action/doc.txt")
}