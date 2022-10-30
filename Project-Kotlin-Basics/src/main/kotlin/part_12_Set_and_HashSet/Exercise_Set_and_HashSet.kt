package part_12_Set_and_HashSet

fun main() {
//    You have a list of customers for your online store.
    val customers = hashSetOf("Peter", "John", "Andreas")
//    A new customer has joined.
    customers.add("Steffen")
//    Print the list of customers.
    println(customers)
//    A customer has chosen to leave.
    customers.remove("Peter")
//    Print the list of customers.
    println(customers)

}