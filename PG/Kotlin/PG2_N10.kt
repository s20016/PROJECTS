// Lesson 210526
// Kotlin Practice Problem 1

// STACK: [A] PUSH -> [B][C][D]; [A] <- POP [B][D][D]
// QUEUE: [A] ENQ -> [B][C][D]; [A][B][C] -> DEQ [D]

class ListStack<E>(vararg items: E) {
  private val elements = items.toMutableList()
  fun push(element: E) = elements.add(element)
  fun pop(): E = elements.removeAt(elements.size - 1)
  override fun toString() = "[${elements.asReversed().joinToString()}]"
}

class ListQueue<E>(vararg items: E) {
  private val elements = items.toMutableList()
  fun enqueue(element: E) = elements.add(element)
  fun dequeue(): E = elements.removeAt(0)
  override fun toString() = "[${elements.asReversed().joinToString()}]"
}

fun <E> listStackOf(vararg elements: E) = ListStack(*elements)
fun <E> listQueueOf(vararg elements: E) = ListQueue(*elements)

fun main() {
  // STACK SAMPLE
  val stack = listStackOf('D', 'C', 'B')
  stack.push('A'); println("[A] PUSH -> $stack")
  stack.pop(); println("[A] POP <- $stack")

  // QUEUE SAMPLE
  val queue = listQueueOf('D', 'C', 'B')
  queue.enqueue('A'); println("[A] ENQ -> $queue")
  queue.dequeue(); println("$queue -> DEQ [D]")
}

// OUTPUT:
// STACK
// [A] PUSH -> [A, B, C, D]
// [A] POP <- [B, C, D]

// QUEUE
// [A] ENQ -> [A, B, C, D]
// [A, B, C] -> DEQ [D]

