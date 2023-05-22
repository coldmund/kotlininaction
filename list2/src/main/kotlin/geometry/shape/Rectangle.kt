package geometry.shapes

import  java.util.Random

class Rectangle(val height:Int, val width:Int) {
  val isSquere:Boolean
    get() = height == width
}

fun createRandomRectangle(): Rectangle {
  val random = Random()
  return  Rectangle(random.nextInt(), random.nextInt())
}
