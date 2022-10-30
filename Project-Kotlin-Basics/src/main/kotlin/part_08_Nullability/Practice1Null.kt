package part_08_Nullability

fun main() {
//    Declare a nullable variable of type String and give it a value.
//    Print out a substring of it, from position 3 to 6.
    val firstStr: String? = "testString"
    println(firstStr?.substring(3, 6))

//    Declare a nullable variable of type Double.
//    Multiply it by 6, convert it to a Float and print it to the console.
    val doubleVar: Double? = 20.58
    val floatNum = doubleVar?.times(6)?.toFloat()
    println(floatNum)
    println(floatNum!!::class.java)

//    Receive the name of the user from the console.
//    Print out the length of the name.
    println("Please enter your name: ")
    val name = readLine()
    println(name?.length)


}