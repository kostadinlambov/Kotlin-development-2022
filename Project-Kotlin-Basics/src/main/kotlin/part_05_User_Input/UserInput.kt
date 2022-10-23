package part_05_User_Input

fun main(args: Array<String>) {

    // Input a string
    println("Input something")
    val userInput = readLine()

    println("You wrote: $userInput")

    // Input a number
    println("Input some number")
    val userInputNumber = readLine()?:""
    var myNumber = userInputNumber.toInt()

    // Needs error handling
    println("Double number is: ${myNumber * 2}")

}

