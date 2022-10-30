package part_11_List_and_ArrayList

fun main() {
//    A zoo has a list of animals.
    val animals = arrayListOf("lion", "zebra", "chimp", "elephant")
//    A new panda bear cub has arrived.
    animals.add("panda bear")
//    Print out the new list of animals.
    println(animals)
//    The lion has been sold to a different zoo.
    animals.remove("lion")
//    Print out the new list of animals.
    println(animals)
//    Does the zoo have both elephants and giraffes?

    val newAnimals = arrayListOf("elephant", "giraffe")
    println(animals.containsAll(newAnimals))

}