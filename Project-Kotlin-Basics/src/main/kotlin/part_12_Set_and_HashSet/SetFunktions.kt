package part_12_Set_and_HashSet

fun main() {
    val numbers = setOf(2, 5, null, 7, 5, 69)
    println(numbers.size)
    println(numbers.contains(5))
    println(numbers.contains(24))

    println(numbers.containsAll(setOf( 5, 69, 35)))

    println(numbers.isEmpty())
    println(numbers)
}