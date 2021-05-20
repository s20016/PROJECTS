// Lesson 210520
// Kotlin Practice Problem 3

fun searchIndex(arr: List<Int>, item: Int): Int {
  return arr.indexOf(item)
}

fun main() {
  val randNum = MutableList(10) { (0..200).random() }
  val numIndex: MutableList<Any> = ArrayList()
  val numList = (0..100).toList()

  randNum.sorted().forEach { i ->
    numIndex.add(searchIndex(numList, i))
  }

  println("Random Sorted: ${randNum.sorted()}")
  println("Num Index $numIndex")
}

// OUTPUT
// Random Sorted: [20, 65, 78, 89, 102, 109, 131, 139, 146, 185]
// Num Index [20, 65, 78, 89, -1, -1, -1, -1, -1, -1]