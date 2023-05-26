package example

import  geometry.shapes.*

fun main(args: Array<String>) {
  println("Hello, ${if(args.size >0) args[0] else "someone"}!")

  val person = Person("Bob", true)
  println(person.name)
  println(person.isMarried)

  val rectangle = Rectangle(41, 43)
  println(rectangle.isSquere)

  println(createRandomRectangle().isSquere)

  println(Color.BLUE.rgb())
  println(getMnemonic(Color.BLUE))
  println(getWarmth(Color.ORANGE))
  println(mix(Color.BLUE, Color.YELLOW))
  println(mixOptimized(Color.BLUE, Color.YELLOW))

  println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
  println(eval2(Sum(Sum(Num(1), Num(2)), Num(4))))

  iter1()
  iter2()
  iter3()

  fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
  fun isNotDigit(c: Char) = c !in '0'..'9'
  println(isLetter('q'))
  println(isNotDigit('x'))

  fun recognize(c: Char) = when(c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know.."
  }
  println(recognize('8'))

  println("Kotlin" in "Java".."Scala")
  println("Kotlin" in setOf("Java", "Scala"))
}
