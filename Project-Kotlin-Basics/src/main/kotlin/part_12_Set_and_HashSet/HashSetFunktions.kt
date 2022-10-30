package part_12_Set_and_HashSet

fun main() {
    // Mutable set (HashSet)
    val numbers = hashSetOf(2, 5, 7, 5, 69)
    val numbers2 = setOf(38 , 7, 5, 56)
    numbers.retainAll(numbers2)
    println(numbers)

    numbers.clear()
    println(numbers)

//    var emptySet = hashSetOf<Int>()
//    println(emptySet)
//
//    val numbersNull = hashSetOf(2, 5, 7, null, 5, 69, null)
//    println(numbersNull)
//
//    numbers.add(44)
//    println(numbers)
//
//    val newNumbers = setOf(5, 58, 36)
//    numbers.addAll(newNumbers)
//    println(numbers)
//
//    numbers.remove(2)
//    println(numbers)
//
//    val numbersToRemove = setOf(5, 58, 36)
//    numbers.removeAll(numbersToRemove)
//    println(numbers)

}