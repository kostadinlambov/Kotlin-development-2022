package part_07_Operators_and_Booleans

fun main() {
    println("Enter the amount of your bank account: ")
    val bankAmount = readLine() ?: "";
    val bankAmountDouble = bankAmount.toDouble();

//  The interest on that account is 5.5% per year.
    val interest =  5.5 / 100

//  How much would that user have in 5 years?
    val endAmount =
        bankAmountDouble + bankAmountDouble * interest
    println("Amount after 5 Jahren: $endAmount")

}