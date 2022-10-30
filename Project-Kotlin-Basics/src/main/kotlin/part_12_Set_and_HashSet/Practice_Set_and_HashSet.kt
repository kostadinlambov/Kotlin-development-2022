package part_12_Set_and_HashSet

fun main() {
//    Create an empty set of String colors
//    Add three colors.
//    Remove one.
//    Print out the result
    val colors = hashSetOf<String>()
    colors.add("red")
    colors.add("green")
    colors.add("blue")

    println(colors)

    colors.remove("blue")
    println(colors)

//    Create a set of the objects that are on your desk at the moment.
//    Create another set of the objects that you would remove if you were to clean your desk.
//    Print out the items that would remain.
    val objects = hashSetOf("Laptop", "Pens", "Monitor")
    val objectToRemove = setOf("Pens", "Monitor")
    objects.removeAll(objectToRemove)
    println(objects)

}