package part_12_Set_and_HashSet

fun main() {
//    You have a set of the first 10 prime numbers.
    val numbers = setOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
//    Is the number 21 a prime number? Print out the result.
    println(numbers.contains(21))
//    Is the number 13 a prime number? Print out the result
    println(numbers.contains(13))


//    Your favourite drinks are
    val myDrinks = hashSetOf("water", "coke", "beer", "orange juice")
//    Your partner’s favourite drinks are
    val theirDrinks = hashSetOf("water", "orange juice", "pineapple juice", "milk")
//    If you want to buy a drink that you both can enjoy, what are the options you have? Print out the result.
    myDrinks.retainAll(theirDrinks)
    println(myDrinks)
}