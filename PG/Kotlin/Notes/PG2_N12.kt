// Lesson 210601
// Kotlin Practice Problem 1

fun numToString(x: Float, y: Float): String {
  val res = x + y
  return res.toString()
}

fun main() {
  val (x, y) = listOf(3.141592F, 2.718281F)
  println(numToString(x, y))
}