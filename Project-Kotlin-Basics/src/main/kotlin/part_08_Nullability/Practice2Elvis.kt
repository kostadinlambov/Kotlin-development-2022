package part_08_Nullability

fun main() {
//    Read a message from the console.
//    Print out either the message or a default greeting.

    println("Please enter a message: ")
    val message = readLine()
    println(message?:"Hello World!")


//    Read a number from the console.
//    Assume you know that the user has entered a value, and the read variable is not null.
//    Multiply that number by 5 and print the result.

    println("Please enter a number: ")
    val number = readLine()

    println((number!!.toDouble().times(5)));



}