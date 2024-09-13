package chapter9

interface Person {
    val name: String
    val age: Int
    var canBuyAlcohol: Boolean

    fun helloText(): String

    fun cheerText(person: Person): String
}

fun main() {
    val businessman: Person = Businessman("John", 30)
    val student: Person = Student("Alice", 20)

    println(businessman.helloText())
    println(student.helloText())

    println(businessman.cheerText(student))
    println(student.cheerText(businessman))

    fun sayIfCanBuyAlcohol(person: Person) {
        val modal = if (person.canBuyAlcohol) "can" else "can't"
        println("${person.name} $modal buy alcohol")
    }

    sayIfCanBuyAlcohol(businessman)
    sayIfCanBuyAlcohol(student)
}
