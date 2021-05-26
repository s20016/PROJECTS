// Lesson 210520
// Kotlin Practice Problem 1

fun main() {
  val randNum = MutableList(10) { (0..100).random() }
  val newList: MutableList<Any> = ArrayList()
  val seqList: MutableList<Any> = ArrayList()
  var loop = 0

  while (randNum.size >= 1) {
    val smallNum = randNum.minOrNull()

    for (num in randNum)
      seqList.add(if (num == smallNum) "(${num})" else num)

    println("${loop}: $seqList"); seqList.clear()
    newList.add(smallNum.toString())
    randNum.remove(smallNum); loop++
  }

  println("--\n${newList}")
}

// OUTPUT
// 0: [100, 37, 19, 88, (3), 37, 50, 100, 27, 61]
// 1: [100, 37, (19), 88, 37, 50, 100, 27, 61]
// 2: [100, 37, 88, 37, 50, 100, (27), 61]
// 3: [100, (37), 88, (37), 50, 100, 61]
// 4: [100, 88, (37), 50, 100, 61]
// 5: [100, 88, (50), 100, 61]
// 6: [100, 88, 100, (61)]
// 7: [100, (88), 100]
// 8: [(100), (100)]
// 9: [(100)]
// --
// [3, 19, 27, 37, 37, 50, 61, 88, 100, 100]

