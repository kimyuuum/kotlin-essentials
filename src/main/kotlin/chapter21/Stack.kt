package chapter21

class Stack<T> {
    private val stack = mutableListOf<T>()

    fun push(item: T): T {
        stack.add(item)
        return item
    }

    fun pop(): T? {
        if (stack.isEmpty()) {
            return null
        }

        val item = stack[stack.size - 1]
        stack.removeAt(stack.size - 1)
        return item
    }

    fun peek(): T? {
        return if (stack.isEmpty()) return null else stack[stack.size - 1]
    }

    fun isEmpty(): Boolean {
        return stack.isEmpty()
    }

    fun size(): Int {
        return stack.size
    }
}

fun main() {
    val intStack = Stack<Int>()
    intStack.push(1)
    intStack.push(2)
    intStack.push(3)

    val stringStack = Stack<String>()
    stringStack.push("A")
    stringStack.push("B")
    stringStack.push("C")

    println(intStack.peek()) // 3
    while (!intStack.isEmpty()) { // 3, 2, 1
        println(intStack.pop())
    }
    println(intStack.peek()) // null
    println(intStack.isEmpty()) // true

    println(stringStack.size()) // 3
    while (!stringStack.isEmpty()) { // C, B, A
        println(stringStack.pop())
    }
}
