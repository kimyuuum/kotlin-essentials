package chapter9

class Businessman(
    override val name: String,
    override val age: Int,
    override var canBuyAlcohol: Boolean,
) : Person {
    constructor(name: String, age: Int) : this(name, age, false) {
        canBuyAlcohol = age > 19
    }

    override fun helloText(): String {
        return "Good morning"
    }

    override fun cheerText(person: Person): String {
        return "Hello, my name is $name, nice to see you ${person.name}"
    }
}
