package part_9_Exception_Handling

import java.lang.Exception

fun main() {
//    A customer will tell the program what product they want to buy.
//    Then, they will tell the program how many products they require.
//    Assume the price of the product is 9.99
//    What is the total?
//    Handle any exceptions that might occur.

    val price = 9.99
    println("how many products you require: ")
    val productCount = readLine()
    try {
        val productCountInt = productCount?.toInt()
        val total = productCountInt?.times(price)
        println("Total price: $total")
    } catch (e: Exception) {
        println("An exception has occurred!")
        e.printStackTrace()
    } finally {
        println("Transaction completed!")
    }

}