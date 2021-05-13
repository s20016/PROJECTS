// Lesson 4 (210513)
// Kotlinスタートブック【第５章】

/*
    fun main()
    -> Entry point
 */

// Functions
fun sample1(i: Int): Int = i + 20
fun sample2(i: Int): Int = i * i
fun sample3(n: String): String = "Hello, $n"
fun sample4(n: String, a: Int): String = "Hello ${n}, $a"

fun sum(vararg numL: Int): Int {
    var sum = 0
    for (i in numL) sum += i
    return sum
}

fun sum2(num: List<Int>): Int =
    if (num.isEmpty()) 0
    else num.first() + sum2(num.drop(1))


//fun cal1(num: List<Int>): Int =
//    if (num.isEmpty()) 0
//    else

fun test1(numList: List<Int>): String {
    var num = ""
    for (i in numList) {
        num = when {
            i % 15 == 0 -> "FizzBuzz"
            i % 5 == 0 -> "Buzz"
            i % 3 == 0 -> "Fizz"
            else -> "$i"
        }
    println(num)
    }; return "END"
}

// Lambda
val square: (Int) -> Int = { i: Int ->
    i * i
}

// TODO: Entry Point
fun main() {
    println(square(32)) // 1024

    // val res = sample4("JC", 21)
    // println(sum(1, 2, 3, 4, 5))
    // println(sum(1, 2, 3, 4, 5)) // 15

    // println(sum2((0..10).toList())) // 55
    // println(test1((1..100).toList()))
}