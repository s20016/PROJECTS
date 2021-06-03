import java.lang.StringBuilder

// Lesson 210601-210603

fun main() {
  // 210603 ↓↓↓

  // Nullable
  var nullName: String? = null
  // Shorter ver of if nullName != null
  nullName?.let { println(it.length) }

  // Swapping variables
  var (a, b) = listOf<Int>(10, 20)
//  with(a) { a = b; b = this }; println("$a, $b") // 20, 10
//  run { val tmp = a;  a = b; b = tmp }; println("$a, $b") // 20, 10


  // 210601 ↓↓↓
  // Char to String: https://bit.ly/3c6Otem

  val num = listOf<Int>(1, -2, 3, -4, 5, -6, 7)
  val positives = num.filter { x -> x > 0 }
  val negatives = num.filter { it < 0 }

//  println(positives) // [1, 3, 5, 7]
//  println(negatives) // [-2, -4, -6]

  // joinToString
  val chars: List<Char> = listOf('J', 'C', 'T')
  val str1 = chars.joinToString("")

  // String Builder
  val sb = StringBuilder()
  chars.forEach { sb.append(it) }
//  val str2 = sb.toString(); println(str2)

}