package part_11_List_and_ArrayList

fun main() {

//    Create a list of your favourite animals.
//    Print out how many animals you have in your list.
//    Print out the second element in that list.

    val animals = listOf("Cat", "Dog", "Bird")
    println(animals.size)
    println(animals[1])

//    Create an ArrayList of customers to your online store and add some customers.
//    A new customer has signed up, add them to the list.
//    A customer has chosen to close their account. Remove them from the list.

    val customers = arrayListOf("Peter", "Steffen", "John")
    println(customers)

    customers.add("Andreas")
    println(customers)

    customers.remove("John")
    println(customers)

}