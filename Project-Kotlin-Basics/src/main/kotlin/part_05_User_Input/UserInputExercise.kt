package part_05_User_Input

fun main(args: Array<String>) {
//    Create a program that asks a user’s birth year.
//    Then prints out the user’s estimated age
//    (currentYear - birthYear)

    println("Input your birth year:")
    val birthYear = readLine()?:"";
    val age = 2022 - birthYear.toInt();
    println("You are either ${age - 1} or $age age old")

}