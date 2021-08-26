import kotlin.math.abs

// Lesson 2 (210511)
// Kotlinスタートブック【第３章】

class Rational(n: Int, d: Int) {
  init {
    require(d != 0) { "Denominator must not be null" }
  }

  private val g by lazy { gcd(abs(n), abs(d)) }
  private val numerator: Int by lazy { n / g }
  private val denominator: Int by lazy { d / g }

//    operator fun plus(n: Int): Rational =
//        Rational(numerator + n * denominator, denominator)

  // Fraction
  fun add(that: Rational): Rational =
    Rational(
      numerator * that.denominator + that.numerator * denominator,
      denominator * that.denominator
    )

  fun sub(that: Rational): Rational =
    Rational(
      numerator * that.denominator - that.numerator * denominator,
      denominator * that.denominator
    )

  fun mul(that: Rational): Rational =
    Rational(
      numerator * that.numerator,
      denominator * that.denominator
    )

  fun div(that: Rational): Rational =
    Rational(
      numerator * that.denominator,
      denominator * that.numerator
    )

  override fun toString(): String = "${numerator}/${denominator}"
  private tailrec fun gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}

// operator fun Int.plus(r: Rational): Rational = r + this

fun main() {
  val (r1, r2, n1) = listOf(
    Rational(2, 3), Rational(3, 4), Rational(5, 1),
  )

  val operatorList = listOf("Addition", "Subtraction", "Multiplication", "Division")
  val mainList: List<MutableMap<String, Rational>> = listOf(
    mutableMapOf("R1+R2" to r1.add(r2), "N1+R1" to n1.add(r1), "R2+N1" to r2.add(n1)),
    mutableMapOf("R1-R2" to r1.sub(r2), "N1-R1" to n1.sub(r1), "R2-N1" to r2.sub(n1)),
    mutableMapOf("R1*R2" to r1.mul(r2), "N1*R1" to n1.mul(r1), "R2*N1" to r2.mul(n1)),
    mutableMapOf("R1/R2" to r1.div(r2), "N1/R1" to n1.div(r1), "R2/N1" to r2.div(n1))
  )

  println("R1=2/3, R2=3/4, N1=5\n")
  for (i in 0..3) println("${operatorList[i]}: ${mainList[i]}")
}

/*
    OUTPUT:
    R1=2/3, R2=3/4, N1=5

    Addition: {R1+R2=17/12, N1+R1=17/3, R2+N1=23/4}
    Subtraction: {R1-R2=-1/12, N1-R1=13/3, R2-N1=-17/4}
    Multiplication: {R1*R2=1/2, N1*R1=10/3, R2*N1=15/4}
    Division: {R1/R2=8/9, N1/R1=15/2, R2/N1=3/20}

 */
