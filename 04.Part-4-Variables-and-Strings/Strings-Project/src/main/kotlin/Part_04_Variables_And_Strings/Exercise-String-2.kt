const val URL_LINK = "www.google.com"

fun main(args: Array<String>) {
    // String Practice
    val catName = "My cat’s name is \"Fluffy\""
    println("The catName variable length: ${catName.length}")

    val myCar = "My car won’t start"

    val indexOfCar = myCar.indexOf("car")
    val substCar = myCar.substring(indexOfCar, indexOfCar + 3)
    println(substCar)

    val clientName = "John"
    println("Hello $clientName")

    val apples = 3
    val oranges = 6
    println("Amount of fruits: ${apples + oranges}")

    // String Exercise
    val clientName2 = "Mary"
    val products = 3
    val price = 30

    println("The client $clientName2 have to pay ${price * products}")

    // Constants
    println("Accessing URL $URL_LINK")

}