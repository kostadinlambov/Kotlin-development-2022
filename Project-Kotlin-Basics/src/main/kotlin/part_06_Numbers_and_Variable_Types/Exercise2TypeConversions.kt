package part_06_Numbers_and_Variable_Types

fun main() {
    val pi = 3.14159

//  Ask the user to input a number of type double.
    println("Please input a number of type double")
    val userInput = readLine() ?: ""

//  Multiply it by pi
    val result = userInput.toDouble() * pi

//  Print the type of the resulting variable.
    println("$result type is ${result::class.java}")

//  Print the result.
    println(result)

}