package part_06_Numbers_and_Variable_Types

fun main() {
    //    Ask the user to input a number and read it into a variable.
    println("Please input a number")
    val userInput = readLine() ?: ""

    //    Convert it to an integer.
    val userInputInt = userInput.toInt()
    println(userInputInt::class.java)

    //    Multiply that value with a double variable that you created.
    val doubleNum =  2.539
    val multipliedVar = userInputInt * doubleNum
    //    What is the type of the new variable?
    //    Print it to the console.
    println(multipliedVar)
    println(multipliedVar::class.java)

}