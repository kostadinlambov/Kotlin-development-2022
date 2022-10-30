package part_11_List_and_ArrayList

fun main() {
    // Mutable List --> ArrayList
    val colors = arrayListOf("blue", "red", "yellow")
    println(colors)

    val noColors = arrayListOf<String>()
    // ArrayList (mutable List)
    println(noColors)

    colors.add("green")
    println(colors)

    val moreColors = arrayListOf("blue", "red", "pink")
    colors.addAll(moreColors)
    println(colors)

    // Remove
    colors.remove("red")
    println(colors)

    colors.removeAll(moreColors)
    println(colors)

    colors.removeAt(1)
    println(colors)

    colors.add("green")
    colors.add("pink")
    colors.add("green")

    colors.remove("green")
    println(colors)


}