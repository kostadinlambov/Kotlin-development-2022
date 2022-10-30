package part_12_Set_and_HashSet

fun main() {
//    Your company has very strict dress code. Only certain color clothes can be worn in the office.
    val acceptedColors = hashSetOf("white", "black", "grey")

//    You have certain colors in your wardrobe.
    val myColors = hashSetOf("blue", "red", "black", "green")

//    What color clothes can you wear.
    acceptedColors.retainAll(myColors)
    println(acceptedColors)

//    Your company has added another color, "red" to their list. What options do you have now?
    acceptedColors.add("red")
    acceptedColors.retainAll(myColors)
    println(acceptedColors)

}