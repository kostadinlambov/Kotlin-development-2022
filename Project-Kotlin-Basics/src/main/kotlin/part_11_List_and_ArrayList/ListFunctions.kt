package part_11_List_and_ArrayList

fun main() {
    val colors = listOf("blue", "red", "yellow", "blue")
    println(colors.size)
    println(colors.contains("red"))
    println(colors.contains("pink"))


    val newColors = listOf( "red", "yellow")
    println(colors.containsAll(newColors))

    val newColors2 = listOf( "red", "yellow", "pink")
    println(colors.containsAll(newColors2))


    println(colors.indexOf("blue"))
    println(colors.indexOf("pink"))
    println(colors.lastIndexOf("blue"))

}