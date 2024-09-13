package chapter11

data class Person(
    val name: String,
    val age: Int,
)

fun main() {
    val john = Person("John", 30)

    println(john)

    val jane = john.copy(name = "Jane")
    val jane2 = Person("Jane", 30)

    println(jane == jane2)

    println(john.hashCode())
    println(jane.hashCode())
    println(jane2.hashCode())

    val (name, age) = jane
    println("$name, $age")
}
