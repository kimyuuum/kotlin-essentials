package chapter13

class IllegalOperatorException(operator: String) :
    Exception("Unknown operator: $operator")
