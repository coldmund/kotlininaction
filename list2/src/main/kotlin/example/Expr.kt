package example

interface Expr

class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr

fun eval(e: Expr):Int {
  if(e is Num) {
    val n = e as Num
    return  n.value
  }
  if(e is Sum) {
    return  eval(e.right) + eval(e.left)  // smart cast on 'e'
  }

  throw IllegalArgumentException("Unknown expression")
}
