package part_12_Set_and_HashSet

fun main() {
    val numbers = setOf(2, 5, 7, 5, 69)
    println(numbers)

    var emptySet = setOf<Int>()
    println(emptySet)

    val numbersNull = setOf(2, 5, 7, null, 5, 69, null)
    println(numbersNull)

}