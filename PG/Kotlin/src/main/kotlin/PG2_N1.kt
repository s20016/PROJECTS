// Lesson 2 (210510)
// Kotlinスタートブック【第３章】

class Rational(n: Int, d: Int) {
    init {
        require(d != 0, {"Denominator must not be null"})
    }
    private val g by lazy { gcd(Math.abs(n), Math.abs(d)) }
    val numerator: Int by lazy { n / g }
    val denominator: Int by lazy { d / g }

    // Whole Number
    operator fun plus(n: Int): Rational =
        Rational(numerator + n * denominator, denominator)

    // Fraction
    fun plus(that: Rational): Rational =
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
    tailrec private fun gcd(a: Int, b: Int): Int =
        if (b == 0) a else gcd(b, a % b)
}

operator fun Int.plus(r: Rational): Rational = r + this

fun main() {
    val A = Rational(3, 4)
    val B = Rational(3, 4)

    println(A.plus(B))
}
