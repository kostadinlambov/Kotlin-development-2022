package part_08_Nullability

fun main() {
//    Read a number from the console and convert it to Double.
//    Multiply it by 7, and convert the result into a string.
//    Print the length of that string to the console.

    println("Please enter a number: ")
    var number = readLine()
    var doubleNum = number?.toDouble()
    println("doubleNum: $doubleNum")

    var strNumber = doubleNum?.times(7).toString()
    println("strNumber: $strNumber")
    println("strNumber.length: ${strNumber.length}")

}