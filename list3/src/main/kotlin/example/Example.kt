package example

const val UNIX_LINE_SEPARATOR = "\n"

fun list3_1() {
  fun <T> Collection<T>.joinToString(
      separator: String = ", ",
      prefix: String = "",
      postfix: String = ""
  ): String {
    val result = StringBuilder(prefix)
    for((index, element) in this.withIndex()) {
      if(index > 0)
        result.append(separator)
      result.append(element)
    }
    result.append(postfix)
    return  result.toString()
  }

  val list = listOf(1, 2, 3)
  println(list.joinToString(separator = "; ", prefix = "{", postfix = "}"))
  println(list.joinToString())
  println(list.joinToString("; "))
  println(list.joinToString(postfix = ";", prefix = "# "))
}
