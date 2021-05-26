import kotlin.math.abs

// Lesson 210525-210526
// Kotlin Practice Problem 2

// (PROBLEM 1) GET DAY OF WEEK
fun getDay(x: List<Int>): String {
  val weekday = listOf("Mon", "Tues", "Wednes", "Thurs", "Fri", "Satur", "Sun")
  // ZELLER's FORMULA
  val doWeek = (x[2] + ((13/5) * (x[1] + 1)) + x[0] + (x[0]/4) + (x[0]/100) + 5*(x[0]/100)) % 7
  return "$x: ${weekday[doWeek]}day"
}

// (PROBLEM 2) GET DIFF BETWEEN 2 DATES
fun getDiff(x: List<Int>, y: List<Int>): String {
  val countOfDate1 = countDays(x[0], x[1], x[2])
  val countOfDate2 = countDays(y[0], y[1], y[2])
  val diffCount = Math.abs(countOfDate1 - countOfDate2)
  return "$x - $y: $diffCount Days"
}

// COUNT DAYS
fun countDays(Y: Int, M: Int, D: Int): Int {
  val monthDays = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
  var leapCount = Y / 4; leapCount -= Y / 100; leapCount += Y / 400
  var count = 365 * Y + D
  for (i in 0 until M - 1) count += monthDays[i]
  count += leapCount
  return count
}

// (PROBLEM 3) GET DATE BY ADDING n AMOUNT OF DAYS
fun getDate(x: List<Int>, n: Int): String {
  val monthDays = arrayListOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
  var leapCount = x[0] / 4; leapCount -= x[0] / 100; leapCount += x[0] / 400
  val countOfX = countDays(x[0], x[1], x[2]) + n
  var countY = countOfX / 365; if (countY >= 548) countY -= 1
  val countD = 365 - abs(((countOfX % 365) - leapCount))
  var (countD2, countD3, countM) = listOf(0, 0, 0)
  for (i in 0 until monthDays.count()) {
    for (j in 1 until monthDays[i] + 1) {
      if (countD2 != countD) { countD2 += 1; countD3 = j }
    }; if (countD2 == countD) { countM = i + 1; break }
  }
  val newDate = listOf(countY, countM, countD3)
  val doW = getDay(newDate); return doW
  // (╯°□°)╯︵ ┻━┻
}

fun main() {
  // TEST DATE (YYYY-MM-DD)
  val date1 = listOf(2000, 6, 20)
  val date2 = listOf(1999, 8, 10)

  // (1) FIND DAY OF THE WEEK
  println(getDay(date2))          // [1999, 8, 10]: Tuesday

  // (2) FIND DATE - DATE
  println(getDiff(date1, date2))  // [2000, 6, 20] - [1999, 8, 10]: 315 Days

  // (3) FIND DATE + n DAYS
  println(getDate(date2, 314)) // [2000, 6, 20]: Tuesday
}
