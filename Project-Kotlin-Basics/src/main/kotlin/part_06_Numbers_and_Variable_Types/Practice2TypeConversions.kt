package part_06_Numbers_and_Variable_Types

fun main() {
//    Ask the user for a number, and read the input.
//    Convert that value to
//            A byte
//            A short
//            An int
//            A long
//            A float
//            A double

    println("Please input a value: ")
    val userInput = readLine() ?: ""

    val userInputByte = userInput.toByte()
    println(userInputByte::class.java)
    println(userInputByte)

    val userInputShort = userInput.toShort()
    println(userInputShort::class.java)
    println(userInputShort)

    val userInputInt = userInput.toInt()
    println(userInputInt::class.java)
    println(userInputInt)

    val userInputLong = userInput.toLong()
    println(userInputLong::class.java)
    println(userInputLong)

    val userInputFloat = userInput.toFloat()
    println(userInputFloat::class.java)
    println(userInputFloat)

    val userInputDouble = userInput.toDouble()
    println(userInputDouble::class.java)
    println(userInputDouble)

//    You have the variable
//       var pi = 4.14159
//    What is the type?
//    Convert it to a float. What is the value? Print it.
//    Convert it to an int. What is the value? Print it.
//    Convert it to a string. What is the value? Print it.

    var pi = 4.14159
    println(pi::class.java)

    val piFloat = pi.toFloat()
    println(piFloat::class.java)
    println(piFloat)

    val piInt = pi.toInt()
    println(piInt::class.java)
    println(piInt)

    val piString = pi.toString()
    println(piString::class.java)
    println(piString)


}