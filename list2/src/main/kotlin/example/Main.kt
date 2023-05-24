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
}

fun getMnemonic(color: Color) =
  when(color) {
    Color.RED -> "Richard"
    Color.ORANGE -> "Of"
    Color.YELLOW -> "York"
    Color.GREEN -> "Gave"
    Color.BLUE -> "Battle"
    Color.INDIGO -> "In"
    Color.VIOLET -> "Vain"
  }

fun getWarmth(color: Color) = when(color) {
  Color.RED, Color.ORANGE, Color.YELLOW -> "Warm"
  Color.GREEN -> "neutral"
  Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
}
