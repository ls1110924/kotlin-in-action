sealed class Expr {

    class Number(val value: Int) : Expr()

    class Sum(val left: Expr, val right: Expr) : Expr()

}

fun eval(e: Expr): Int = when (e) {
    is Expr.Number -> e.value
    is Expr.Sum -> eval(e.left) + eval(e.right)
}

fun eval1(e: Expr): Int {
    when (e) {
        is Expr.Number -> {
            return e.value
        }
        is Expr.Sum -> {
            return eval(e.left) + eval(e.right)
        }
    }
}

fun main(args: Array<String>) {
    val expr = Expr.Sum(Expr.Number(1), Expr.Sum(Expr.Number(2), Expr.Number(3)))

    println(eval(expr))
    println(eval1(expr))
}