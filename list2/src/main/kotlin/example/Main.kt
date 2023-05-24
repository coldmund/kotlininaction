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

fun mix(c1: Color, c2: Color) =
  when(setOf(c1, c2)) {
    setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
    setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
    setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
    else -> throw Exception("Dirty color")
  }
