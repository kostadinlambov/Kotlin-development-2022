package part_11_List_and_ArrayList

fun main() {

//    This is the list of winners of the men’s 100m race.
    val winners = listOf("Usain", "John", "Michael", "Alex", "Bob")
//    What place did Michael finish on?
    println(winners.indexOf("Michael") + 1)


//    A printer needs the colors red, green and blue to print.
//    A printer on your desk has the following colors available
    val availableColors = listOf("red", "blue")

//    Design a program that prints out a boolean value, on whether or not the printer can print.
    val requiredColors = listOf("red", "blue", "green")
    println(availableColors.containsAll(requiredColors))

//    A recipe calls for the following ingredients
//    - Chicken
//    - Egg
//    - Mozzarella
//    - Pepper
//    You decide to replace the Mozzarella with blue cheese
//    Print out the list of ingredients
    val ingredients = arrayListOf("Chicken", "Egg", "Mozzarella", "Pepper")
    println(ingredients)

    ingredients[2] = "blue cheese"
    println(ingredients)



}