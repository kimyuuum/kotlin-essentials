package chapter9

class Student(
    override val name: String,
    override val age: Int,
    override var canBuyAlcohol: Boolean,
) : Person {
    constructor(name: String, age: Int) : this(name, age, false) {
        canBuyAlcohol = age > 19
    }

    override fun helloText(): String {
        return "Hi"
    }

    override fun cheerText(person: Person): String {
        return "Hey ${person.name}, I am $name"
    }
}
