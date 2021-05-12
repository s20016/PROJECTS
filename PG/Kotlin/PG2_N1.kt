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
    private tailrec fun gcd(a: Int, b: Int): Int =
        if (b == 0) a else gcd(b, a % b)
}

operator fun Int.plus(r: Rational): Rational = r + this

fun main() {
    val w = Rational(1, 2)
    val x = Rational(3, 2)
    val y = Rational(2, 3)
    val z = Rational(2, 1)

    val numL: HashMap<String, Rational> = hashMapOf(
        "w*x" to w.mul(x),
        "x*y" to x.mul(y),
        "y*z" to y.mul(z),
        "z*w" to z.mul(w)
    )
    println("Multiplication: $numL")
}

// OUTPUT
// Multiplication: {y*z=4/3, w*x=3/4, x*y=1/1, z*w=1/1}
// Division: {w/x=1/3, x/y=9/4, z/w=4/1, y/z=1/3}
// Addition: {y+z=8/3, w+x=2/1, x+y=13/6, z+w=5/2
// Subtraction: {w-x=-1/1, x-y=5/6, z-w=3/2, y-z=-4/3}
