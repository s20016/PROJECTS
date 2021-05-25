// Lesson 210513-210518
// Kotlinスタートブック【第５～６章】

// Functions
fun sample1(i: Int) = i + 20
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
//fun test1(numList: List<Int>): String {
//  var num: String
//  for (i in numList) {
//    num = when {
//      i % 15 == 0 -> "FizzBuzz"
//      i % 5 == 0 -> "Buzz"
//      i % 3 == 0 -> "Fizz"
//      else -> "$i"
//    }
//    println(num)
//  }; return "END"
//}

// Lambda
val square: (Int) -> Int = { i: Int -> i * i }
val calAdd = { x: Int, y: Int -> x + y }
var getCounter = { count: Int -> count + 1 }
fun log(msg: Boolean = true, message: () -> String) {
  if (msg) println(message())
}

// 210518 ↓↓↓
inline fun forEach(str: String, f: (Char) -> Unit) {
  for (c in str) f(c)
}

fun containsDigit(str: String): Boolean {
  var res = false
  forEach(str) {
    if (it.isDigit()) res = true
  }; return res
}

fun add1(n: Int): Int = n + 1
fun twice(n: Int, f: (Int) -> Int): Int = f(f(n))
class Greeter1 {
  fun greet(name: String) { println("Hello ${name}!")}
}

class Person {
  private val name: String = "Hello"
  private val nameLength: Int
  get(): Int { return name.length }
}

// 210519 ↓↓↓
interface GreeterZ {
  fun sayHello(target: String)
}

class EnglishGreeterA: GreeterZ {
  val language = "English"
  override fun sayHello(target: String) {
    println("Hello, ${target}!")
  }
}
// --
interface Foo {
  fun execute()
}
open class SuperClass {
  open fun execute() {
    println("SuperClass")
  }
}
class FooSubClass:SuperClass(), Foo
class Container(var value: Any)

// 210525 ↓↓↓
fun myFunc(x: Int, y: Int): Pair<Int, Int> {
  val a = x + y
  val b = x - y
  return Pair(a, b)
}

fun main() {
  // TODO: Entry Point ↓↓↓
  // 210525 ↓↓↓

  val (a, b, c) = object {
    operator fun component1(): String = "Hello"
    operator fun component2(): Int = 12345
    operator fun component3(): List<Char> = listOf('A', 'B')
  }; println("$a, $b, $c") // Hello, 12345, [A, B]

//  val (name, age) = Pair<String, Int>("JC", 21)
//  println("$name, $age") // JC, 21

//  val (u, v) = myFunc(10, 20)
//  println("$u, $v") // 30, -10
//
//  println(5 shl 2) // 20: 00000101 -> 00010100
//  println(3 shr 1) // 1: 00000011 -> 00000001
//  println(0b1010 ushr 1) // 5
//  println((10 downTo 0 step 2).toList()) // [10, 8, 6, 4, 2, 0]
//  println((0..100).step(20).toList()) // [0, 20, 40, 60, 80, 100]

  // 210519 ↓↓↓
//  val list2: List<Any> = listOf(123, "Hello")
//  list2.forEach{ i -> println(i::class.simpleName) }
  // Int\nString\n

  // val sampleA = FooSubClass()
  // sampleA.execute()

  // val sampleGreet = EnglishGreeter()
  // sampleGreet.sayHello("World")

  // 210518 ↓↓↓
  // val a = Greeter()
  //a.greet("Kotlin")

  // val got = twice(5, ::add1); println(got)
  // println(containsDigit("abc"))
  // log{"Message 1"} // Message 1
  // log(false){"Message 2"}

  //val counter1 = getCounter(0); println(counter1)
  // val res = calAdd(25, 25); println(res)
  //println(square(32)) // 1024

  // 210514 ↓↓↓
  // val res = sample4("JC", 21)
  // println(sum(1, 2, 3, 4, 5))
  // println(sum(1, 2, 3, 4, 5)) // 15

  // println(sum2((0..10).toList())) // 55
  // println(test1((1..100).toList()))
}