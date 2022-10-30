package part_11_List_and_ArrayList

fun main() {
    val colors = arrayListOf("blue", "red", "yellow", "blue")
    colors.set(1, "redder")
    println(colors)

    val subList = colors.subList(1, 3)
    println(subList)
    println(subList::class.java)

    colors.clear()
    println(colors)

    println(colors.isEmpty())

}