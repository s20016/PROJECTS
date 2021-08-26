// Lesson 210512
// Kotlinスタートブック【第４章】

fun main() {
  // ARRAY
  val numL1 = arrayOfNulls<Int>(5)
  val numL2: Array<Int> = arrayOf(0, 1, 2, 3, 4)
  // val numL2 = arrayOf(0, 1, 2, 3, 4)

  // LIST
  val numL3: List<Int> = listOf(0, 1, 2)
  // println(numL3) // [0, 1, 2]
  // println(numL2.size) // 5
  // println(numL2[0]) // 0

  // SET
  val numL4: MutableSet<Int> = mutableSetOf(0, 1, 2, 3, 4)
  // println(numL4.size) // 5

  // DICTIONARY (Map)
  val numL5: MutableMap<String, Int> = mutableMapOf(
    "twenty" to 20,
    "thirty" to 30,
    "ninety" to 90
  )
  // println(numL5) // {twenty=20, thirty=30, fifty=50}
  // println(numL5["ninety"]) // 90


  // RANGE
  // !in = "not in"
  // IntRange = num < num

  val rangeL: IntRange = 12..15
  // println(12 !in rangeL) // false
  // println(rangeL.toList()) // [12, 13, 14, 15]
  // println((0..5).reversed().toList()) // [5, 4, 3, 2, 1, 0]
  // println((5 downTo 0).toList())
  // println((100 downTo 0 step 25).toList()) // [100, 75, 50, 25, 0]

  val rangeL2: IntProgression = 5 downTo 0
  // println(rangeL2.toList()) // [5, 4, 3, 2, 1, 0]


  // IF STATEMENT
//    if (1 in -1..0) println("やっはろー")
//    else println("ああ") // ああ

  // SWITCH STATEMENT
  val var1 = 7
  val str1: String = when (7) {
    1 -> "ONE"
    2, 3 -> "TWO"
    in 4..5 -> "THREE"
    else -> "${var1}: NOT IN OPTION"
  }
//    println(str1) // 7: NOT IN OPTION

  // WHEN
  val var2 = 90
  val str2: String = when {
    var2 >= 90 -> "S"
    var2 >= 80 -> "A"
    var2 >= 70 -> "B"
    var2 >= 60 -> "C"
    else -> "D"
  }
//    println(str2) // S

  // FOR LOOP
  for (x in 0..9) {
    println(x)
  }

}
