package chapter13

class Exceptions {
    fun handleInput() {
        print("Enter the first number: ")
        val num1 = readln().toInt()
        print("Enter an operator (+,-,*,/): ")
        val operator = readln()
        print("Enter thr second number: ")
        val num2 = readln().toInt()

        val result =
            when (operator) {
                "+" -> num1 + num2
                "-" -> num1 - num2
                "*" -> num1 * num2
                "/" -> num1 / num2
                else -> throw IllegalOperatorException(operator)
            }

        println("Result: $result")
    }
}

fun main() {
    // test code?
    val ex = Exceptions()
    while (true) {
        try {
            ex.handleInput()
        } catch (e: NumberFormatException) {
            println("Invalid input: ${e.message}")
        } catch (e: ArithmeticException) {
            println("Division by zero")
        } catch (e: IllegalOperatorException) {
            println("Illegal operator: ${e.message}")
        }
    }
}
