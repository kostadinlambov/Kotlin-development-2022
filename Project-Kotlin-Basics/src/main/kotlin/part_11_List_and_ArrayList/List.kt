package part_11_List_and_ArrayList

fun main() {
    // List
    val colors = listOf("blue", "red", "yellow")
    println(colors)

    val colors2 = listOf<String>()
    println(colors2)

    val colors3 = listOf("blue", "red", "yellow", "blue", "blue", "green")
    println(colors3)

    val colors4 = listOf("blue", null, "red", null, "yellow", "blue", "blue", "green")
    println(colors4)

    println(colors[0])
    println(colors.get(1))
//    println(colors[5])

    println(colors3.size)
    println(colors4.size)

    // ArrayList (mutable List)
    println(colors)



}