package part_05_User_Input

fun main(args: Array<String>) {
    // Task 1: Write a program that asks the user for their name and prints out a personalized greeting
    println("Input your name:")
    val userName = readLine();
    println("Hello $userName")

    // Task 2: Write a program that asks the user for a number and prints out that number multiplied by 5
    println("Input a number:")
    val number = readLine() ?: "";
    val result = number.toInt() * 5
    println("Your number multiplied by 5 is: $result")
}