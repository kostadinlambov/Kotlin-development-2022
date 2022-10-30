package part_07_Operators_and_Booleans

fun main() {
//    A farmer has 3 cows, of which only one produces milk
//    He has two children
//    He is trying to apply for funding. The requirements are:
//            You must have no more than 5 animals
//            Animals must produce something that can be sold
//            Regardless of the other conditions, funding will be approved if the family has 3 or more members
//    Does the farmer receive the funding?

    val cows = 3
    val milkCows = 1
    val children = 2

    val result = (cows <= 5 && milkCows >= 1) || children + 1 >= 3
    println(result)

}