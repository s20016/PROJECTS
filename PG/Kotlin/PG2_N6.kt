// Lesson 210520
// Kotlin Practice Problem 2

fun getPrime(num: Int): Boolean {
  for (i in 2..num / 2) return (num % i != 0)
  return false
}

fun main() {
  val (numStart, numEnd) = listOf(142, 162) // RANGE
  val compoDivs: MutableList<Any> = ArrayList()
  val (newPrime, newCompo) = listOf<MutableList<Int>> (
    ArrayList(), ArrayList()
  )

  for (i in numStart..numEnd)
    if (getPrime(i)) newPrime.add(i)
    else newCompo.add(i)

  newCompo.forEach { num ->
    val tmp: MutableList<Int> = ArrayList()
    for (i in 1..num)
      if (num == i) break
      else if (num % i == 0) tmp.add(i)
    compoDivs.add(tmp)
  }

  println("Prime Num: $newPrime")
  println("Composite Num: $newCompo\n--")
  for (i in 0 until newCompo.size)
    println("${newCompo[i]}: ${compoDivs[i]}")
}

// OUTPUT
// Prime Num: [143, 145, 147, 149, 151, 153, 155, 157, 159, 161]
// Composite Num: [142, 144, 146, 148, 150, 152, 154, 156, 158, 160, 162]
// --
// 142: [1, 2, 71]
// 144: [1, 2, 3, 4, 6, 8, 9, 12, 16, 18, 24, 36, 48, 72]
// 146: [1, 2, 73]
// 148: [1, 2, 4, 37, 74]
// 150: [1, 2, 3, 5, 6, 10, 15, 25, 30, 50, 75]
// 152: [1, 2, 4, 8, 19, 38, 76]
// 154: [1, 2, 7, 11, 14, 22, 77]
// 156: [1, 2, 3, 4, 6, 12, 13, 26, 39, 52, 78]
// 158: [1, 2, 79]
// 160: [1, 2, 4, 5, 8, 10, 16, 20, 32, 40, 80]
// 162: [1, 2, 3, 6, 9, 18, 27, 54, 81]
