package part_9_Exception_Handling

import java.lang.Exception

fun main() {
//    Read data from the console and convert it into a number
//    If possible, multiply it by 5 and print.
//    If an exception occurs, catch it and print a meaningful message.

    println("Enter a number: ")
    val input = readLine()
    try {
        val intNumber = input?.toInt()
        val product = intNumber?.times(5)
        println("Product: $product")
    } catch (e: Exception) {
        println("An exception has occurred!")
    }


//    The user must input how many kilometers they ran today.
//    Convert that value to miles.
//    Handle any exceptions that might occur.
//    1 kilometer = 0.62 miles
    println("Enter how many kilometers you ran today: ")
    val distance = readLine()
    try {
        val distanceDouble = distance?.toDouble()
        val distanceMiles = distanceDouble?.times(0.62)
        println("Distance: $distanceMiles Miles" )
    } catch (e: Exception) {
        println("An exception has occurred!")
        e.printStackTrace()
    }

}