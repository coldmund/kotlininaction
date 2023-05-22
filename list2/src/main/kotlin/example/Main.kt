package example

import  example.Person
import  geometry.shapes.*

fun main(args: Array<String>) {
  println("Hello, ${if(args.size >0) args[0] else "someone"}!")

  val person = Person("Bob", true)
  println(person.name)
  println(person.isMarried)

  val rectangle = Rectangle(41, 43)
  println(rectangle.isSquere)

  println(createRandomRectangle().isSquere)
}
