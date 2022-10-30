package part_08_Nullability

fun main() {
//    A product costs 29.99.
//    Ask a user at the console how many products they want to buy.
//    If the read value is null, use the default of one.
//    Print the total of the purchase.

    val productPrice = 29.99

    println("Please enter an amount to buy: ")
    var amount = readLine()
    amount = null
    val amountInt = amount?.toInt()?:2

    val totalPrice = amountInt * productPrice

    println("TotalPrice: $totalPrice")


}