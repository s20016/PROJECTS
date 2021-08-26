import kotlin.math.*

// Lesson 210525
// Kotlin Practice Problem 1

// (1) Given: Angle and Radius; Find: (x, y) coordinates
// (2) Given: (x, y) coordinates; Find: Angle (Theta) and Radius

// (1) Formula: x = rcos(θ); y = rsin(θ)
fun toCoordinate(radius: Double, theta: Double): Pair<Double, Double> {
  val theta = theta * (Math.PI / 180)
  val x = radius * cos(theta)
  val y = radius * sin(theta)
  return Pair(x, y)
}

// (2) Formula: radius = sqrt(x^2 + y^2); theta = arctan(x/y)
fun toPolar(x: Double, y: Double): Pair<Double, Double> {
  val radius = sqrt(x.pow(2) + y.pow(2))
  val theta = asin(y / radius) * (180 / Math.PI)
  return Pair(radius, theta)
}

fun main() {
  val (x, y) = toCoordinate(15.5, 45.0)
  val (radius, theta) = toPolar(x, y)

  println("$x, $y")
  println("$radius, $theta")

  // OUTPUT
  // 10.960155108391488, 10.960155108391486
  // 15.500000000000002, 44.99999999999999
}