// Lesson 210519
// Kotlinスタートブック【第１０章】

// List 10.1 - 10.2
interface GreeterA {
  val language: String
  fun sayHello(target: String)
}

open class EnglishGreeter: GreeterA {
  override val language = "English"
  override fun sayHello(target: String) {
    println("Hello ${target}!")
  }
}

// List 10.9 - 10.10
interface GreeterB {
  fun sayHello(target: String)
  fun sayHello()
}

class EnglishGreeterWithRecording: EnglishGreeter() {
  //  private val _targets: MutableSet<String> = mutableSetOf()
  private var _targets: List<String> = listOf()

  val target: List<String>
    get() = _targets

  override fun sayHello(target: String) {
    _targets += target
    super.sayHello(target)
  }
}

fun main() {
  val greeter = EnglishGreeterWithRecording()
  val names: List<String> = listOf("A", "B", "C")
  names.forEach{ i -> greeter.sayHello(i) }
}

// OUTPUT:
// Hello A!
// Hello B!
// Hello C!

