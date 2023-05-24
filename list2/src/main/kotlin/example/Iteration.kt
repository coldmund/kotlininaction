package example

import java.util.TreeMap

fun fizzBuzz(i: Int) = when {
  i % 15 == 0 -> "FizzBuzz "
  i % 3 == 0 -> "Fizz "
  i % 5 == 0 -> "Buzz "
  else -> "$i "
}

fun iter1() {
  for(i in 1..100) {
    print(fizzBuzz(i))
  }
  println()
}

fun iter2() {
  for(i in 100 downTo 1 step 2) {
    print(fizzBuzz(i))
  }
  println()
}

fun iter3() {
  val binaryReps = TreeMap<Char, String>()
  for(c in 'A'..'F') {
    val binary = Integer.toBinaryString(c.toInt())
    binaryReps[c] = binary
  }
  for((letter, binary) in binaryReps) {
    println("$letter = $binary")
  }
}
