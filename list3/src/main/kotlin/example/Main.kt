package example

import strings.lastChar

fun main(args: Array<String>) {
  list3_1()

  println("kotlin".lastChar)

  val sb = StringBuilder("Kotlin?")
  sb.lastChar = '!'
  println(sb)
}
