package part_06_Numbers_and_Variable_Types

fun main(args: Array<String>) {

    var price = 34
    var items = 3
    var totalPrice = price * items

    println(totalPrice)

    println(totalPrice::class.java)

    var doubleNum = 3.14589

    println(doubleNum::class.java)

    // Type conversions
    var cats = 3
    println(cats::class.java)

    val catsToLong = cats.toLong()
    println(catsToLong)
    println(catsToLong::class.java)

    //#####################
    val people = 7500000000
    println(people)
    println(people::class.java)
    // Causes data corruption
    val fewPeople = people.toInt()
    println(fewPeople)
    println(fewPeople::class.java)

}

